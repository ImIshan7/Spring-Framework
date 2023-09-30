package lk.ijse.spring.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public MyController(){
        System.out.println("My Controller");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy Factory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" Factory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Set Application");
    }
}
