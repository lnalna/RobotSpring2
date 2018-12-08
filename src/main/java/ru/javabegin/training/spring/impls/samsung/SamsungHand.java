package ru.javabegin.training.spring.impls.samsung;

import ru.javabegin.training.spring.interfaces.Hand;

public class SamsungHand implements Hand {
    public void catchSomething() {
        System.out.println("Samsung catched");
    }
}
