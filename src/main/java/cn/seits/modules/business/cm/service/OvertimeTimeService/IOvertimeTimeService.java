package cn.seits.modules.business.cm.service.OvertimeTimeService;

import cn.seits.common.services.IBaseService;

public interface IOvertimeTimeService<OvertimeTimeKey, OvertimeTime, OvertimeTimeExample> extends IBaseService<OvertimeTimeKey, OvertimeTime, OvertimeTimeExample> {
    int insertOrtherTest(OvertimeTime record);
}
