package com.watchman.w4ps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig  {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        // .csrf(csrf -> csrf.disable())
        return http
        .authorizeHttpRequests( auth -> {
            auth.requestMatchers("/").permitAll(); 
            // add the urls that will not require oauth 
            auth.anyRequest().authenticated();

        })
        .oauth2Login(
            // Here we can provide our own custom 
            withDefaults()

            )
        //specify that we want oauth2 to login for
        .formLogin(withDefaults())
        .build();
    }
    
}
