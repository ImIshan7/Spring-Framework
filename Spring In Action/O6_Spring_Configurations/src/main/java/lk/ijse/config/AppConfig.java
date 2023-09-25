package lk.ijse.config;


import lk.ijse.pojo.PojoThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "lk.ijse")
//@Import({ConfigTwo.class,ConfigThree.class})

public class AppConfig {


    public AppConfig(){
        System.out.println("AppConfig Instantiated");
    }

    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }

}
