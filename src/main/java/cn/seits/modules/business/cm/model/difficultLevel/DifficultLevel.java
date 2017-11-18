package cn.seits.modules.business.cm.model.difficultLevel;

import java.util.Date;

public class DifficultLevel extends DifficultLevelKey {
    /**
     * 难度等级名称
     */
    private String difficultyLevelName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 获取难度等级名称
     */
    public String getDifficultyLevelName() {
        return difficultyLevelName;
    }

    /**
     * 设置难度等级名称
     */
    public void setDifficultyLevelName(String difficultyLevelName) {
        this.difficultyLevelName = difficultyLevelName == null ? null : difficultyLevelName.trim();
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