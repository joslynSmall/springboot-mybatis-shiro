package cn.seits.modules.business.cm.service.dutyService.impl;

import cn.seits.modules.business.cm.dao.crud.dutyMapper.DutyMapper;
import cn.seits.modules.business.cm.model.duty.Duty;
import cn.seits.modules.business.cm.model.duty.DutyExample;
import cn.seits.modules.business.cm.model.duty.DutyKey;
import cn.seits.modules.business.cm.service.dutyService.IDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DutyService implements IDutyService<DutyKey, Duty, DutyExample> {
    @Autowired
    private DutyMapper dutyMapper;

    @Override
    public int countByExample(DutyExample example) {
        return dutyMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DutyExample example) {
        return dutyMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(DutyKey key) {
        return dutyMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(Duty record) {
        return dutyMapper.insert(record);
    }

    @Override
    public int insertSelective(Duty record) {
        return dutyMapper.insertSelective(record);
    }

    @Override
    public List<Duty> selectByExample(DutyExample example) {
        return dutyMapper.selectByExample(example);
    }

    @Override
    public Duty selectByPrimaryKey(DutyKey key) {
        return dutyMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(Duty record, DutyExample example) {
        return dutyMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Duty record, DutyExample example) {
        return dutyMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Duty record) {
        return dutyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Duty record) {
        return dutyMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insertOrtherTest(Duty record) {
        return 0;
    }
}
