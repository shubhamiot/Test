package com.cg.train.ticket.reservation.security;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class TrainTicketSecurity extends WebSecurityConfigurerAdapter {
	
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	@Autowired
	private DataSource dataSource;
	
	@Value("${spring.queries.users-query}")
	private String usersQuery;

	@Value("${spring.queries.roles-query}")
	private String rolesQuery;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/loginadmin").permitAll()
			.antMatchers("/login-admin").permitAll()
			.antMatchers("/booking").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER")
			.antMatchers("/savebooking").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER")
			.antMatchers("/deletebooking").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER")
			.antMatchers("/register").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER")
			.antMatchers("/saveuser").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER")
			.antMatchers("/deleteuser").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER")
			.antMatchers("/login").permitAll()
			.antMatchers("/loginuser").permitAll()
			.antMatchers("/booktrain").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER")
			.antMatchers("/savetocart").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER")
			.antMatchers("/deleteitemfromcart").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER")
			.antMatchers("/byitems").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER")
			.antMatchers("/back").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER")
			.anyRequest().authenticated()
			.and()
			.csrf().disable().formLogin()
			.loginPage("/loginadmin")
			.loginPage("/login")
			.defaultSuccessUrl("/booking")
			.usernameParameter("username")
			.passwordParameter("password")
			.and()
			.logout()
			.logoutSuccessUrl("/")
			.and()
			.exceptionHandling()
			.accessDeniedPage("/access-denied");
			
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");
	}

}
