package lk.ijse.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


// @Component
// This is not my class. I have commented it out.
public class PojoTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoTwo(){
        System.out.println("PojoTwo Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Pojo Two Bean Factory Aware");
    }

    @Override
    public void setBeanName(String s) {

        System.out.println("Pojo Two Bean Name Aware");
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("Pojo Two Disposable Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Pojo Two Initializing Bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("Pojo Two Application Context Aware");
    }
}
