package ru.javabegin.training.spring.impls.philips;

import org.springframework.stereotype.Component;
import ru.javabegin.training.spring.interfaces.Hand;

@Component
public class PhilipsHand implements Hand {

    public void catchSomething() {
        System.out.println("Catched from Philips");
    }
}
