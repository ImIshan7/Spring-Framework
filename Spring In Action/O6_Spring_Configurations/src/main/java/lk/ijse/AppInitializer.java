package lk.ijse;

import lk.ijse.config.AppConfig;
import lk.ijse.config.ConfigThree;
import lk.ijse.config.ConfigTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);
       /* ctx.register(ConfigTwo.class);
        ctx.register(ConfigThree.class);*/

        ctx.refresh();
        ctx.registerShutdownHook();



    }
}


