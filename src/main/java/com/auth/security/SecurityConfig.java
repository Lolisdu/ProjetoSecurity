package com.auth.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;
import static org.springframework.security.config.Customizer.withDefaults;





@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@Component
public class SecurityConfig {
	
 private final UserDetailsService usuarioDetailsService;		

	public SecurityConfig(UserDetailsService usuarioDetailsService) {
	this.usuarioDetailsService = usuarioDetailsService;
}

	@Bean
		org.springframework.security.crypto.password.PasswordEncoder PasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
    public SecurityFilterChain filterChain
    (HttpSecurity http) throws Exception {
        return http
              .csrf().disable()
              .authorizeRequests(auth -> auth
               .antMatchers("/", "/home", "usuario/acesso","usuario/acesso").permitAll()
               .anyRequest().authenticated()
                        )
                .userDetailsService(usuarioDetailsService)
                .headers(headers -> headers.frameOptions().sameOrigin())
                .httpBasic(withDefaults())
                		.build();
             
	}

}

