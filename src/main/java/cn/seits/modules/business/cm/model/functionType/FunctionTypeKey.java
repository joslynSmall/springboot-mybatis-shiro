package cn.seits.modules.business.cm.model.functionType;

public class FunctionTypeKey {
    /**
     * 功能类型id
     */
    private String functionTypeId;

    /**
     * 获取功能类型id
     */
    public String getFunctionTypeId() {
        return functionTypeId;
    }

    /**
     * 设置功能类型id
     */
    public void setFunctionTypeId(String functionTypeId) {
        this.functionTypeId = functionTypeId == null ? null : functionTypeId.trim();
    }
}