package cn.no7player.ssh.dao.impl;

/**
 * Created by Administractor on 2017/5/30.
 */
//import cn.no7player.ssh.dao.UserDAO;
import cn.no7player.ssh.dao.UserDAO;
import cn.no7player.ssh.po.User;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import java.util.List;

@SuppressWarnings("ALL")
public class UserDaoImpl extends HibernateDaoSupport implements UserDAO {

    @Override
    public String addUser(User user){
        String success = "";
        String name = user.getName();
        if(findUserByName(name).size() == 0){
            try{
                getHibernateTemplate().save(user);
                success = "User saved OK!";
            }catch (DataAccessException e){
                success = "Sorry, user cannot be added";
            }
        }else {
            success = "The username has been existed!";
        }
        return success;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> findUserByName(String name){
        return getHibernateTemplate().find("from User where name = ?", name);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> listAll(){
        return getHibernateTemplate().find("from User");
    }

}
