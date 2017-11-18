package cn.seits.modules.business.cm.service.OvertimeTimeService.impl;



import cn.seits.modules.business.cm.dao.crud.overtimeTimeMapper.OvertimeTimeMapper;
import cn.seits.modules.business.cm.model.overtimeTime.OvertimeTime;
import cn.seits.modules.business.cm.model.overtimeTime.OvertimeTimeExample;
import cn.seits.modules.business.cm.model.overtimeTime.OvertimeTimeKey;
import cn.seits.modules.business.cm.service.OvertimeTimeService.IOvertimeTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OvertimeTimeService implements IOvertimeTimeService<OvertimeTimeKey, OvertimeTime, OvertimeTimeExample> {
    @Autowired
    private OvertimeTimeMapper overtimeTimeMapper;

    @Override
    public int insertOrtherTest(OvertimeTime record) {
        return 0;
    }

    @Override
    public int countByExample(OvertimeTimeExample example) {
        return overtimeTimeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(OvertimeTimeExample example) {
        return overtimeTimeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(OvertimeTimeKey key) {
        return overtimeTimeMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(OvertimeTime record) {
        return overtimeTimeMapper.insert(record);
    }

    @Override
    public int insertSelective(OvertimeTime record) {
        return overtimeTimeMapper.insertSelective(record);
    }

    @Override
    public List<OvertimeTime> selectByExample(OvertimeTimeExample example) {
        return overtimeTimeMapper.selectByExample(example);
    }

    @Override
    public OvertimeTime selectByPrimaryKey(OvertimeTimeKey key) {
        return overtimeTimeMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(OvertimeTime record, OvertimeTimeExample example) {
        return overtimeTimeMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(OvertimeTime record, OvertimeTimeExample example) {
        return overtimeTimeMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(OvertimeTime record) {
        return overtimeTimeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OvertimeTime record) {
        return overtimeTimeMapper.updateByPrimaryKey(record);
    }
}
