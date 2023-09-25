package lk.ijse.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PojoOne {

    public PojoOne(){
        System.out.println("PojoOne Instantiated");
    }


    //lite mode of @Bean annotation
    @Bean
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
    }
}
