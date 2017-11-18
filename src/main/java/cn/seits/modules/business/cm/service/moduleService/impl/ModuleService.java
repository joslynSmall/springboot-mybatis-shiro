package cn.seits.modules.business.cm.service.moduleService.impl;

import cn.seits.modules.business.cm.dao.crud.moduleMapper.ModuleMapper;
import cn.seits.modules.business.cm.dao.crud.projectMapper.ProjectMapper;
import cn.seits.modules.business.cm.model.module.Module;
import cn.seits.modules.business.cm.model.module.ModuleExample;
import cn.seits.modules.business.cm.model.module.ModuleKey;
import cn.seits.modules.business.cm.model.module.bo.ModuleDvol;
import cn.seits.modules.business.cm.model.project.ProjectKey;
import cn.seits.modules.business.cm.service.moduleService.IModuleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModuleService implements IModuleService<ModuleKey, Module, ModuleExample>{
    @Autowired
    private ModuleMapper moduleMapper;
    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public int countByExample(ModuleExample example) {
        return moduleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ModuleExample example) {
        return moduleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(ModuleKey key) {
        return moduleMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(Module record) {
        return moduleMapper.insert(record);
    }

    @Override
    public int insertSelective(Module record) {
        return moduleMapper.insertSelective(record);
    }

    @Override
    public List<Module> selectByExample(ModuleExample example) {
        return moduleMapper.selectByExample(example);
    }

    @Override
    public Module selectByPrimaryKey(ModuleKey key) {
        return moduleMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(Module record, ModuleExample example) {
        return moduleMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Module record, ModuleExample example) {
        return moduleMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Module record) {
        return moduleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Module record) {
        return moduleMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insertOrtherTest(Module record) {
        return 0;
    }

    /**
     * 列表展示页面
     * @param example
     * @return
     */
    @Override
    public List<ModuleDvol> selectModuleList(ModuleExample example) {
        List<ModuleDvol> listDvol=new ArrayList<ModuleDvol>();
        List<Module> list=moduleMapper.selectByExample(example);
        ProjectKey projectKey=new ProjectKey();
        if(list.size()>0){
            for (Module module: list){
                ModuleDvol moduleDvol=new ModuleDvol();
                projectKey.setProjectId(module.getProjectId());
                if(projectMapper.selectByPrimaryKey(projectKey)!=null){
                    moduleDvol.setProjectName(projectMapper.selectByPrimaryKey(projectKey).getProjectName());
                }else{
                    moduleDvol.setProjectName(module.getProjectId());
                }
                BeanUtils.copyProperties(module,moduleDvol);
                listDvol.add(moduleDvol);
            }
        }
        return listDvol;
    }
}
