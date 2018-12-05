package ru.javabegin.training.spring.impls.philips;

import org.springframework.stereotype.Component;
import ru.javabegin.training.spring.interfaces.Leg;

@Component
public class PhilipsLeg implements Leg {

    public void go() {
        System.out.println("Go to the Philips");
    }
}
