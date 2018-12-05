package ru.javabegin.training.spring.impls.philips;

import org.springframework.stereotype.Component;
import ru.javabegin.training.spring.interfaces.Head;

@Component
public class PhilipsHead implements Head {

    public void calc() {
        System.out.println("Thinking about Philips");
    }
}
