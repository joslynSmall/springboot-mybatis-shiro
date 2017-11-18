package cn.seits.modules.business.cm.service.projectService;

import cn.seits.common.services.IBaseService;

public interface IProjectService<ProjectKey, Project, ProjectExample> extends IBaseService<ProjectKey, Project, ProjectExample>{
    int insertOrtherTest(Project record);
}
