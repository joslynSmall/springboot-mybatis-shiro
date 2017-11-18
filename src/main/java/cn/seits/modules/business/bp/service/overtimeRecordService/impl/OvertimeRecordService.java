package cn.seits.modules.business.bp.service.overtimeRecordService.impl;

import cn.seits.modules.business.bp.dao.crud.overtimeRecordMapper.OvertimeRecordMapper;
import cn.seits.modules.business.bp.model.overtimeRecord.OvertimeRecord;
import cn.seits.modules.business.bp.model.overtimeRecord.OvertimeRecordExample;
import cn.seits.modules.business.bp.model.overtimeRecord.OvertimeRecordKey;
import cn.seits.modules.business.bp.model.overtimeRecord.bo.OvertimeRecordDvol;
import cn.seits.modules.business.bp.service.overtimeRecordService.IOvertimeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OvertimeRecordService implements IOvertimeRecordService<OvertimeRecordKey, OvertimeRecord, OvertimeRecordExample> {
    @Autowired
    private OvertimeRecordMapper overtimeRecordMapper;

    @Override
    public int countByExample(OvertimeRecordExample example) {
        return overtimeRecordMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(OvertimeRecordExample example) {
        return overtimeRecordMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(OvertimeRecordKey key) {
        return overtimeRecordMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(OvertimeRecord record) {
        return overtimeRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(OvertimeRecord record) {
        return overtimeRecordMapper.insertSelective(record);
    }

    @Override
    public List<OvertimeRecord> selectByExample(OvertimeRecordExample example) {
        return overtimeRecordMapper.selectByExample(example);
    }

    @Override
    public OvertimeRecord selectByPrimaryKey(OvertimeRecordKey key) {
        return overtimeRecordMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(OvertimeRecord record, OvertimeRecordExample example) {
        return overtimeRecordMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(OvertimeRecord record, OvertimeRecordExample example) {
        return overtimeRecordMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(OvertimeRecord record) {
        return overtimeRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OvertimeRecord record) {
        return overtimeRecordMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insertOrtherTest(OvertimeRecord overtimeRecord) {
        return 0;
    }

    @Override
    public List<OvertimeRecordDvol> selectOvertimeRecordList(OvertimeRecordExample overtimeRecordExample) {
        return null;
    }
}
