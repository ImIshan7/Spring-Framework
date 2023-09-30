package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class PojoOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoOne(){
        System.out.println("Pojo One Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        System.out.println("Pojo One : Bean Factory Awareness");
    }

    @Override
    public void setBeanName(String s) {

        System.out.println("Pojo One : Bean Name Awareness");
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("Pojo One : Disposable Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Pojo One : Initializing Bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("Pojo One : Application Context Awareness");
    }
}
