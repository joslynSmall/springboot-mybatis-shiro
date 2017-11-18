package cn.seits.modules.business.cm.service.projectService.impl;

import cn.seits.modules.business.cm.dao.crud.projectMapper.ProjectMapper;
import cn.seits.modules.business.cm.model.project.Project;
import cn.seits.modules.business.cm.model.project.ProjectExample;
import cn.seits.modules.business.cm.model.project.ProjectKey;
import cn.seits.modules.business.cm.service.projectService.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService implements IProjectService<ProjectKey, Project, ProjectExample>{
    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public int countByExample(ProjectExample example) {
        return projectMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ProjectExample example) {
        return projectMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(ProjectKey key) {
        return projectMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(Project record) {
        return projectMapper.insert(record);
    }

    @Override
    public int insertSelective(Project record) {
        return projectMapper.insertSelective(record);
    }

    @Override
    public List<Project> selectByExample(ProjectExample example) {
        return projectMapper.selectByExample(example);
    }

    @Override
    public Project selectByPrimaryKey(ProjectKey key) {
        return projectMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(Project record, ProjectExample example) {
        return projectMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Project record, ProjectExample example) {
        return projectMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Project record) {
        return projectMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Project record) {
        return projectMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insertOrtherTest(Project record) {
        return 0;
    }
}
