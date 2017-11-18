package cn.seits.modules.business.cm.dao.crud.techPreEmployeeRelMapper;

import cn.seits.modules.business.cm.model.techPreEmployeeRel.TechPreEmployeeRel;
import cn.seits.modules.business.cm.model.techPreEmployeeRel.TechPreEmployeeRelExample;
import cn.seits.modules.business.cm.model.techPreEmployeeRel.TechPreEmployeeRelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TechPreEmployeeRelMapper {
    int countByExample(TechPreEmployeeRelExample example);

    int deleteByExample(TechPreEmployeeRelExample example);

    int deleteByPrimaryKey(TechPreEmployeeRelKey key);

    int insert(TechPreEmployeeRel record);

    int insertSelective(TechPreEmployeeRel record);

    List<TechPreEmployeeRel> selectByExample(TechPreEmployeeRelExample example);

    TechPreEmployeeRel selectByPrimaryKey(TechPreEmployeeRelKey key);

    int updateByExampleSelective(@Param("record") TechPreEmployeeRel record, @Param("example") TechPreEmployeeRelExample example);

    int updateByExample(@Param("record") TechPreEmployeeRel record, @Param("example") TechPreEmployeeRelExample example);

    int updateByPrimaryKeySelective(TechPreEmployeeRel record);

    int updateByPrimaryKey(TechPreEmployeeRel record);
}