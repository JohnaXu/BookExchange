package cn.no7player.ssh.dao;
import cn.no7player.ssh.po.User;
import java.util.List;
/**
 * Created by Administractor on 2017/5/30.
 */
public interface UserDAO {
    public String addUser(User user);
    public List<User> findUserByName(String name);
    public List<User> listAll();
}
