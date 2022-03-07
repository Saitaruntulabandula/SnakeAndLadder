package com.bridgelabz;

public class SnakeAndLadder {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int WINNIGPOSITION = 100;

	public static void main(String[] args) {
		int startingPosition = 0;
		System.out.println("Initial position of player is : " +startingPosition);
		
		while(startingPosition<WINNIGPOSITION) {
		int numberOnDie = RandomDieValue();
		System.out.println("Number on Die is : " +numberOnDie);
		int option = RandomOption();
		
		switch(option) {
		case LADDER :
			System.out.println("The option is Ladder " +LADDER );
			startingPosition+=numberOnDie;
			if (startingPosition>100) {
				startingPosition-=numberOnDie;
				System.out.println("Current position crossed 100,So Please roll the die again !!!!!");
			}
				break;
		case SNAKE:
			System.out.println("The option is Snake " +SNAKE);
			startingPosition-=numberOnDie;
			if (startingPosition < 0)
				startingPosition = 0;
			break;
		default:
			System.out.println("No play");
			}
		System.out.println("Current Position of Player :  "+startingPosition);
		}
		System.out.println("player Won");		
	}
	private static int RandomOption() {
		int RandomOption = (int) Math.floor((Math.random() * 3));
		return RandomOption;
	}

	private static int RandomDieValue() {
		int RandomDieValue = (int) Math.floor((Math.random() * 6) + 1);
		return RandomDieValue;
	}
}
