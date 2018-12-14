package ru.javabegin.training.spring.impls.nokia;

import ru.javabegin.training.spring.interfaces.Hand;

public class NokiaHand implements Hand {
    public void catchSomething() {
        System.out.println("Catched from Nokia");
    }
}
