package com.stackroute.domain;

//import org.graalvm.compiler.nodes.NodeView;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String args[])
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movieA=context.getBean("movieA",Movie.class);
        movieA.display();

        Movie movieB=context.getBean("movieB",Movie.class);
        movieB.display();

        Movie movieC=context.getBean("movieC",Movie.class);
        movieC.display();

        Movie movieD=context.getBean("movieD",Movie.class);
        movieD.display();

        Movie movieE=context.getBean("movieE",Movie.class);
        movieE.display();

        Movie movieF=context.getBean("movieF",Movie.class);
        movieF.display();

        Movie movie4=context.getBean("movieE",Movie.class);
        System.out.println(movieE==movie4);



//        BeanFactory factory=new ClassPathXmlApplicationContext("beans.xml");
//        movie=factory.getBean("movie",Movie.class);
//        movie.display();

//        DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
//        BeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactory);
//        reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
//        Movie movie1=(Movie)beanFactory.getBean("movie");
//        movie1.display();
//
//        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
//        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        beanDefinitionReader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
//        Movie moviebean1=(Movie)beanFactory.getBean("movie");
//        moviebean1.display();
    }
}
