/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 *
 * @author johan
 */
public class WebConfig implements WebMvcConfigurer{
    
    @Bean
    public SessionLocaleResolver localeResolver(){
        var sir= new SessionLocaleResolver();
        sir.setDefaultLocale(new Locale("es"));
        return sir;
}
    
}
