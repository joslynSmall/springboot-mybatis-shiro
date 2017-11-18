package cn.seits.modules.business.bp.model.bugRecord;

public class BugRecordKey
{
    /**
     * Bug编号
     */
    private String bugId;

    /**
     * 获取Bug编号
     */
    public String getBugId() {
        return bugId;
    }

    /**
     * 设置Bug编号
     */
    public void setBugId(String bugId) {
        this.bugId = bugId == null ? null : bugId.trim();
    }
}