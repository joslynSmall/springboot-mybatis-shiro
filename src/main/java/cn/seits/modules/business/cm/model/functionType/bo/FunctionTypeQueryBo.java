package cn.seits.modules.business.cm.model.functionType.bo;

import cn.seits.common.bo.BaseQueryBo;

public class FunctionTypeQueryBo extends BaseQueryBo {

    private  String functionTypeName;

    public String getFunctionTypeName() {
        return functionTypeName;
    }

    public void setFunctionTypeName(String functionTypeName) {
        this.functionTypeName = functionTypeName;
    }
}
