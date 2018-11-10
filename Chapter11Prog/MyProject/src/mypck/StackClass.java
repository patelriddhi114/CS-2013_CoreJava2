package mypck;

import java.util.ArrayList;
import java.util.Scanner;

public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack stack = new MyStack();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 strings... ");
        for (int i = 0; i < 5; i++) 
        	stack.push(input.next());

        System.out.println("Displaying them in reverse order.");
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
	}

}
class MyStack  extends ArrayList<Object> {


    public Object peek() {
        return get(size() - 1);
    }

    public Object pop() {
        Object o = get(size() - 1);
        remove(size() - 1);
        return o;
    }

    public void push(Object o) {
        add(o);
    }


    @Override /** Override the toString in the Object class */
    public String toString() {
        return "stack: " + super.toString();
    }
}