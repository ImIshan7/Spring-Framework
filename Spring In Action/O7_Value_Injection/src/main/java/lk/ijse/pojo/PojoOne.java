package lk.ijse.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PojoOne {


  /*  public PojoOne( ){
        System.out.println("PojoOne Instantiated");
    }*/


   /* public PojoOne(@Value("Hello") String id){

        System.out.println("PojoOne Instantiated : " + id);
    }*/

/*
   public PojoOne(@Value("True") boolean id){
        System.out.println("PojoOne Instantiated : " + id);
   }*/

    /*public PojoOne(@Value("7") Integer id){
        System.out.println("PojoOne Instantiated : " + id);
    }*/

    public PojoOne(@Value("C001,C002,C003") String[] id){
        for (String s : id) {
            System.out.println(s);
        }
    }

}
