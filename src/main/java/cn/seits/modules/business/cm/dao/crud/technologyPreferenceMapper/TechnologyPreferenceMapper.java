package cn.seits.modules.business.cm.dao.crud.technologyPreferenceMapper;

import cn.seits.modules.business.cm.model.technologyPreference.TechnologyPreference;
import cn.seits.modules.business.cm.model.technologyPreference.TechnologyPreferenceExample;
import cn.seits.modules.business.cm.model.technologyPreference.TechnologyPreferenceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TechnologyPreferenceMapper {
    int countByExample(TechnologyPreferenceExample example);

    int deleteByExample(TechnologyPreferenceExample example);

    int deleteByPrimaryKey(TechnologyPreferenceKey key);

    int insert(TechnologyPreference record);

    int insertSelective(TechnologyPreference record);

    List<TechnologyPreference> selectByExample(TechnologyPreferenceExample example);

    TechnologyPreference selectByPrimaryKey(TechnologyPreferenceKey key);

    int updateByExampleSelective(@Param("record") TechnologyPreference record, @Param("example") TechnologyPreferenceExample example);

    int updateByExample(@Param("record") TechnologyPreference record, @Param("example") TechnologyPreferenceExample example);

    int updateByPrimaryKeySelective(TechnologyPreference record);

    int updateByPrimaryKey(TechnologyPreference record);
}