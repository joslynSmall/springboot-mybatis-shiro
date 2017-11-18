package cn.seits.modules.business.cm.model.duty.bo;

import cn.seits.common.bo.BaseQueryBo;

public class CmDutyQueryBo extends BaseQueryBo {

    private String dutyName;

    public String getDutyName() {
        return dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }
}
