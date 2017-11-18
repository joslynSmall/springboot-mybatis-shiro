package cn.seits.modules.sys.service;

import cn.seits.modules.sys.entity.SysLogEntity;

import java.util.List;
import java.util.Map;

/**
 * 系统日志
 * 
 * @author seits
 * @email *.com
 * @date 2017-03-08 10:40:56
 */
public interface SysLogService {
	
	SysLogEntity queryObject(Long id);
	
	List<SysLogEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SysLogEntity sysLog);

	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
