package ru.itmonopoly.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
MyLogic myLogic = context.getBean(MyLogic.class);
myLogic.selectUsers();
    }
}
