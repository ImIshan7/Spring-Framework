package lk.ijse.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component
// This is not my class. I have commented it out.
public class PojoThree implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoThree(){
        System.out.println("PojoThree Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Pojo Three Bean Factory Aware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Pojo Three Bean Name Aware");

    }

    @Override
    public void destroy() throws Exception {

        System.out.println("Pojo Three Disposable Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Pojo Three Initializing Bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(" Pojo Three Application Context Aware");
    }
}
