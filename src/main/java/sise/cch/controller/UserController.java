package sise.cch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sise.cch.entity.User;
import sise.cch.service.UserService;
import sise.cch.utils.ResultUtils;
import sise.cch.vo.ResultVo;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //新增User
    @PostMapping("/saveUser")
    public ResultVo save(@RequestBody User user){
        userService.saveUser(user);
        return ResultUtils.seccess(null);
    }

    //查询所有
    @GetMapping("/findAllUser")
    public ResultVo findAll(){
        List<User> userList = userService.findAllUser();
        return ResultUtils.seccess(userList);
    }

    //根据Id查询user 请求路径:localhost:8001/user/findUserById/1  后面的参数为ID值
    @GetMapping("/findUserById/{id}")
    public ResultVo findById(@PathVariable Integer id){
        User user = userService.findUserById(id);
        return ResultUtils.seccess(user);
    }

    //更新User
    @PostMapping("/updateUser")
    public ResultVo updateUser(@RequestBody User user){
        userService.updateUser(user);
        return ResultUtils.seccess(null);
    }

    //删除User 请求路径:localhost:8001/user/deleteUser/id
    @DeleteMapping("/deleteUser/{id}")
    public ResultVo deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return ResultUtils.seccess(null);
    }
}
