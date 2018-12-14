package ru.javabegin.training.spring.impls.robot;

import ru.javabegin.training.spring.interfaces.Hand;
import ru.javabegin.training.spring.interfaces.Head;
import ru.javabegin.training.spring.interfaces.Leg;
import ru.javabegin.training.spring.interfaces.Robot;

import lombok.Getter;
import lombok.Setter;

public class ModelT1000 implements Robot {

	@Setter
	@Getter
	private Hand hand;

	@Setter
	@Getter
	private Leg leg;

	@Setter
	@Getter
	private Head head;

	@Setter
	@Getter
	private String color;

	@Setter
	@Getter
	private int year;

	@Setter
	@Getter
	private boolean isSoundEnabled;

	public ModelT1000() {
	}

	public ModelT1000(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean isSoundEnabled) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
		this.color = color;
		this.year = year;
		this.isSoundEnabled = isSoundEnabled;
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
