package cn.seits.modules.business.cm.model.technologyPreference;

import java.util.Date;

public class TechnologyPreference extends TechnologyPreferenceKey {
    /**
     * 技术名称
     */
    private String technologypreferenceName;

    /**
     * 技术描述
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
     * 获取技术名称
     */
    public String getTechnologypreferenceName() {
        return technologypreferenceName;
    }

    /**
     * 设置技术名称
     */
    public void setTechnologypreferenceName(String technologypreferenceName) {
        this.technologypreferenceName = technologypreferenceName == null ? null : technologypreferenceName.trim();
    }

    /**
     * 获取技术描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置技术描述
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