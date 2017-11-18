package cn.seits.modules.business.cm.web.controller.groupAsynController;

import cn.seits.common.utils.R;
import cn.seits.modules.business.cm.model.group.Group;
import cn.seits.modules.business.cm.model.group.GroupExample;
import cn.seits.modules.business.cm.model.group.GroupKey;
import cn.seits.modules.business.cm.model.group.bo.GroupDvol;
import cn.seits.modules.business.cm.model.group.bo.GroupQueryBo;
import cn.seits.modules.business.cm.model.module.Module;
import cn.seits.modules.business.cm.model.module.ModuleExample;
import cn.seits.modules.business.cm.model.module.ModuleKey;
import cn.seits.modules.business.cm.model.module.bo.ModuleQueryBo;
import cn.seits.modules.business.cm.service.groupService.IGroupService;
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
@RequestMapping("/group")
public class GroupAsynController extends AbstractController {
    @Autowired
    private IGroupService groupService;

    /**
     * 新增
     * @param record
     * @return
     */
    @RequestMapping("/insert")
    //@RequiresPermissions("basic:group:add")
    public R insertGroup(Group record) {
        int dataCode = groupService.insert(record);
        return R.ok();
    }

    /**
     * 修改
     * @param record
     * @return
     */
    @RequestMapping("/update")
    public R updateGroup(Group record, GroupKey key) {
        BeanUtils.copyProperties(key, record);
        groupService.updateByPrimaryKeySelective(record);
        return R.ok();
    }

    /**
     * 删除
     * @param key
     * @return
     */
    @RequestMapping("/delete")
    public R deleteGroup(GroupKey key) {
        groupService.deleteByPrimaryKey(key);
        return R.ok();
    }

    /**
     * 查看单个实体
     * @param key
     * @return
     */
    @RequestMapping("/getGroupInfo")
    public R getGroupInfo( GroupKey key) {
        groupService.selectByPrimaryKey(key);
        return R.ok();
    }

    /**
     * 分页查询
     * @param queryBo
     * @return
     */
    @RequestMapping("/groupPageInfo")
    public R getGroupPageInfo(GroupQueryBo queryBo) {
        PageHelper.startPage(queryBo.getPageNum(), queryBo.getPageSize(), true);

        GroupExample example = new GroupExample();
        GroupExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(queryBo.getGroupName())){
            criteria.andGroupNameLike("%"+queryBo.getGroupName()+"%");
        }
        List<GroupDvol> list = this.groupService.selectGroupList(example);
        PageInfo pageInfo =  new PageInfo<GroupDvol>(list);
        return R.ok().put("page",pageInfo);
    }
}
