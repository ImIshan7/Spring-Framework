package lk.ijse.config;


import lk.ijse.pojo.PojoFour;
import lk.ijse.pojo.PojoTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigTwo {
    public ConfigTwo(){

        System.out.println("ConfigTwo Instantiated");

    }


    @Bean
    public PojoTwo pojoTwo(){
        return new PojoTwo();
    }

    @Bean
    public PojoFour pojoFour(){
        return new PojoFour();
    }
}
