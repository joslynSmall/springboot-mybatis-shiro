package cn.seits.datasources;

import cn.seits.modules.app.service.UserService;
import cn.seits.datasources.annotation.DataSource;
import cn.seits.modules.app.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 测试
 * @author seits
 * @email *.com
 * @date 2017/9/16 23:10
 */
@Service
public class DataSourceTestService {
    @Autowired
    private UserService userService;

    @DataSource(name = DataSourceNames.FIRST)
    public UserEntity queryObject(Long userId){
        return userService.queryObject(userId);
    }

    @DataSource(name = DataSourceNames.FIRST)
    public UserEntity queryObject2(Long userId){
        return userService.queryObject(userId);
    }
}
