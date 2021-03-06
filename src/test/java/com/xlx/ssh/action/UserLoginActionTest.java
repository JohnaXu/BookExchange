package com.xlx.ssh.action;

import cn.no7player.ssh.action.UserLoginAction;
import cn.no7player.ssh.po.User;
import cn.no7player.ssh.service.UserService;
import cn.no7player.ssh.util.InitApplicationContext;
import com.opensymphony.xwork2.Action;
import junit.framework.TestCase;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;

/**
 * Created by Administractor on 2017/5/30.
 */
public class UserLoginActionTest extends TestCase {
    private User user;
    private UserService userService;
    private ApplicationContext context = null;
    private UserLoginAction loginAction = null;
    public void setUp(){
        context = InitApplicationContext.getApplicationContext();
        loginAction = new UserLoginAction();
        userService = (UserService)context.getBean("userService");
    }
    //注：需要先执行UserDaoTest测试
    public void testUserLogin(){
        user = new User();
        user.setName("username");
        user.setPassword("password");
        try {
            loginAction.setUser(user);
            loginAction.setUserService(userService);
            Assert.assertEquals(Action.SUCCESS, loginAction.execute());
            user.setPassword("password1");
            System.out.println(loginAction.getActionErrors());
            Assert.assertEquals(Action.INPUT, loginAction.execute());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
