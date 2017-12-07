package com.guanweiming.common;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author https://github.com/zziaguan/
 */
public class CorsFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, javax.servlet.FilterChain filterChain) throws ServletException, IOException {
        response.setHeader("Access-Control-Max-Age", getMaxAge());
        response.setHeader("Access-Control-Allow-Origin", getAllowOrigin());
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", getAllowMethods());
        response.setHeader("Access-Control-Allow-Headers", "Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
        long start = System.currentTimeMillis();
        beforeProcess(request,response);
        filterChain.doFilter(request, response);
        afterProcess(request,response);
        long end = System.currentTimeMillis();
        processTime(end-start);

    }



    protected String getAllowOrigin() {
        return "*";
    }

    protected String getMaxAge() {
        return "3600";
    }

    protected String getAllowMethods() {
        return "GET,HEAD,OPTIONS,POST,PUT,DELETE";
    }

    protected void processTime(final long time){

    }

    /**
     * 方便用户在处理之前搞些事情
     */
    protected void beforeProcess(final HttpServletRequest request,final HttpServletResponse response){

    }
    /**
     * 方便用户在处理之后搞些事情
     */
    private void afterProcess(final HttpServletRequest request,final HttpServletResponse response) {

    }

}
