package ru.javabegin.training.spring.impls.samsung;

import lombok.Setter;
import lombok.Getter;
import ru.javabegin.training.spring.interfaces.Hand;
import ru.javabegin.training.spring.interfaces.Head;
import ru.javabegin.training.spring.interfaces.Leg;
import ru.javabegin.training.spring.interfaces.Robot;

public class SamsungRobot implements Robot {

    @Setter
    @Getter
    private Hand hand;

    @Setter
    @Getter
    private Leg leg;

    @Setter
    @Getter
    private Head head;

    public SamsungRobot() {
    }

    public SamsungRobot(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }

    public void dance() {
        System.out.println("T1000 is dancing!");
    }

}

