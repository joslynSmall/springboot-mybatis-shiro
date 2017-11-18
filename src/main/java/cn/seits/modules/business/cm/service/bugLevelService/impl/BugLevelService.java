package cn.seits.modules.business.cm.service.bugLevelService.impl;


import cn.seits.modules.business.cm.model.bugLevel.CmBugLevelExample;
import cn.seits.modules.business.cm.service.bugLevelService.IBugLevelService;
import cn.seits.modules.business.cm.dao.crud.bugLevelMapper.CmBugLevelMapper;
import cn.seits.modules.business.cm.model.bugLevel.CmBugLevel;
import cn.seits.modules.business.cm.model.bugLevel.CmBugLevelKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by joslyn on 2017/9/12.
 */
@Service
public class BugLevelService implements IBugLevelService<CmBugLevelKey, CmBugLevel, CmBugLevelExample> {
    @Autowired
    private CmBugLevelMapper cmBugLevelMapper;

    @Override
    public int countByExample(CmBugLevelExample example) {
        return cmBugLevelMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CmBugLevelExample example) {
        return cmBugLevelMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(CmBugLevelKey key) {
        return cmBugLevelMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(CmBugLevel record) {
        return cmBugLevelMapper.insert(record);
    }

    @Override
    public int insertSelective(CmBugLevel record) {
        return cmBugLevelMapper.insertSelective(record);
    }

    @Override
    public List<CmBugLevel> selectByExample(CmBugLevelExample example) {
        return cmBugLevelMapper.selectByExample(example);
    }

    @Override
    public CmBugLevel selectByPrimaryKey(CmBugLevelKey key) {
        return cmBugLevelMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(CmBugLevel record, CmBugLevelExample example) {
        return cmBugLevelMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(CmBugLevel record, CmBugLevelExample example) {
        return cmBugLevelMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(CmBugLevel record) {
        return cmBugLevelMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CmBugLevel record) {
        return cmBugLevelMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insertOrtherTest(CmBugLevel record) {
        return 0;
    }
}
