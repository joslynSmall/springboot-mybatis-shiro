package cn.seits.modules.business.cm.service.pageService.impl;

import cn.seits.modules.business.cm.dao.crud.moduleMapper.ModuleMapper;
import cn.seits.modules.business.cm.dao.crud.pageMapper.PageMapper;
import cn.seits.modules.business.cm.dao.crud.projectMapper.ProjectMapper;
import cn.seits.modules.business.cm.model.module.ModuleKey;
import cn.seits.modules.business.cm.model.page.Page;
import cn.seits.modules.business.cm.model.page.PageExample;
import cn.seits.modules.business.cm.model.page.PageKey;
import cn.seits.modules.business.cm.model.page.bo.PageDvol;
import cn.seits.modules.business.cm.model.project.ProjectKey;
import cn.seits.modules.business.cm.service.pageService.IPageService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PageService implements IPageService<PageKey, Page, PageExample>{
    @Autowired
    private PageMapper pageMapper;
    @Autowired
    private ModuleMapper moduleMapper;
    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public int countByExample(PageExample example) {
        return pageMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(PageExample example) {
        return pageMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(PageKey key) {
        return pageMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(Page record) {
        return pageMapper.insert(record);
    }

    @Override
    public int insertSelective(Page record) {
        return pageMapper.insertSelective(record);
    }

    @Override
    public List<Page> selectByExample(PageExample example) {
        return pageMapper.selectByExample(example);
    }

    @Override
    public Page selectByPrimaryKey(PageKey key) {
        return pageMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(Page record, PageExample example) {
        return pageMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Page record, PageExample example) {
        return pageMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Page record) {
        return pageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Page record) {
        return pageMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insertOrtherTest(Page record) {
        return 0;
    }

    /**
     * 列表展示页面
     * @param example
     * @return
     */
    @Override
    public List<PageDvol> selectPageList(PageExample example) {
        List<PageDvol> listDvol=new ArrayList<PageDvol>();
        List<Page> list=pageMapper.selectByExample(example);
        ProjectKey projectKey=new ProjectKey();
        ModuleKey moduleKey=new ModuleKey();
        if(list.size()>0){
            for (Page page: list){
                PageDvol pageDvol=new PageDvol();
                projectKey.setProjectId(page.getProjectId());
                moduleKey.setModuleId(page.getModuleId());
                if(moduleMapper.selectByPrimaryKey(moduleKey)!=null ){
                    pageDvol.setModuleName(moduleMapper.selectByPrimaryKey(moduleKey).getModuleName());
                }else {
                    pageDvol.setModuleName(page.getModuleId());
                }
                if(projectMapper.selectByPrimaryKey(projectKey)!=null){
                    pageDvol.setProjectName(projectMapper.selectByPrimaryKey(projectKey).getProjectName());
                }else {
                    pageDvol.setProjectName(page.getProjectId());
                }
                BeanUtils.copyProperties(page,pageDvol);
                listDvol.add(pageDvol);
            }
        }
        return listDvol;
    }
}
