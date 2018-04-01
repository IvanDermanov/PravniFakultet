package com.view;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/index").setViewName("index");
		registry.addViewController("/nastavnik/hello").setViewName("/nastavnik/hello");
		registry.addViewController("/student/hello").setViewName("/student/hello");
		registry.addViewController("/nastavnik/loginNastavnik").setViewName("/nastavnik/loginNastavnik");
		registry.addViewController("/student/loginStudent").setViewName("/student/loginStudent");
		registry.addViewController("/logout").setViewName("index");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css").addResourceLocations("/css/");
		//registry.addResourceHandler("/webjars").addResourceLocations("/webjars/");
	}
}