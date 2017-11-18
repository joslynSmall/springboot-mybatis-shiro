package cn.seits.modules.business.cm.service.bugStateService;

import cn.seits.common.services.IBaseService;

public interface IBugStateService<BugStateKey, BugState, BugStateExample> extends IBaseService<BugStateKey, BugState, BugStateExample> {

    int insertOrtherTest(BugState record);
}
