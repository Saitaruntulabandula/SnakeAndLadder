package com.bridgelabz;

public class SnakeAndLadder {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	
	public static void main(String[] args) {
		int playerCurrentPosition = 0;
		System.out.println("Initial position of player is : " +playerCurrentPosition);
		int numberOnDie = RandomDieValue();
		System.out.println("Number on Die is : " +numberOnDie);
		int option = RandomOption();
		System.out.println("The option is " +option);
		
		switch(option) {
		case LADDER :
			playerCurrentPosition+=numberOnDie;
			break;
		case SNAKE:
			playerCurrentPosition-=numberOnDie;
			if (playerCurrentPosition < 0)
				playerCurrentPosition = 0;
			break;
		default:
			System.out.println("No play");
		}
		System.out.println(playerCurrentPosition);		
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