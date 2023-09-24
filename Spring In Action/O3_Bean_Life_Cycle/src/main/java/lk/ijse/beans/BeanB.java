package lk.ijse.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanB implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public BeanB(){
        System.out.println("BeanB : constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Awareness (DI)");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Awareness "+s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Bean - Now my service is over - I am ready to die");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean - Bean is ready to use");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Awareness (DP,AOP)");
    }
}
