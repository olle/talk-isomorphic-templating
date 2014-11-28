package com.studiomediatech.talks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.mustache.MustacheViewResolver;
import org.springframework.web.servlet.view.mustache.jmustache.JMustacheTemplateFactory;
import org.springframework.web.servlet.view.mustache.jmustache.JMustacheTemplateLoader;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.studiomediatech.talks.controller" })
public class WebAppConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/templates/**").addResourceLocations("/templates/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/img/**").addResourceLocations("/img/");
    }


    @Bean
    public ViewResolver viewResolver() {

        MustacheViewResolver viewResolver = new MustacheViewResolver();

        viewResolver.setPrefix("/templates/");
        viewResolver.setSuffix(".mustache");
        viewResolver.setCache(false); // development only
        viewResolver.setTemplateFactory(templateFactory());

        return viewResolver;
    }


    @Bean
    public JMustacheTemplateFactory templateFactory() {

        JMustacheTemplateFactory templateFactory = new JMustacheTemplateFactory();
        templateFactory.setEscapeHTML(true);
        templateFactory.setStandardsMode(false);
        templateFactory.setTemplateLoader(templateLoader());

        return templateFactory;
    }


    @Bean
    public JMustacheTemplateLoader templateLoader() {

        return new JMustacheTemplateLoader();
    }
}
