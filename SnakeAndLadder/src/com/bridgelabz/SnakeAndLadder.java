package com.bridgelabz;

public class SnakeAndLadder {
	private static int RandomDieValue() {
		int RandomValue = (int) Math.floor((Math.random() * 6) + 1);
		return RandomValue;
	}
	
	public static void main(String[] args) {
		int startingPosition = 0;
		int numberOnDie;
		System.out.println("Initial position of player is : " +startingPosition);
		numberOnDie = RandomDieValue();
		System.out.println("Number on Die is : " +numberOnDie);	
    }
}