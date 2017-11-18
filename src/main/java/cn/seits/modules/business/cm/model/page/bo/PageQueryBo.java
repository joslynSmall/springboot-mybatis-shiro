package cn.seits.modules.business.cm.model.page.bo;

import cn.seits.common.bo.BaseQueryBo;

public class PageQueryBo extends BaseQueryBo{
    private String pageName;
    private String moduleName;
    private String projectName;

    public String getPageName() {
        return pageName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
