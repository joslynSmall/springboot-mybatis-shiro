package cn.seits.modules.business.cm.web.controller.pageController;

import cn.seits.common.utils.R;
import cn.seits.modules.business.cm.model.page.Page;
import cn.seits.modules.business.cm.model.page.PageExample;
import cn.seits.modules.business.cm.model.page.PageKey;
import cn.seits.modules.business.cm.model.page.bo.PageDvol;
import cn.seits.modules.business.cm.model.page.bo.PageQueryBo;
import cn.seits.modules.business.cm.service.pageService.IPageService;
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
@RequestMapping("/page")
public class PageAsynController extends AbstractController {
    @Autowired
    private IPageService pageService;

    /**
     * 新增
     * @param record
     * @return
     */
    @RequestMapping("/insert")
    //@RequiresPermissions("basic:page:add")
    public R insertBugLevel(Page record) {
        int dataCode = pageService.insert(record);
        return R.ok();
    }

    /**
     * 修改
     * @param record
     * @return
     */
    @RequestMapping("/update")
    public R updateBugLevel(Page record, PageKey key) {
        BeanUtils.copyProperties(key, record);
        pageService.updateByPrimaryKeySelective(record);
        return R.ok();
    }

    /**
     * 删除
     * @param key
     * @return
     */
    @RequestMapping("/delete")
    public R deleteBugLevel(PageKey key) {
        pageService.deleteByPrimaryKey(key);
        return R.ok();
    }

    /**
     * 查看单个实体
     * @param key
     * @return
     */
    @RequestMapping("/getPageInfo")
    public R getPageInfo( PageKey key) {
        pageService.selectByPrimaryKey(key);
        return R.ok();
    }

    /**
     * 分页查询
     * @param queryBo
     * @return
     */
    @RequestMapping("/pagePageInfo")
    public R getPageInfo(PageQueryBo queryBo) {
        PageHelper.startPage(queryBo.getPageNum(), queryBo.getPageSize(), true);

        PageExample example = new PageExample();
        PageExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(queryBo.getPageName())){
            criteria.andPageNameLike("%"+queryBo.getPageName()+"%");
        }
        List<PageDvol> list = this.pageService.selectPageList(example);
        PageInfo pageInfo =  new PageInfo<PageDvol>(list);
        return R.ok().put("page",pageInfo);
    }

}
