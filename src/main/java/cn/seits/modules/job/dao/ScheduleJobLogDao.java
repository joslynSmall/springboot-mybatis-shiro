package cn.seits.modules.job.dao;

import cn.seits.modules.sys.dao.BaseDao;
import cn.seits.modules.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 * 
 * @author seits
 * @email *.com
 * @date 2016年12月1日 下午10:30:02
 */
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}
