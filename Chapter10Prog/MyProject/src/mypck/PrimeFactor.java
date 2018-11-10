package mypck;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.print("Enter a positive integer : ");
		int num = new Scanner(System.in).nextInt();
		
		StackOfInteger stack = new StackOfInteger(20);
		
		int factor = 2;
		while(factor <= num)
		{
			if(num % factor == 0)
			{
				stack.push(factor);
				num = num / factor;
			}
			else
			{
				factor++;
			}
		}
		while(!stack.empty())
		{
			System.out.print(stack.pop() + " ");
		}
	}

}
class StackOfInteger
{
	private int[] elements;
	private int size;
	
	public StackOfInteger()
	{
		this(16);
	}
	public StackOfInteger(int capacity)
	{
		elements = new int[capacity];
	}
	
	public int push(int value)
	{
		if(size >= elements.length)
		{
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements,0,temp,0,elements.length);
			elements = temp; 
		}
		
		return elements[size++] = value;
	}
	public int pop()
	{
		return elements[--size];
	}
	public int peek()
	{
		return elements[size - 1];
	}
	public boolean empty()
	{
		return size == 0;
	}
	public int getsize()
	{
		return size;
	}
	
}