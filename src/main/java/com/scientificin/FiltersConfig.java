package com.scientificin;

import javax.servlet.Filter;

import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.scientificin.filters.LoginFilter;

@Configuration
public class FiltersConfig {

	@Bean
	public FilterRegistrationBean someFilterRegistration() {
	    FilterRegistrationBean registration = new FilterRegistrationBean();
	    registration.setFilter(new LoginFilter());
	    registration.addUrlPatterns("/in/*");
	    registration.setName("loginFilter");
	    registration.setOrder(1);
	    return registration;
	} 

	@Bean(name = "loginFilter")
	public Filter LoginFilter() {
	    return new LoginFilter();
	}

}
