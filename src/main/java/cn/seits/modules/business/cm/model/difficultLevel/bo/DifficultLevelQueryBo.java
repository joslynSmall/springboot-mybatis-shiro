package cn.seits.modules.business.cm.model.difficultLevel.bo;

import cn.seits.common.bo.BaseQueryBo;

public class DifficultLevelQueryBo extends BaseQueryBo {

    private  String difficultyLevelName;

    public String getDifficultyLevelName() {
        return difficultyLevelName;
    }

    public void setDifficultyLevelName(String difficultyLevelName) {
        this.difficultyLevelName = difficultyLevelName;
    }
}
