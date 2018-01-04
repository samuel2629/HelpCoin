package com.silho.helpcoin.configuration;

import org.hashids.Hashids;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("app.properties")
public class AppConfig {
    @Bean
    public Hashids hashids(){
        return new Hashids(env.getProperty("helpcoin.hash.salt"),8);
    }

}
