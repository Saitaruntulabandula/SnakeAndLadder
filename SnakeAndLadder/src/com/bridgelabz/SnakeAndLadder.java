package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		int position = 0;
		System.out.println("Initial position of the player:"+position);
		Random rand = new Random();
		int dieResult = rand.nextInt(7-1)+1;
		System.out.println("Die Result: "+dieResult);
	}
}
