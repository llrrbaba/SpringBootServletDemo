package cn.rocker.springbootservletdemo.config;

import cn.rocker.springbootservletdemo.filter.MyFilter;
import cn.rocker.springbootservletdemo.listener.MyListener;
import cn.rocker.springbootservletdemo.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.EventListener;

/**
 * @author rocker
 * @version V1.0
 * @Description:
 * @date 2018/6/27 22:04
 */
@Configuration
public class ServerConfig {

    /**
     * 注册Servlet
     */
    @Bean
    public ServletRegistrationBean getMyServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(),"/myServlet");
        return servletRegistrationBean;
    }


    /**
     * 注册filter
     */
    @Bean
    public FilterRegistrationBean getMyFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/hello","/myServlet"));
        return filterRegistrationBean;
    }


    /**
     * 注册listener
     */
    @Bean
    public ServletListenerRegistrationBean getMyListener(){
        ServletListenerRegistrationBean<MyListener> servletListenerRegistrationBean =
                new ServletListenerRegistrationBean<>(new MyListener());
        return servletListenerRegistrationBean;
    }
}
