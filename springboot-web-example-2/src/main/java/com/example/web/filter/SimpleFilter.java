package com.example.web.filter;

import org.springframework.http.MediaType;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Random;

@WebFilter(filterName = "SimpleFilter", urlPatterns = "/second")
public class SimpleFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("有请求访问 /second");

        Random random = new Random();
        if (random.nextBoolean()) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            servletResponse.setCharacterEncoding("UTF-8");
            servletResponse.setContentType(MediaType.TEXT_PLAIN_VALUE);
            PrintWriter writer = servletResponse.getWriter();
            writer.write("随机失败");
        }
    }
}
