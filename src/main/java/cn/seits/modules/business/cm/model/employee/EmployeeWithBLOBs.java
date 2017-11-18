package cn.seits.modules.business.cm.model.employee;

public class EmployeeWithBLOBs extends Employee {
    /**
     * 个人照片
     */
    private byte[] photograph;

    /**
     * 获取个人照片
     */
    public byte[] getPhotograph() {
        return photograph;
    }

    /**
     * 设置个人照片
     */
    public void setPhotograph(byte[] photograph) {
        this.photograph = photograph;
    }
}