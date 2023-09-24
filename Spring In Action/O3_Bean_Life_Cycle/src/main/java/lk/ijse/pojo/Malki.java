package lk.ijse.pojo;


import org.springframework.stereotype.Component;

@Component
public class Malki implements Girl {

    public Malki(){
        System.out.println("Malki Instantiated");
    }


    public void chatting(){
        System.out.println("La la");
    }

    @Override
    public void trying() {

    }
}
