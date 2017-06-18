package cn.no7player.ssh.service.impl;

import cn.no7player.ssh.dao.UserDAO;
import cn.no7player.ssh.po.User;
import cn.no7player.ssh.service.UserService;

import java.util.List;

/**
 * Created by Administractor on 2017/5/30.
 */
public class UserServiceImpl implements UserService{
    private UserDAO userDAO;

    public UserDAO getUserDAO(){
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    public String addUser(User user){
        return userDAO.addUser(user);
    }

    @Override
    public List<User> findUserByName(String name){
        return userDAO.findUserByName(name);
    }

    @Override
    public List<User> listAll(){
        return userDAO.listAll();
    }


}
