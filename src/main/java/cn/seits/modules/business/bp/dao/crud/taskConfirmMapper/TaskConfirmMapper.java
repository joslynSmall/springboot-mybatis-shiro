package cn.seits.modules.business.bp.dao.crud.taskConfirmMapper;

import cn.seits.modules.business.bp.model.taskConfirm.TaskConfirm;
import cn.seits.modules.business.bp.model.taskConfirm.TaskConfirmExample;
import cn.seits.modules.business.bp.model.taskConfirm.TaskConfirmKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskConfirmMapper {
    int countByExample(TaskConfirmExample example);

    int deleteByExample(TaskConfirmExample example);

    int deleteByPrimaryKey(TaskConfirmKey key);

    int insert(TaskConfirm record);

    int insertSelective(TaskConfirm record);

    List<TaskConfirm> selectByExample(TaskConfirmExample example);

    TaskConfirm selectByPrimaryKey(TaskConfirmKey key);

    int updateByExampleSelective(@Param("record") TaskConfirm record, @Param("example") TaskConfirmExample example);

    int updateByExample(@Param("record") TaskConfirm record, @Param("example") TaskConfirmExample example);

    int updateByPrimaryKeySelective(TaskConfirm record);

    int updateByPrimaryKey(TaskConfirm record);
}