package lk.ijse;

import lk.ijse.beans.BeanA;
import lk.ijse.beans.BeanB;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        /*Runtime.getRuntime().addShutdownHook(new Thread(ctx::close));*/

        BeanA beanA = (BeanA) ctx.getBean("beanA");
        BeanB beanB = (BeanB) ctx.getBean("beanB");


        System.out.println(beanA);
        System.out.println(beanB);


    }
}
