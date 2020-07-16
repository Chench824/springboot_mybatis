package sise.cch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import sise.cch.entity.User;
import sise.cch.mapper.UserMapper;
import sise.cch.service.UserService;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED,readOnly = false)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }

    //查询所有
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }
}
