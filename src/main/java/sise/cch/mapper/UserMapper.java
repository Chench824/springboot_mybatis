package sise.cch.mapper;

import org.apache.ibatis.annotations.Mapper;
import sise.cch.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {

    //新增User
    public void saveUser(User user);

    //查询所有
    public List<User> findAllUser();

    //根据Id查询user
    public User findUserById(Integer id);

    //更新User
    public void updateUser(User user);

    //删除User
    public void deleteUser(Integer id);
}
