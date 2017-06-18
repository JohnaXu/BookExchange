package cn.no7player.ssh.service;

import cn.no7player.ssh.po.User;

import java.util.List;

/**
 * Created by Administractor on 2017/5/30.
 */
public interface UserService {
    public String addUser(User user);
    public List<User> findUserByName(String name);
    public List<User> listAll();

}
