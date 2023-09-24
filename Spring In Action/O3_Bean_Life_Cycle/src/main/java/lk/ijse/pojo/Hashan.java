package lk.ijse.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Hashan{


    @Qualifier("malki")
    @Autowired
    Girl girl;

    public Hashan(){
        System.out.println("Hashan Instantiated");
    }

   public void chatting(){
       girl.chatting();
   }

}
