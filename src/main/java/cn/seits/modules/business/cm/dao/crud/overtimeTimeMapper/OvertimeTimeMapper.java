package cn.seits.modules.business.cm.dao.crud.overtimeTimeMapper;

import cn.seits.modules.business.cm.model.overtimeTime.OvertimeTime;
import cn.seits.modules.business.cm.model.overtimeTime.OvertimeTimeExample;
import cn.seits.modules.business.cm.model.overtimeTime.OvertimeTimeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OvertimeTimeMapper {
    int countByExample(OvertimeTimeExample example);

    int deleteByExample(OvertimeTimeExample example);

    int deleteByPrimaryKey(OvertimeTimeKey key);

    int insert(OvertimeTime record);

    int insertSelective(OvertimeTime record);

    List<OvertimeTime> selectByExample(OvertimeTimeExample example);

    OvertimeTime selectByPrimaryKey(OvertimeTimeKey key);

    int updateByExampleSelective(@Param("record") OvertimeTime record, @Param("example") OvertimeTimeExample example);

    int updateByExample(@Param("record") OvertimeTime record, @Param("example") OvertimeTimeExample example);

    int updateByPrimaryKeySelective(OvertimeTime record);

    int updateByPrimaryKey(OvertimeTime record);
}