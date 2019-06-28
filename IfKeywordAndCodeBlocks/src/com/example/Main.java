package com.example;

public class Main {

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			return finalScore;
		}
		return -1;
	}

	public static void displayHighScorePosition(String name, int position){
		System.out.println(name + " managed to get into position " + position);
	}

	public static int calculateHighScorePosition(int score){
		if(score < 100){
			return 4;
		} else if(score <= 500){
			return 3;
		} else if(score < 1000){
			return 2;
		}
		return 1;
	}

    public static void main(String[] args) {

		int highscore;

	    highscore = calculateScore(true, 800, 5, 100);
		System.out.println("your final score was " + highscore);
		highscore = calculateScore(true,10000, 8, 200);
		System.out.println("your final score was " + highscore);

		int position;
		position = calculateHighScorePosition(1500);
		displayHighScorePosition("Kristen", position);
		position = calculateHighScorePosition(900);
		displayHighScorePosition("Kristen", position);
		position = calculateHighScorePosition(400);
		displayHighScorePosition("Kristen", position);
		position = calculateHighScorePosition(50);
		displayHighScorePosition("Kristen", position);

    }
}
