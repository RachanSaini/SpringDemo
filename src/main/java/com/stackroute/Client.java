package com.stackroute;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

    public static void main(String[] args){


        //Object construction | Done by Developer
        System.out.println("Object construction");
        Employee eRef = new Employee();
        eRef.setEid(101);
        eRef.setEname("Rachan saini");
        eRef.setEaddress("Koramangala Bangalore");
        System.out.println("Employee Details: "+ eRef);

        //Spring May | TOC(Inversion of Control)
        System.out.println("spring IOC");

        //Resource resource = new ClassPathResource("employeebean.xml");
        //BeanFactory factory = new XmlBeanFactory(resource); //Spring Container which shall parse XML file and construct objects.
        //Employee e1 = (Employee) factory.getBean("emp1");
        //Employee e2 = factory.getBean("emp2",Employee.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("employeeBean.xml");
        Employee e1 = (Employee) context.getBean("emp1");
        Employee e2 = context.getBean("emp2",Employee.class);

        System.out.println(e1);
        System.out.println(e2);


    }
}
