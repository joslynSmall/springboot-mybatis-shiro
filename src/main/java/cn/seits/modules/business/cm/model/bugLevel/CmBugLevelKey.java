package cn.seits.modules.business.cm.model.bugLevel;

public class CmBugLevelKey {
    /**
     * Bug等级Id
     */
    private String bugLevelId;

    /**
     * 获取Bug等级Id
     */
    public String getBugLevelId() {
        return bugLevelId;
    }

    /**
     * 设置Bug等级Id
     */
    public void setBugLevelId(String bugLevelId) {
        this.bugLevelId = bugLevelId == null ? null : bugLevelId.trim();
    }
}