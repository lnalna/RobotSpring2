package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javabegin.training.spring.impls.philips.ModelT1000PhilipsImpl;
import ru.javabegin.training.spring.impls.robot.ModelT1000;
import ru.javabegin.training.spring.impls.samsung.SamsungRobot;

public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        t1000.action();

        System.out.println();
        ModelT1000 toshibaRobot = (ModelT1000) context.getBean("toshibaRobot");
        toshibaRobot.action();

        System.out.println();
        ModelT1000PhilipsImpl modelT1000PhilipsImpl = (ModelT1000PhilipsImpl) context.getBean("modelT1000PhilipsImpl");
        modelT1000PhilipsImpl.createPhilips();

        System.out.println();
        SamsungRobot samsungRobot = (SamsungRobot) context.getBean("samsungRobot");
        samsungRobot.action();

        System.out.println();
        ModelT1000 nokiaRobot = (ModelT1000) context.getBean("nokiaRobot");
        nokiaRobot.action();
    }
}
