package cn.seits.modules.business.cm.model.group;

public class GroupKey {
    /**
     * 项目组Id
     */
    private String groupId;

    /**
     * 获取项目组Id
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 设置项目组Id
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }
}