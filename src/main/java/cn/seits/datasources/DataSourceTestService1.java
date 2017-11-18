package cn.seits.datasources;

import cn.seits.modules.business.cm.model.bugLevel.CmBugLevelExample;
import cn.seits.modules.business.cm.service.bugLevelService.IBugLevelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.seits.modules.business.cm.model.bugLevel.CmBugLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 测试
 *
 * @author seits
 * @email *.com
 * @date 2017/9/16 23:10
 */
@Service
public class DataSourceTestService1 {
    @Autowired
    private IBugLevelService bugLevelService;

    public List<CmBugLevel> queryObject(Long userId) {

        PageHelper.startPage(1, 10, true);

        CmBugLevelExample example = new CmBugLevelExample();
        List<CmBugLevel> list = this.bugLevelService.selectByExample(example);
        PageInfo<CmBugLevel> pageInfo = new PageInfo<CmBugLevel>(list);
        return list;
    }

    /*@DataSource(name = DataSourceNames.SECOND)
    public UserEntity queryObject2(Long userId){
        return userService.queryObject(userId);
    }*/
}
