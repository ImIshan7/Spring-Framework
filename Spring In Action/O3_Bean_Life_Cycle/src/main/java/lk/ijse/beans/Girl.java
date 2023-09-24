package lk.ijse.beans;

import org.springframework.stereotype.Component;

@Component
public class Girl {

    public Girl(){
        System.out.println("Girl Instantiated");
    }

    BoyImpl max;

    public void chatting(){
        System.out.println("La la");
    }

    public Girl(BoyImpl max){
        this.max = max;
        System.out.println("constructor injection");




    }
}
