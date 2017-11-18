package cn.seits.common.aspect;

import cn.seits.common.utils.ArrayUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;


/**
 * 更新 插入 时间处理切面类
 */
@Aspect
@Component
public class AutoTimeAspect {

    @Pointcut("execution(* cn.seits.modules.business.*..controller..*.insert*(..))")
    public void InsertPointCut() {

    }

    @Before("InsertPointCut()")
    public void insertAround(JoinPoint point) throws Throwable {
        //插入创建时间
        //得到类对象
        Class userCla = (Class) point.getArgs()[0].getClass();
       /*
        * 得到类中的所有属性集合
        *  因为有继承关系所以要分别获取子类父类所有属性合并
        */
        Field[] fs = ArrayUtil.concat(userCla.getSuperclass().getDeclaredFields(), userCla.getDeclaredFields());
        for (int i = 0; i < fs.length; i++) {
            Field f = fs[i];
            f.setAccessible(true); //设置些属性是可以访问的
            Object val = f.get(point.getArgs()[0]);//得到此属性的值

            System.out.println("name:" + f.getName() + "\t value = " + val);

            //String type = f.getType().toString();//得到此属性的类型
            if (f.getName().contains("Id") && (val == null||"".equals(val))) {
                f.set(point.getArgs()[0], UUID.randomUUID().toString());
            }
            if ((f.getName().contains("createTime") || f.getName().contains("createDate"))) {
                f.set(point.getArgs()[0], new Date());
            }

        }
    }


    @Pointcut("execution(* cn.seits.modules.business.*..controller..*.update*(..))")
    public void updatePointCut() {

    }

    @Before("updatePointCut()")
    public void updateAround(JoinPoint point) throws Throwable {
        System.out.println("@Before：目标方法为：" +
                point.getSignature().getDeclaringTypeName() +
                "." + point.getSignature().getName());
        System.out.println("@Before：参数为：" + Arrays.toString(point.getArgs()));
        //更新更新时间
        //得到类对象
        Class userCla = (Class) point.getArgs()[0].getClass();

       /*
        * 得到类中的所有属性集合
        * 因为有继承关系所以要分别获取子类父类所有属性合并
        */
        Field[] fs = ArrayUtil.concat(userCla.getSuperclass().getDeclaredFields(), userCla.getDeclaredFields());
        for (int i = 0; i < fs.length; i++) {
            Field f = fs[i];
            f.setAccessible(true); //设置些属性是可以访问的
            Object val = f.get(point.getArgs()[0]);//得到此属性的值

            System.out.println("name:" + f.getName() + "\t value = " + val);

            if ((f.getName().contains("updateTime") || f.getName().contains("updateDate"))) {
                f.set(point.getArgs()[0], new Date());
            }

        }
    }
}
