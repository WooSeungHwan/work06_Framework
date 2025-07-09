package spring.service.dice.impl;

import java.util.Random;

import spring.service.dice.Dice;

public class DiceDImpl implements Dice{
	private int value;

	@Override
	public void selectedNumber() {
		value = new Random().nextInt(6) + 1;		
	}

	@Override
	public int getValue() {
		return value;
	}

	public DiceDImpl(int value) {
		super();
		this.value = value;
	}

	public DiceDImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}

// 컴포넌트다. POJO가 아니다.
