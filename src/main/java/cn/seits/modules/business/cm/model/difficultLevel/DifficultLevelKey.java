package cn.seits.modules.business.cm.model.difficultLevel;

public class DifficultLevelKey {
    /**
     * 难度等级Id
     */
    private String difficultyLevelId;

    /**
     * 获取难度等级Id
     */
    public String getDifficultyLevelId() {
        return difficultyLevelId;
    }

    /**
     * 设置难度等级Id
     */
    public void setDifficultyLevelId(String difficultyLevelId) {
        this.difficultyLevelId = difficultyLevelId == null ? null : difficultyLevelId.trim();
    }
}