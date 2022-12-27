package com.sevensevengsi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
//		return new BCryptPasswordEncoder();
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeHttpRequests()
			.antMatchers("/home/**").hasAnyRole("ADMIN", "MANAGER", "OFFICIAL")
			.antMatchers("/teams/**").hasRole("ADMIN")
			.antMatchers("/tournament-records/all/**").hasRole("ADMIN")
			.antMatchers("/managers/all/**").hasRole("ADMIN")
			.antMatchers("/officials/all/**").hasRole("ADMIN")
			.antMatchers("/games/all/**").hasRole("ADMIN")
			.antMatchers("/register-team/**").hasRole("MANAGER")
			.antMatchers("/edit-team-info/**").hasRole("MANAGER")
			.antMatchers("/team-record/**").hasRole("MANAGER")
			.antMatchers("/send-result/**").hasRole("OFFICIAL")
			.and()
			.formLogin()
			.permitAll()
			.and()
			.logout()
			.and()
			.exceptionHandling().accessDeniedPage("/access-denied");
;
	}

}
