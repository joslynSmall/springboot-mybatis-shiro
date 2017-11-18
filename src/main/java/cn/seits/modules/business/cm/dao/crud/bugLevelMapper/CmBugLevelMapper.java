package cn.seits.modules.business.cm.dao.crud.bugLevelMapper;


import cn.seits.modules.business.cm.model.bugLevel.CmBugLevelExample;
import cn.seits.modules.business.cm.model.bugLevel.CmBugLevelKey;
import cn.seits.modules.business.cm.model.bugLevel.CmBugLevel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmBugLevelMapper {
    int countByExample(CmBugLevelExample example);

    int deleteByExample(CmBugLevelExample example);

    int deleteByPrimaryKey(CmBugLevelKey key);

    int insert(CmBugLevel record);

    int insertSelective(CmBugLevel record);

    List<CmBugLevel> selectByExample(CmBugLevelExample example);

    CmBugLevel selectByPrimaryKey(CmBugLevelKey key);

    int updateByExampleSelective(@Param("record") CmBugLevel record, @Param("example") CmBugLevelExample example);

    int updateByExample(@Param("record") CmBugLevel record, @Param("example") CmBugLevelExample example);

    int updateByPrimaryKeySelective(CmBugLevel record);

    int updateByPrimaryKey(CmBugLevel record);
}