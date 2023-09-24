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

        UshanPojo bean1 = ctx.getBean(UshanPojo.class);
        System.out.println(bean1);

        UshanPojo bean2 = ctx.getBean(UshanPojo.class);
        System.out.println(bean2);
    }
}
