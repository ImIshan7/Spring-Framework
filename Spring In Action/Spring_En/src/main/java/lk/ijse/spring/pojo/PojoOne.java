package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PojoOne implements InitializingBean{

    @Value("${user.name}")
    private String userName;

    @Value("${os.name")
    private String osName;

    public PojoOne(){
        System.out.println(" 1 Pojo One Instantiated");
    }

    @Autowired
    Environment env;

    @Override
    public void afterPropertiesSet() throws Exception {
        env.getProperty("dbUserName");
        System.out.println("User Name : "+userName);
        System.out.println("OS Name : "+osName);
        String s = env.getProperty("Url");


    }


}
