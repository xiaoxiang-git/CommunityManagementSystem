package com.springboot.cms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 跨域配置
 *
 * @author YuanhuiHo
 */
@Configuration
public class CORSConfig {

    //跨域支持
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                //addMapping->配置支持跨域的路径-全部
                //allowedHeaders->配置允许的请求头-全部
                //allowedMethods->配置支持跨域请求的方法-全部
                //allowOrigins->配置允许的源-所有
                registry.addMapping("/**")
                        .allowedHeaders("*")
                        .allowedMethods("*")
                        .allowedOrigins("*");
            }
        };
    }

}
