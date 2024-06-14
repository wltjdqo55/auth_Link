package com.auth.auth_link.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

@Configuration
public class mvcConfiguration implements WebMvcConfigurer {

  @Override
  public void addResourceHandlers(final ResourceHandlerRegistry registry){
    registry.addResourceHandler("/**")
        .addResourceLocations("classpath:/templates/")
        .setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES));
  }
}
