package cn.seits.modules.business.cm.service.dutyService;

import cn.seits.common.services.IBaseService;

public interface IDutyService<DutyKey, Duty, DutyExample> extends IBaseService<DutyKey, Duty, DutyExample> {
    int insertOrtherTest(Duty record);
}
