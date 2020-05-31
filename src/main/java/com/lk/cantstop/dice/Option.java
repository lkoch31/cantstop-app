package com.lk.cantstop.dice;

public class Option {
	
	Integer[] allDice;
	Combination[] combination1;
	Combination[] combination2;
	Combination[] combination3;
	
	public Option(Roll roll) {
		
		allDice = new Integer[] {roll.getDie1(), roll.getDie2(), roll.getDie3(), roll.getDie4()};
		
		Combination firstAndSecond = new Combination(roll.getDie1(), roll.getDie2());
		Combination thirdAndFourth = new Combination(roll.getDie3(), roll.getDie4());
		combination1 = new Combination[] {firstAndSecond, thirdAndFourth};
		
		Combination firstAndThird = new Combination(roll.getDie1(), roll.getDie3());
		Combination secondAndFourth = new Combination(roll.getDie2(), roll.getDie4());
		combination2 = new Combination[] {firstAndThird, secondAndFourth};

		
		Combination firstAndFourth = new Combination(roll.getDie1(), roll.getDie4());
		Combination secondAndThird = new Combination(roll.getDie2(), roll.getDie3());
		combination3 = new Combination[] {firstAndFourth, secondAndThird};

	}
	
	public Integer[] getAllDice() {
		return allDice;
	}
	
	public void setAllDice(Integer[] allDice) {
		this.allDice = allDice;
	}

	public Combination[] getCombination1() {
		return combination1;
	}

	public void setCombination1(Combination[] combination1) {
		this.combination1 = combination1;
	}

	public Combination[] getCombination2() {
		return combination2;
	}

	public void setCombination2(Combination[] combination2) {
		this.combination2 = combination2;
	}

	public Combination[] getCombination3() {
		return combination3;
	}

	public void setCombination3(Combination[] combination3) {
		this.combination3 = combination3;
	}

	public class Combination {
		
		private Integer value;
		
		private Integer[] dice;
		
		public Combination(Integer die1, Integer die2) {
			
			value = die1 + die2;
			dice = new Integer[] {die1, die2};
			
		}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		public Integer[] getDice() {
			return dice;
		}

		public void setDice(Integer[] dice) {
			this.dice = dice;
		}		
		
	}

}
