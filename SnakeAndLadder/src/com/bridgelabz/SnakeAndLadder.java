package com.bridgelabz;

public class SnakeAndLadder {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int POSITION_LIMIT = 100;

	public static void main(String[] args) {
		int firstPlayerPosition = 0, secondPlayerPosition = 0;
		int count_Two = 0;
		int count_One = 0;
		System.out.println("First player initial position : " + firstPlayerPosition);
		System.out.println("Second player initial position : " + secondPlayerPosition);
		int isPlayerOneTurn = 1;
		while (firstPlayerPosition < POSITION_LIMIT && secondPlayerPosition < POSITION_LIMIT) {
			switch (isPlayerOneTurn) {
			case 1:
				int numberOnDie = RandomDieValue();
				System.out.println("Result of the Die is : " + numberOnDie);
				int option = RandomOption();

				switch (option) {
				case LADDER:
					System.out.println("The option is Ladder " + LADDER);
					firstPlayerPosition += numberOnDie;
					if (firstPlayerPosition > POSITION_LIMIT) {
						firstPlayerPosition -= numberOnDie;
						System.out.println("Current position crossed 100,So Please roll the die again !!!!!");
					}
					count_One++;
					break;
				case SNAKE:
					System.out.println("The option is Snake " + SNAKE);
					firstPlayerPosition -= numberOnDie;
					if (firstPlayerPosition < 0)
						firstPlayerPosition = 0;
					break;
				default:
					System.out.println("No play");
				}
				System.out.println("Current Position of first player :  " + firstPlayerPosition);
				if (firstPlayerPosition == POSITION_LIMIT)
					System.out.println("Player One won the Game ..... has rolled  " + count_One + " times");
				else
					isPlayerOneTurn = 0;
				break;
			case 0:
				int numberOnDie2 = RandomDieValue();
				System.out.println("Number on Die is : " + numberOnDie2);
				int option2 = RandomOption();

				switch (option2) {
				case LADDER:
					System.out.println("The option is Ladder " + LADDER);
					secondPlayerPosition += numberOnDie2;
					if (secondPlayerPosition > POSITION_LIMIT) {
						secondPlayerPosition -= numberOnDie2;
						System.out.println("Current position crossed 100,So Please roll the die again !!!!!");
					}
					count_Two++;
					break;
				case SNAKE:
					System.out.println("The option is Snake " + SNAKE);
					secondPlayerPosition -= numberOnDie2;
					if (secondPlayerPosition < 0)
						secondPlayerPosition = 0;
					break;
				default:
					System.out.println("No play");
				}
				System.out.println("Current Position of second player :  " + secondPlayerPosition);
				if (secondPlayerPosition == POSITION_LIMIT)
					System.out.println("Player Two won the Game.... has rolled " + count_Two + " times ");
				else
					isPlayerOneTurn = 1;
			     }
		        }
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
	

