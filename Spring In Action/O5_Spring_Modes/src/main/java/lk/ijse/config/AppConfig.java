package lk.ijse.config;

import lk.ijse.pojo.PojoThree;
import lk.ijse.pojo.PojoTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.pojo")
public class AppConfig {

    //Full mode of @Bean annotation
  /*  @Bean
    public PojoTwo pojoTwo(){

        //inter-bean dependency invoke here
        PojoThree pojoThree = pojoThree();
        PojoThree pojoThree1 = pojoThree();
        System.out.println(pojoThree);
        System.out.println(pojoThree1);
        return new PojoTwo();
    }

    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }*/
}
