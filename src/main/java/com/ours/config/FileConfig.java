package com.ours.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ls
 * @date 2019-06-07 22:07
 * @description
 */
@Configuration
public class FileConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

//addResourceHandler是指你想在url请求的路径
//addResourceLocations是图片存放的真实路径

        registry.addResourceHandler("/**").addResourceLocations("file:case/file/", "file:contract/", "file:image/", "file:ukey/");
        //super.addResourceHandlers(registry);
    }
}

