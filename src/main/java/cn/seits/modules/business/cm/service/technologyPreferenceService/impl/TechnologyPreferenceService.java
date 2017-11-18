package cn.seits.modules.business.cm.service.technologyPreferenceService.impl;


import cn.seits.modules.business.cm.dao.crud.technologyPreferenceMapper.TechnologyPreferenceMapper;
import cn.seits.modules.business.cm.model.technologyPreference.TechnologyPreference;
import cn.seits.modules.business.cm.model.technologyPreference.TechnologyPreferenceExample;
import cn.seits.modules.business.cm.model.technologyPreference.TechnologyPreferenceKey;
import cn.seits.modules.business.cm.service.technologyPreferenceService.ITechnologyPreferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyPreferenceService implements ITechnologyPreferenceService<TechnologyPreferenceKey, TechnologyPreference, TechnologyPreferenceExample>{

  @Autowired
    private TechnologyPreferenceMapper technologyPreferenceMapper;
  @Override
  public int insertOrtherTest(TechnologyPreference record) {
      return 0;
  }

    @Override
    public int countByExample(TechnologyPreferenceExample example) {
        return technologyPreferenceMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TechnologyPreferenceExample example) {
        return technologyPreferenceMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(TechnologyPreferenceKey key) {
        return technologyPreferenceMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(TechnologyPreference record) {
        return technologyPreferenceMapper.insert(record);
    }

    @Override
    public int insertSelective(TechnologyPreference record) {
        return technologyPreferenceMapper.insertSelective(record);
    }

    @Override
    public List<TechnologyPreference> selectByExample(TechnologyPreferenceExample example) {
        return technologyPreferenceMapper.selectByExample(example);
    }

    @Override
    public TechnologyPreference selectByPrimaryKey(TechnologyPreferenceKey key) {
        return technologyPreferenceMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(TechnologyPreference record, TechnologyPreferenceExample example) {
        return technologyPreferenceMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TechnologyPreference record, TechnologyPreferenceExample example) {
        return technologyPreferenceMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TechnologyPreference record) {
        return technologyPreferenceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TechnologyPreference record) {
        return technologyPreferenceMapper.updateByPrimaryKey(record);
    }
}
