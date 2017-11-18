package cn.seits.modules.business.cm.service.technologyPreferenceService;

import cn.seits.common.services.IBaseService;

public interface ITechnologyPreferenceService<TechnologyPreferenceKey, TechnologyPreference, TechnologyPreferenceExample>
        extends IBaseService<TechnologyPreferenceKey, TechnologyPreference, TechnologyPreferenceExample> {

       int insertOrtherTest(TechnologyPreference record);
}
