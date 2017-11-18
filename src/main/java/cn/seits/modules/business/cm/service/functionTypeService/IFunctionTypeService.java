package cn.seits.modules.business.cm.service.functionTypeService;

import cn.seits.common.services.IBaseService;

public interface IFunctionTypeService<FunctionTypeKey, FunctionType, FunctionTypeExample> extends IBaseService<FunctionTypeKey, FunctionType, FunctionTypeExample> {

    int insertOrtherTest(FunctionType record);
}
