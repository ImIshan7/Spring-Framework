package lk.ijse.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy implements BoyImpl{
    @Autowired
    Girl girl;

    public Boy(){
        System.out.println("Boy Instantiated");
    }

    @Override
    public void trying(){
        girl.chatting();
    }


}
