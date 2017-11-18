package cn.seits.modules.business.cm.model.overtimeTime.bo;

import cn.seits.common.bo.BaseQueryBo;

public class OvertimeTimeQueryBo extends BaseQueryBo {
    private  String overtimetimeName;

    public String getOvertimetimeName() {
        return overtimetimeName;
    }

    public void setOvertimetimeName(String overtimetimeName) {
        this.overtimetimeName = overtimetimeName;
    }
}
