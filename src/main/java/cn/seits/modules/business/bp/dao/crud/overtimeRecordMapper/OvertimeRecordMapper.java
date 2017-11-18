package cn.seits.modules.business.bp.dao.crud.overtimeRecordMapper;

import cn.seits.modules.business.bp.model.overtimeRecord.OvertimeRecord;
import cn.seits.modules.business.bp.model.overtimeRecord.OvertimeRecordExample;
import cn.seits.modules.business.bp.model.overtimeRecord.OvertimeRecordKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OvertimeRecordMapper {
    int countByExample(OvertimeRecordExample example);

    int deleteByExample(OvertimeRecordExample example);

    int deleteByPrimaryKey(OvertimeRecordKey key);

    int insert(OvertimeRecord record);

    int insertSelective(OvertimeRecord record);

    List<OvertimeRecord> selectByExample(OvertimeRecordExample example);

    OvertimeRecord selectByPrimaryKey(OvertimeRecordKey key);

    int updateByExampleSelective(@Param("record") OvertimeRecord record, @Param("example") OvertimeRecordExample example);

    int updateByExample(@Param("record") OvertimeRecord record, @Param("example") OvertimeRecordExample example);

    int updateByPrimaryKeySelective(OvertimeRecord record);

    int updateByPrimaryKey(OvertimeRecord record);
}