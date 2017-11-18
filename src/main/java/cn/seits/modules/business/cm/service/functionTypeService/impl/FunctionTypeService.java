package cn.seits.modules.business.cm.service.functionTypeService.impl;

import cn.seits.modules.business.cm.dao.crud.functionTypeMapper.FunctionTypeMapper;
import cn.seits.modules.business.cm.model.functionType.FunctionType;
import cn.seits.modules.business.cm.model.functionType.FunctionTypeExample;
import cn.seits.modules.business.cm.model.functionType.FunctionTypeKey;
import cn.seits.modules.business.cm.service.functionTypeService.IFunctionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunctionTypeService implements IFunctionTypeService<FunctionTypeKey, FunctionType, FunctionTypeExample> {

    @Autowired
    private FunctionTypeMapper functionTypeMapper;

    @Override
    public int insertOrtherTest(FunctionType record) {
        return 0;
    }

    @Override
    public int countByExample(FunctionTypeExample example) {
        return functionTypeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(FunctionTypeExample example) {
        return functionTypeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(FunctionTypeKey key) {
        return functionTypeMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(FunctionType record) {
        return functionTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(FunctionType record) {
        return functionTypeMapper.insertSelective(record);
    }

    @Override
    public List<FunctionType> selectByExample(FunctionTypeExample example) {
        return functionTypeMapper.selectByExample(example);
    }

    @Override
    public FunctionType selectByPrimaryKey(FunctionTypeKey key) {
        return functionTypeMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(FunctionType record, FunctionTypeExample example) {
        return functionTypeMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(FunctionType record, FunctionTypeExample example) {
        return functionTypeMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(FunctionType record) {
        return functionTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FunctionType record) {
        return functionTypeMapper.updateByPrimaryKey(record);
    }
}
