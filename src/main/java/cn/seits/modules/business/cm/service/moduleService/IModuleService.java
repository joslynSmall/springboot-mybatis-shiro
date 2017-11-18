package cn.seits.modules.business.cm.service.moduleService;

import cn.seits.common.services.IBaseService;
import cn.seits.modules.business.cm.model.module.bo.ModuleDvol;

import java.util.List;

public interface IModuleService<ModuleKey, Module, ModuleExample> extends IBaseService<ModuleKey, Module, ModuleExample>{
    int insertOrtherTest(Module record);

    List<ModuleDvol> selectModuleList(ModuleExample example);
}
