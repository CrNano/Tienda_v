/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda;

import com.tienda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 *
 * @author johan
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    @Autowired
    private UserService userDetailsService;
    
    @Bean
    public BCryptoPasswordEnconder passwordEnconder(){
     return new BCryptoPasswordEnconder();
    }
    
    @Bean
    public BCryptoPasswordEnconder passwordEnconder(){
     return new BCryptoPasswordEnconder();
    }
    
}
