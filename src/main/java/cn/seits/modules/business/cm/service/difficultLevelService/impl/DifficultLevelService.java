package cn.seits.modules.business.cm.service.difficultLevelService.impl;


import cn.seits.modules.business.cm.dao.crud.difficultLevelMapper.DifficultLevelMapper;
import cn.seits.modules.business.cm.model.difficultLevel.DifficultLevel;
import cn.seits.modules.business.cm.model.difficultLevel.DifficultLevelExample;
import cn.seits.modules.business.cm.model.difficultLevel.DifficultLevelKey;
import cn.seits.modules.business.cm.service.difficultLevelService.IDifficultLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DifficultLevelService implements IDifficultLevelService<DifficultLevelKey, DifficultLevel, DifficultLevelExample> {

    @Autowired
    private DifficultLevelMapper difficultLevelMapper;

    @Override
    public int insertOrtherTest(DifficultLevel record) {
        return 0;
    }

    @Override
    public int countByExample(DifficultLevelExample example) {
        return difficultLevelMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DifficultLevelExample example) {
        return difficultLevelMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(DifficultLevelKey key) {
        return difficultLevelMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(DifficultLevel record) {
        return difficultLevelMapper.insert(record);
    }

    @Override
    public int insertSelective(DifficultLevel record) {
        return difficultLevelMapper.insertSelective(record);
    }

    @Override
    public List<DifficultLevel> selectByExample(DifficultLevelExample example) {
        return difficultLevelMapper.selectByExample(example);
    }

    @Override
    public DifficultLevel selectByPrimaryKey(DifficultLevelKey key) {
        return difficultLevelMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(DifficultLevel record, DifficultLevelExample example) {
        return difficultLevelMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(DifficultLevel record, DifficultLevelExample example) {
        return difficultLevelMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(DifficultLevel record) {
        return difficultLevelMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DifficultLevel record) {

        return difficultLevelMapper.updateByPrimaryKey(record);
    }
}
