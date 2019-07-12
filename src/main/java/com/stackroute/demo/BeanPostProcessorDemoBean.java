package com.stackroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean,String beanName)throws BeansException{
        System.out.println("Before Post process initialization() for:"+ beanName);
        return bean;
    }
    public Object postProcessAfterInitialization(Object bean,String beanName)throws BeansException{
        System.out.println("after Post process initialization() for:"+ beanName);
        return bean;
    }


}
