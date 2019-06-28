package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int counter = 0;
	    int min = 0;
	    int max = 0;
        boolean first = true;

	    while(true){
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                if(first){
                    first = false;
                    min = number;
                    max = number;
                }else {
                    if (number > max) {
                        max = number;
                    }
                    if (number < min) {
                        min = number;
                    }
                }
            } else{
                System.out.println("min = " + min + ", and max = " + max);
                break;
            }
            scanner.nextLine();
        }
	    scanner.close();
    }
}
