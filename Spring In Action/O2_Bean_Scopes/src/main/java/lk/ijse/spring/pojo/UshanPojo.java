package lk.ijse.spring.pojo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UshanPojo {
    public UshanPojo(){
        System.out.println("Ushan Pojja");
    }
}
