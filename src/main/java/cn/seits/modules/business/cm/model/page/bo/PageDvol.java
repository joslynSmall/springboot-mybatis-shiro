package cn.seits.modules.business.cm.model.page.bo;

import cn.seits.modules.business.cm.model.page.Page;

public class PageDvol extends Page{
    private String projectName;
    private String moduleName;

    public String getProjectName() {
        return projectName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
}
