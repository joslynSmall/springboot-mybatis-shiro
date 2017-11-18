package cn.seits.modules.business.bp.dao.crud.workPlanMapper;

import cn.seits.modules.business.bp.model.workPlan.WorkPlan;
import cn.seits.modules.business.bp.model.workPlan.WorkPlanExample;
import cn.seits.modules.business.bp.model.workPlan.WorkPlanKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface WorkPlanMapper {
    int countByExample(WorkPlanExample example);

    int deleteByExample(WorkPlanExample example);

    int deleteByPrimaryKey(WorkPlanKey key);

    int insert(WorkPlan record);

    int insertSelective(WorkPlan record);

    List<WorkPlan> selectByExample(WorkPlanExample example);

    WorkPlan selectByPrimaryKey(WorkPlanKey key);

    int updateByExampleSelective(@Param("record") WorkPlan record, @Param("example") WorkPlanExample example);

    int updateByExample(@Param("record") WorkPlan record, @Param("example") WorkPlanExample example);

    int updateByPrimaryKeySelective(WorkPlan record);

    int updateByPrimaryKey(WorkPlan record);
}