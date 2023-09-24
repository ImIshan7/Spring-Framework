package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component("iman-bro")
public class ImanPojo {
    public ImanPojo(){
        System.out.println("Iman Pojja");
    }



    public void imanIsDancing(){
        System.out.println("La la la la ala al");
    }
}
