package ru.javabegin.training.spring.impls.philips;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring.impls.robot.ModelT1000;

@Component
public class ModelT1000PhilipsImpl {

    @Autowired
    PhilipsHand philipsHand;

    @Autowired
    PhilipsHead philipsHead;

    @Autowired
    PhilipsLeg philipsLeg;

    public void createPhilips() {
        new ModelT1000(philipsHand, philipsLeg, philipsHead).action();
    }
}
