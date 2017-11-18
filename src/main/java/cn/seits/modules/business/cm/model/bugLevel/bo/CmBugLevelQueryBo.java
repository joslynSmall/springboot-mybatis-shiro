package cn.seits.modules.business.cm.model.bugLevel.bo;


import cn.seits.common.bo.BaseQueryBo;

/**
 * Created by joslyn on 2017/9/14.
 */
public class CmBugLevelQueryBo extends BaseQueryBo {

    private String bugLevelName;

    public String getBugLevelName() {
        return bugLevelName;
    }

    public void setBugLevelName(String bugLevelName) {
        this.bugLevelName = bugLevelName;
    }
}
