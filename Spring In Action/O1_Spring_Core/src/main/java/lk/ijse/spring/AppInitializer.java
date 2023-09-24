package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.BasicDataSource;
import lk.ijse.spring.pojo.ImanPojo;
import lk.ijse.spring.pojo.UshanPojo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();


        ImanPojo iman1 = ctx.getBean(ImanPojo.class);
        ImanPojo iman2 = ctx.getBean(ImanPojo.class);


        ImanPojo iman3 = (ImanPojo) ctx.getBean("iman-bro");
        UshanPojo ushanPojo = (UshanPojo) ctx.getBean("ushanPojo");
//
//        iman1.imanIsDancing();
//
        System.out.println(iman1);
        System.out.println(iman2);
        System.out.println(iman3);
        System.out.println(ushanPojo);


        BasicDataSource pool1 = ctx.getBean(BasicDataSource.class);
        BasicDataSource pool2 = ctx.getBean(BasicDataSource.class);
        BasicDataSource pool3 = (BasicDataSource) ctx.getBean("pool");
        System.out.println(pool1);
        System.out.println(pool2);
        System.out.println(pool3);
    }
}
