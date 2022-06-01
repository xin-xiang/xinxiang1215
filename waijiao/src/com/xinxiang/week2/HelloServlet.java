package com.xinxiang.week2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException {
        PrintWriter writer =response.getWriter();
        writer.println("name:xin xiang");
        writer.println("ID:2020211001001215");
        writer.println("2022 march tues 17.53");
        System.out.println("doGET");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }

    public HelloServlet() {
        System.out.println("构造方法....");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    public void destroy() {
        System.out.println("destroy...");
    }
}
