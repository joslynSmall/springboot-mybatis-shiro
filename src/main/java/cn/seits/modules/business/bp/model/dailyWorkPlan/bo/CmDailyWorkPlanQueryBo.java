package cn.seits.modules.business.bp.model.dailyWorkPlan.bo;

import cn.seits.common.bo.BaseQueryBo;
import org.apache.commons.lang.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CmDailyWorkPlanQueryBo extends BaseQueryBo {

    private String enactTimeStart;// 计划制定时间起

    private String enactTimeEnd;// 计划制定时间止

    private String enactEmployeeName;//制定人员

    public String getEnactTimeStart() {
        if (StringUtils.isNotBlank(enactTimeStart)) {
            enactTimeStart = enactTimeStart.substring(0, 10);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            try {
                c.setTime(sdf.parse(enactTimeStart));
                c.add(Calendar.DAY_OF_MONTH, 1);
                return sdf.format(c.getTime());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public void setEnactTimeStart(String enactTimeStart) {
        this.enactTimeStart = enactTimeStart;
    }

    public String getEnactTimeEnd() {
        if (StringUtils.isNotBlank(enactTimeEnd)) {
            enactTimeEnd = enactTimeEnd.substring(0, 10);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            try {
                c.setTime(sdf.parse(enactTimeEnd));
                c.add(Calendar.DAY_OF_MONTH, 2);
                return sdf.format(c.getTime());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public void setEnactTimeEnd(String enactTimeEnd) {
        this.enactTimeEnd = enactTimeEnd;
    }

    public String getEnactEmployeeName() {
        return enactEmployeeName;
    }

    public void setEnactEmployeeName(String enactEmployeeName) {
        this.enactEmployeeName = enactEmployeeName;
    }
}
