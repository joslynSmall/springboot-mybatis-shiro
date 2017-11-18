package cn.seits.modules.business.cm.model.technologyPreference.bo;

import cn.seits.common.bo.BaseQueryBo;

public class TechnologyPreferenceQueryBo extends BaseQueryBo{
    private String technologyPreferenceName;

    public String getTechnologyPreferenceName() {
        return technologyPreferenceName;
    }

    public void setTechnologyPreferenceName(String technologyPreferenceName) {
        this.technologyPreferenceName = technologyPreferenceName;
    }
}
