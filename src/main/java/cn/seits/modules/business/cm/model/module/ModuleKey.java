package cn.seits.modules.business.cm.model.module;

public class ModuleKey {
    /**
     * 模块Id
     */
    private String moduleId;

    /**
     * 获取模块Id
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * 设置模块Id
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }
}