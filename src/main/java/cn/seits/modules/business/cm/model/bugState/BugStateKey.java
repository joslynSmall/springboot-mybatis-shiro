package cn.seits.modules.business.cm.model.bugState;

public class BugStateKey {
    /**
     * Bug状态ID
     */
    private String bugStateId;

    /**
     * 获取Bug状态ID
     */
    public String getBugStateId() {
        return bugStateId;
    }

    /**
     * 设置Bug状态ID
     */
    public void setBugStateId(String bugStateId) {
        this.bugStateId = bugStateId == null ? null : bugStateId.trim();
    }
}