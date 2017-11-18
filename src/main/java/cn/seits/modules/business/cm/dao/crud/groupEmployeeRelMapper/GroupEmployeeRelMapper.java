package cn.seits.modules.business.cm.dao.crud.groupEmployeeRelMapper;

import cn.seits.modules.business.cm.model.groupEmployeeRel.GroupEmployeeRel;
import cn.seits.modules.business.cm.model.groupEmployeeRel.GroupEmployeeRelExample;
import cn.seits.modules.business.cm.model.groupEmployeeRel.GroupEmployeeRelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupEmployeeRelMapper {
    int countByExample(GroupEmployeeRelExample example);

    int deleteByExample(GroupEmployeeRelExample example);

    int deleteByPrimaryKey(GroupEmployeeRelKey key);

    int insert(GroupEmployeeRel record);

    int insertSelective(GroupEmployeeRel record);

    List<GroupEmployeeRel> selectByExample(GroupEmployeeRelExample example);

    GroupEmployeeRel selectByPrimaryKey(GroupEmployeeRelKey key);

    int updateByExampleSelective(@Param("record") GroupEmployeeRel record, @Param("example") GroupEmployeeRelExample example);

    int updateByExample(@Param("record") GroupEmployeeRel record, @Param("example") GroupEmployeeRelExample example);

    int updateByPrimaryKeySelective(GroupEmployeeRel record);

    int updateByPrimaryKey(GroupEmployeeRel record);
}