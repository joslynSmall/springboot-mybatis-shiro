package cn.seits.modules.business.cm.web.controller.projectController;

import cn.seits.common.utils.R;
import cn.seits.modules.business.cm.model.project.Project;
import cn.seits.modules.business.cm.model.project.ProjectExample;
import cn.seits.modules.business.cm.model.project.ProjectKey;
import cn.seits.modules.business.cm.model.project.bo.ProjectQueryBo;
import cn.seits.modules.business.cm.service.projectService.IProjectService;
import cn.seits.modules.sys.controller.AbstractController;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by guanwangwei on 2017/10/12.
 */
@RestController
@RequestMapping("/project")
public class ProjectAsynController extends AbstractController {
    @Autowired
    private IProjectService projectService;

    /**
     * 新增
     * @param record
     * @return
     */
    @RequestMapping("/insert")
    //@RequiresPermissions("basic:project:add")
    public R insertBugLevel(Project record) {
        int dataCode = projectService.insert(record);
        return R.ok();
    }

    /**
     * 修改
     * @param record
     * @return
     */
    @RequestMapping("/update")
    public R updateBugLevel(Project record,ProjectKey key) {
        BeanUtils.copyProperties(key, record);
        projectService.updateByPrimaryKeySelective(record);
        return R.ok();
    }

    /**
     * 删除
     * @param key
     * @return
     */
    @RequestMapping("/delete")
    public R deleteBugLevel(ProjectKey key) {
        projectService.deleteByPrimaryKey(key);
        return R.ok();
    }

    /**
     * 查看单个实体
     * @param key
     * @return
     */
    @RequestMapping("/getProjectInfo")
    public R getPageInfo( ProjectKey key) {
        projectService.selectByPrimaryKey(key);
        return R.ok();
    }

    /**
     * 分页查询
     * @param queryBo
     * @return
     */
    @RequestMapping("/projectPageInfo")
    public R getPageInfo(ProjectQueryBo queryBo) {
        PageHelper.startPage(queryBo.getPageNum(), queryBo.getPageSize(), true);

        ProjectExample example = new ProjectExample();
        ProjectExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(queryBo.getProjectName())){
            criteria.andProjectNameLike("%"+queryBo.getProjectName()+"%");
        }
        List<Project> list = this.projectService.selectByExample(example);
        PageInfo pageInfo =  new PageInfo<Project>(list);
        return R.ok().put("page",pageInfo);
    }
}
