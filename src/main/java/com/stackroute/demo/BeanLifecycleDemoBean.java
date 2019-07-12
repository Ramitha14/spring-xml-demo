package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean has been initialized");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean has been destroyed");

    }
    public void custominit(){
        System.out.println("Bean has been initialized1");
    }
    public void customDestroy(){
        System.out.println("Bean has been destroyed");

    }
}
