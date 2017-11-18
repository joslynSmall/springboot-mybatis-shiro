package cn.renren;


import cn.seits.datasources.DataSourceTestService1;
import cn.seits.modules.business.cm.model.bugLevel.CmBugLevel;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DynamicDataSourceTest1 {
    @Autowired
    private DataSourceTestService1 dataSourceTestService;

    @Test
    public void test(){
        //数据源2
        List<CmBugLevel> list = dataSourceTestService.queryObject(1L);
        System.out.println(ToStringBuilder.reflectionToString(list));

    }

}
