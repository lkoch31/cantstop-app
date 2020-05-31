package com.lk.cantstop.dice;

public class Roll {
	
	private Integer die1;
	private Integer die2;
	private Integer die3;
	private Integer die4;
	
	public Roll() {
		
		die1 = getSingleDieRoll();
		die2 = getSingleDieRoll();
		die3 = getSingleDieRoll();
		die4 = getSingleDieRoll();
		
	}

	public Integer getDie1() {
		return die1;
	}

	public void setDie1(Integer die1) {
		this.die1 = die1;
	}

	public Integer getDie2() {
		return die2;
	}

	public void setDie2(Integer die2) {
		this.die2 = die2;
	}

	public Integer getDie3() {
		return die3;
	}

	public void setDie3(Integer die3) {
		this.die3 = die3;
	}

	public Integer getDie4() {
		return die4;
	}

	public void setDie4(Integer die4) {
		this.die4 = die4;
	};
	
	private Integer getSingleDieRoll() {
		
		Double randomNum = Math.random() * 6 + 1;
		Double randomFloor = Math.floor(randomNum);
		
		return randomFloor.intValue();
		
	}

}
