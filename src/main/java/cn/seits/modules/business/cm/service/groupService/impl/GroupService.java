package cn.seits.modules.business.cm.service.groupService.impl;

import cn.seits.modules.business.cm.dao.crud.groupMapper.GroupMapper;
import cn.seits.modules.business.cm.dao.crud.projectMapper.ProjectMapper;
import cn.seits.modules.business.cm.model.group.Group;
import cn.seits.modules.business.cm.model.group.GroupExample;
import cn.seits.modules.business.cm.model.group.GroupKey;
import cn.seits.modules.business.cm.model.group.bo.GroupDvol;
import cn.seits.modules.business.cm.model.project.ProjectKey;
import cn.seits.modules.business.cm.service.groupService.IGroupService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupService implements IGroupService<GroupKey, Group, GroupExample> {
    @Autowired
    private GroupMapper groupMapper;
    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public int countByExample(GroupExample example) {
        return groupMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(GroupExample example) {
        return groupMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(GroupKey key) {
        return groupMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(Group record) {
        return groupMapper.insert(record);
    }

    @Override
    public int insertSelective(Group record) {
        return groupMapper.insertSelective(record);
    }

    @Override
    public List<Group> selectByExample(GroupExample example) {
        return groupMapper.selectByExample(example);
    }

    @Override
    public Group selectByPrimaryKey(GroupKey key) {
        return groupMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByExampleSelective(Group record, GroupExample example) {
        return groupMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Group record, GroupExample example) {
        return groupMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Group record) {
        return groupMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Group record) {
        return groupMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insertOrtherTest(Group record) {
        return 0;
    }

    /**
     * 列表展示页数据
     * @param example
     * @return
     */
    @Override
    public List<GroupDvol> selectGroupList(GroupExample example) {
        List<GroupDvol> listDvol=new ArrayList<GroupDvol>();
        List<Group> list=groupMapper.selectByExample(example);
        ProjectKey projectKey=new ProjectKey();
        if(list.size()>0){
            for (Group group: list){
                GroupDvol groupDvol=new GroupDvol();
                projectKey.setProjectId(group.getProjectId());
                if(projectMapper.selectByPrimaryKey(projectKey)!=null){
                    groupDvol.setProjectName(projectMapper.selectByPrimaryKey(projectKey).getProjectName());
                }else{
                    groupDvol.setProjectName(group.getGroupId());
                }
                BeanUtils.copyProperties(group,groupDvol);
                listDvol.add(groupDvol);
            }
        }
        return listDvol;
    }
}
