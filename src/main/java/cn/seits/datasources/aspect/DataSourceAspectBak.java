package cn.seits.datasources.aspect;

import cn.seits.datasources.DataSourceNames;
import cn.seits.datasources.DynamicDataSource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * 多数据源，切面处理类
 *
 * @author seits
 * @email *.com
 * @date 2017/9/16 22:20
 */
@Aspect
@Component
public class DataSourceAspectBak implements Ordered {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    // @Pointcut("@annotation(DataSource)")
    @Pointcut("execution(* cn.seits.modules.business.*.service..*(..))")
    public void dataSourcePointCut() {

    }

    @Around("dataSourcePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        /*MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();

        DataSource ds = method.getAnnotation(DataSource.class);
        if(ds == null){
            DynamicDataSource.setDataSource(DataSourceNames.FIRST);
            logger.debug("set datasource is " + DataSourceNames.FIRST);
        }else {
            DynamicDataSource.setDataSource(ds.name());
            logger.debug("set datasource is " + ds.name());
        }*/
        DynamicDataSource.setDataSource(DataSourceNames.SECOND);

        try {
            return point.proceed();
        } finally {
            DynamicDataSource.clearDataSource();
            logger.debug("clean datasource");
        }
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
