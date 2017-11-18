package cn.seits.modules.business.cm.model.group.bo;

import cn.seits.common.bo.BaseQueryBo;

public class GroupQueryBo extends BaseQueryBo{
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
