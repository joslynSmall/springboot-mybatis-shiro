package cn.seits.modules.business.bp.dao.crud.dailyWorkPlanMapper;

import cn.seits.modules.business.bp.model.dailyWorkPlan.DailyWorkPlan;
import cn.seits.modules.business.bp.model.dailyWorkPlan.DailyWorkPlanExample;
import cn.seits.modules.business.bp.model.dailyWorkPlan.DailyWorkPlanKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DailyWorkPlanMapper {
    int countByExample(DailyWorkPlanExample example);

    int deleteByExample(DailyWorkPlanExample example);

    int deleteByPrimaryKey(DailyWorkPlanKey key);

    int insert(DailyWorkPlan record);

    int insertSelective(DailyWorkPlan record);

    List<DailyWorkPlan> selectByExample(DailyWorkPlanExample example);

    DailyWorkPlan selectByPrimaryKey(DailyWorkPlanKey key);

    int updateByExampleSelective(@Param("record") DailyWorkPlan record, @Param("example") DailyWorkPlanExample example);

    int updateByExample(@Param("record") DailyWorkPlan record, @Param("example") DailyWorkPlanExample example);

    int updateByPrimaryKeySelective(DailyWorkPlan record);

    int updateByPrimaryKey(DailyWorkPlan record);
}