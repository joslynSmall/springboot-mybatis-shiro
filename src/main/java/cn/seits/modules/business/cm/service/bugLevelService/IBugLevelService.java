package cn.seits.modules.business.cm.service.bugLevelService;

import cn.seits.common.services.IBaseService;

/**
 * Created by joslyn on 2017/9/12.
 */
public interface IBugLevelService<CmBugLevelKey, CmBugLevel, CmBugLevelExample> extends IBaseService<CmBugLevelKey, CmBugLevel, CmBugLevelExample>
{
    int insertOrtherTest(CmBugLevel record);
}
