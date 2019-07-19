package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements BeanFactoryAware, ApplicationContextAware, BeanNameAware {
    private Actor actor;
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException{
        System.out.println("BeanFactoryAware is implemented");
    }
    public void  setBeanName(String str){
        System.out.println("Bean name is implemented");
    }
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException{
        System.out.println("ApplicationcontextAware is implemented");
    }
//default constructor
    public Movie(){}
 //parameterized constructor
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display() {
        System.out.println("The name is " + actor.getName() + " The gender is " + actor.getGender() + " The age is " + actor.getAge());

    }
}
