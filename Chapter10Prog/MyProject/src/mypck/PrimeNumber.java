package mypck;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Printing prime numbers under 120.. ");

		StackOfInteger1 stack = new StackOfInteger1(20);

        for (int i = 2; i < 120; i++) 
        {
            if (isPrime(i)) {
                stack.push(i);
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static boolean isPrime(int n) {

        double range = Math.sqrt(n);
        for (int i = 2; i < range ; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
class StackOfInteger1
{
	private int[] elements;
	private int size;
	
	public StackOfInteger1()
	{
		this(16);
	}
	public StackOfInteger1(int capacity)
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