package lk.ijse.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PojoOne implements InitializingBean {


    @Value("Galle IJSE")
    private String address;


    @Autowired(required = false)
     public PojoOne(@Value("Hello") String id,@Value("Ishan") String Name, @Value("Galle") String Address){
        System.out.println("PojoOne Instantiated 1 : " + id);
        System.out.println("PojoOne Instantiated 1 : " + Name);
        System.out.println("PojoOne Instantiated 1 : " + Address);
    }



    @Autowired(required = false)
    public PojoOne(@Value("Hello") String id , @Value("Ishan") String Name){

        System.out.println("PojoOne Instantiated 2 : " + id);
        System.out.println("PojoOne Instantiated 2 : " + Name);
    }






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

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.address);//IJSE Galle

    }
}
