package cn.seits.modules.business.cm.model.duty;

import java.util.Date;

public class Duty extends DutyKey {
    /**
     * 职位名称
     */
    private String dutyName;

    /**
     * 职位描述
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取职位名称
     */
    public String getDutyName() {
        return dutyName;
    }

    /**
     * 设置职位名称
     */
    public void setDutyName(String dutyName) {
        this.dutyName = dutyName == null ? null : dutyName.trim();
    }

    /**
     * 获取职位描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置职位描述
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}