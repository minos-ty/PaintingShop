package com.minos.web.listener;

import com.minos.domain.User;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.ArrayList;
import java.util.List;

@WebListener
public class InitServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("数据已初始化...");
        //创建一个用于用户信息保存的List集合
        List<User> userList = new ArrayList<>();

        //将List集合存入到ServletContext域中
        sce.getServletContext().setAttribute("userList",userList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
