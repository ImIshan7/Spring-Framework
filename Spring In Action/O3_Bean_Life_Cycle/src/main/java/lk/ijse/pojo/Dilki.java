package lk.ijse.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class Dilki implements Girl {

    @Autowired
    Dilki dilki;

    public Dilki(){
        System.out.println("Dilki Instantiated");
    }


    public void chatting(){
        System.out.println("La la");
    }

    @Override
    public void trying() {

    }
}
