package lk.ijse.config;

import lk.ijse.pojo.PojoFive;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigThree {
    public ConfigThree(){
        System.out.println("ConfigThree Instantiated");
    }

    @Bean
    public PojoFive pojoFive(){
        return new PojoFive();
    }
}
