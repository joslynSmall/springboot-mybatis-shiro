package cn.seits.modules.business.cm.model.project.bo;

import cn.seits.common.bo.BaseQueryBo;
import cn.seits.modules.business.cm.model.project.Project;

public class ProjectQueryBo extends BaseQueryBo{
    private String projectName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
