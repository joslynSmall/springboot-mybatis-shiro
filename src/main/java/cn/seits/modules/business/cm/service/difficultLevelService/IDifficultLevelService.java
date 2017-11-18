package cn.seits.modules.business.cm.service.difficultLevelService;

import cn.seits.common.services.IBaseService;

public interface IDifficultLevelService<DifficultLevelKey, DifficultLevel, DifficultLevelExample>extends IBaseService<DifficultLevelKey, DifficultLevel, DifficultLevelExample> {

    int insertOrtherTest(DifficultLevel record);
}
