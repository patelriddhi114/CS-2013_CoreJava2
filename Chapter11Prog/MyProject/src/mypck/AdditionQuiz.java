package mypck;

import java.util.ArrayList;
import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number 1:");
		int number1 =input.nextInt();
		
		System.out.println("Enter the number 2:");
		int number2 =input.nextInt();
		
		 
	        ArrayList<Integer> repeatedAnswers = new ArrayList<>();

	        System.out.print( "What is " + number1 + " + " + number2 + "? ");
	        int answer = input.nextInt();

	        while (number1 + number2 != answer) {
	            if (repeatedAnswers.contains(answer)) {
	                System.out.println("You already answered " + answer);
	            }
	            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
	            repeatedAnswers.add(answer);
	            answer = input.nextInt();
	        }

	        System.out.println("You got it!");
	}

}
