package com.minos.web.servlet;

import com.minos.domain.User;
import com.minos.service.UserService;
import com.minos.web.servlet.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //封装数据
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        //处理数据
        UserService userService = new UserServiceImpl();
        List<User> userList =(List<User>) getServletContext().getAttribute("userList");//从Servlet域中获取用户的集合
        userService.regist(userList, user);
        System.out.println(userList);
        //显示处理结果
        resp.sendRedirect("/login.jsp");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }
}
