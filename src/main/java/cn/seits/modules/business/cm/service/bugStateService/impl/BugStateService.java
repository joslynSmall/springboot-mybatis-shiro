package cn.seits.modules.business.cm.service.bugStateService.impl;

import cn.seits.modules.business.cm.dao.crud.bugStateMapper.BugStateMapper;
import cn.seits.modules.business.cm.model.bugState.BugState;
import cn.seits.modules.business.cm.model.bugState.BugStateExample;
import cn.seits.modules.business.cm.model.bugState.BugStateKey;
import cn.seits.modules.business.cm.service.bugStateService.IBugStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BugStateService implements IBugStateService<BugStateKey, BugState, BugStateExample> {
    @Autowired
    private BugStateMapper bugStateMapper;

    @Override
    public int insertOrtherTest(BugState record) {
        return 0;
    }
    @Override
    public int countByExample(BugStateExample example) {
        return bugStateMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BugStateExample example) {
        return bugStateMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(BugStateKey key) {
        return bugStateMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(BugState record) {
        return bugStateMapper.insert(record);
    }

    @Override
    public int insertSelective(BugState record) {
        return bugStateMapper.insertSelective(record);
    }

    @Override
    public List<BugState> selectByExample(BugStateExample example) {
        return bugStateMapper.selectByExample(example);
    }

    @Override
    public BugState selectByPrimaryKey(BugStateKey key) {
        return bugStateMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(BugState record, BugStateExample example) {
        return bugStateMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(BugState record, BugStateExample example) {
        return bugStateMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(BugState record) {
        return bugStateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BugState record) {
        return bugStateMapper.updateByPrimaryKey(record);
    }
}
