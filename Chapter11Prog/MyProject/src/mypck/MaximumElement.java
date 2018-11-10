package mypck;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        ArrayList<Integer> list = new ArrayList<>();
	        System.out.print("Enter input end with zero to stop: ");
	        int temp;
	        do {
	            temp = input.nextInt();
	            if (temp != 0) {
	                list.add(temp);
	            }
	        } while (temp != 0);

	        System.out.println("Max number is " + max(list));
	}
	public static Integer max(ArrayList<Integer> list) {

	    if (list == null || list.isEmpty()) return null;

	    int max = list.get(0);
	    for (int i : list) {
	        if (i > max) {
	            max = i;
	        }
	    }

	    return max;
	}
	
}
