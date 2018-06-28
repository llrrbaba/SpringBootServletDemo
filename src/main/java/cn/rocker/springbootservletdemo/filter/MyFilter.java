package cn.rocker.springbootservletdemo.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author rocker
 * @version V1.0
 * @Description:
 * @date 2018/6/27 22:11
 */
public class MyFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("myFilter processed...");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
