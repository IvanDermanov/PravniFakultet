package com.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Configuration
	public static class RegularSecurityConfig extends WebSecurityConfigurerAdapter {
		@Override
        protected void configure(HttpSecurity http) throws Exception {
            //@formatter:off
            http
                .authorizeRequests()
                    .antMatchers("/css/**","/index", "/").permitAll()
                    .antMatchers("/student/**").hasRole("STUDENT")
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage("/student/loginStudent")
                    .defaultSuccessUrl("/student/hello")
                    .permitAll()
                    .and()
                .logout()
                    .logoutUrl("/logout")
                    .permitAll()
                    .deleteCookies("JSESSIONID")	
                    .and()
      	          	.exceptionHandling()
      	          	.accessDeniedPage("/403")
      	          	.and()
      	          	.csrf().disable();
            //@formatter:on
        }
	}

	@Configuration
	@Order(1)
	public static class SpecialSecurityConfig extends WebSecurityConfigurerAdapter {
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			// @formatter:off
			http.antMatcher("/nastavnik/**").authorizeRequests().antMatchers("/nastavnik/**").hasRole("NASTAVNIK")
					.anyRequest().authenticated().and().formLogin().loginPage("/nastavnik/loginNastavnik")
					.defaultSuccessUrl("/nastavnik/hello.html").permitAll().and().logout()
					.logoutUrl("/nastavnik/logout").permitAll().deleteCookies("JSESSIONID").and().exceptionHandling()
					.accessDeniedPage("/403").and().csrf().disable();
			// @formatter:on
		}
	}

	@Bean
	public UserDetailsService userDetailsService() {
		// ensure the passwords are encoded properly
		@SuppressWarnings("deprecation") // !!! P O P R A V I T I !!!
		UserBuilder users = User.withDefaultPasswordEncoder();
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(users.username("a").password("a").roles("NASTAVNIK").build());
		manager.createUser(users.username("261/2016").password("123").roles("STUDENT").build());
		manager.createUser(users.username("12/2017").password("123").roles("STUDENT").build());
		manager.createUser(users.username("127/2015").password("123").roles("STUDENT").build());
		manager.createUser(users.username("126/2015").password("123").roles("STUDENT").build());
		manager.createUser(users.username("126/2014").password("123").roles("STUDENT").build());
		return manager;
	}
}