package com.Team12.YQdemo.config存放配置类;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FileUploadConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**").
                addResourceLocations("file:///D:/IDEA/Team12/src/main/resources/images/");
//        如果不知道如何以file开头就用浏览器打开该图片

//
    }
}
