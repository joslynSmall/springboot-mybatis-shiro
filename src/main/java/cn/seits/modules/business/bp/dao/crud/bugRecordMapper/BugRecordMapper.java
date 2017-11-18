package cn.seits.modules.business.bp.dao.crud.bugRecordMapper;

import java.util.List;

import cn.seits.modules.business.bp.model.bugRecord.BugRecord;
import cn.seits.modules.business.bp.model.bugRecord.BugRecordExample;
import cn.seits.modules.business.bp.model.bugRecord.BugRecordKey;
import org.apache.ibatis.annotations.Param;

public interface BugRecordMapper
{
    int countByExample(BugRecordExample example);

    int deleteByExample(BugRecordExample example);

    int deleteByPrimaryKey(BugRecordKey key);

    int insert(BugRecord record);

    int insertSelective(BugRecord record);

    List<BugRecord> selectByExample(BugRecordExample example);

    BugRecord selectByPrimaryKey(BugRecordKey key);

    int updateByExampleSelective(@Param("record") BugRecord record, @Param("example") BugRecordExample example);

    int updateByExample(@Param("record") BugRecord record, @Param("example") BugRecordExample example);

    int updateByPrimaryKeySelective(BugRecord record);

    int updateByPrimaryKey(BugRecord record);
}