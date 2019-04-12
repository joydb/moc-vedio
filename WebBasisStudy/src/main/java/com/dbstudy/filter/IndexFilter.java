package com.dbstudy.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@Component
@WebFilter
public class IndexFilter implements Filter {
    private Logger logger=LoggerFactory.getLogger(this.getClass());
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //过滤器初始化
        logger.info("我是过滤器，我已经初始化。。。。。。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest request=(HttpServletRequest) servletRequest;
//        HttpServletResponse response= (HttpServletResponse) servletResponse;
//        HttpSession session=  request.getSession();
//        Object user=session.getAttribute("UserName");
//        //如果是登陆页面就直接放行
//        String path=request.getRequestURI();
//        logger.info(path);
//        if(path=="/login.html")
//        {
//            logger.info("是登陆页面，已经放行。。。。。。");
//            filterChain.doFilter(request,response);
//            return;
//        }
//        //如果没有找到该用户
//        if (user==null)
//        {
//            logger.info("未登陆访问。。。。。。");
//            return;
//        }
//        filterChain.doFilter(servletRequest,servletResponse);
//        logger.info("登陆了以后访问。。。。。。");
    }

    @Override
    public void destroy() {

    }
}
