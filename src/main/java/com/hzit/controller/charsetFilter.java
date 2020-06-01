package com.hzit.controller;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
@WebServlet("/.*")
public class charsetFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServlet req=(HttpServlet) request;
      String s= (String)req.getServletName();
        System.out.println("s = " + s);
        System.out.println("拦截成功");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {


        System.out.println("拦截成功");
    }
}
