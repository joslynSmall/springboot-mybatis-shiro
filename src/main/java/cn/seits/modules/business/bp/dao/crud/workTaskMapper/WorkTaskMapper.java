package cn.seits.modules.business.bp.dao.crud.workTaskMapper;

import cn.seits.modules.business.bp.model.workTask.WorkTask;
import cn.seits.modules.business.bp.model.workTask.WorkTaskExample;
import cn.seits.modules.business.bp.model.workTask.WorkTaskKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkTaskMapper {
    int countByExample(WorkTaskExample example);

    int deleteByExample(WorkTaskExample example);

    int deleteByPrimaryKey(WorkTaskKey key);

    int insert(WorkTask record);

    int insertSelective(WorkTask record);

    List<WorkTask> selectByExample(WorkTaskExample example);

    WorkTask selectByPrimaryKey(WorkTaskKey key);

    int updateByExampleSelective(@Param("record") WorkTask record, @Param("example") WorkTaskExample example);

    int updateByExample(@Param("record") WorkTask record, @Param("example") WorkTaskExample example);

    int updateByPrimaryKeySelective(WorkTask record);

    int updateByPrimaryKey(WorkTask record);
}