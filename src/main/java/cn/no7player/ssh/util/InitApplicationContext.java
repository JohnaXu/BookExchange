package cn.no7player.ssh.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administractor on 2017/5/30.
 */
public class InitApplicationContext {
    private static ApplicationContext context = null;

    private InitApplicationContext(){

    }
    public static ApplicationContext getApplicationContext(){
        if(context == null){
            context = new ClassPathXmlApplicationContext("applicationContext.xml ");
        }
        return context;
    }
}
