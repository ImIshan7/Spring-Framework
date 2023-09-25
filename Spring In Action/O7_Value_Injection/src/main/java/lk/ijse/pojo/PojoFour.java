package lk.ijse.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PojoFour implements InitializingBean {

    @Value("${user.name}")
    private String userName;

    @Value("${os.name")
    private String osName;




    public PojoFour(){
        System.out.println("PojoFour Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoFour AfterPropertiesSet");
        System.out.println("User Name : "+userName);
        System.out.println("OS Name : "+osName);
    }
}
