package cn.seits.modules.business.cm.dao.crud.dutyMapper;

import cn.seits.modules.business.cm.model.duty.Duty;
import cn.seits.modules.business.cm.model.duty.DutyExample;
import cn.seits.modules.business.cm.model.duty.DutyKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DutyMapper {
    int countByExample(DutyExample example);

    int deleteByExample(DutyExample example);

    int deleteByPrimaryKey(DutyKey key);

    int insert(Duty record);

    int insertSelective(Duty record);

    List<Duty> selectByExample(DutyExample example);

    Duty selectByPrimaryKey(DutyKey key);

    int updateByExampleSelective(@Param("record") Duty record, @Param("example") DutyExample example);

    int updateByExample(@Param("record") Duty record, @Param("example") DutyExample example);

    int updateByPrimaryKeySelective(Duty record);

    int updateByPrimaryKey(Duty record);
}