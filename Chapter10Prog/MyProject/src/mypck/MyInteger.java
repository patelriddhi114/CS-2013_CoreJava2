package mypck;

public class MyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyInt int1 = new MyInt(23);
		MyInt int2 = new MyInt(56);
		MyInt int3 = new MyInt(2);
		MyInt int4 = new MyInt(23);
		
		System.out.println(int1.getValue() + " is prime?");
		System.out.println(int2.getValue() + " is prime?");
		System.out.println(int3.getValue() + " is prime?");
		
		
		System.out.println(int1.getValue() + " is even?");
		System.out.println(int2.getValue() + " is even?");
		System.out.println(int3.getValue() + " is even?");
		
		System.out.println(MyInt.isOdd(93) + " is odd?");
		
		System.out.println(int1.getValue() + " is equales?");
		System.out.println(MyInt.parseInt(new char[] {'1','5','6'}));
		System.out.println(MyInt.parseInt("454"));
	}

}

class MyInt
{
	private int mValue;
	
	public MyInt(int value)
	{
		mValue = value;
	}
	public int getValue()
	{
		return mValue;
	}
	public boolean isEven()
	{
		return ((mValue % 2 ) == 0);
	}
	public boolean isOdd()
	{
		return ((mValue  % 1) == 1);
	}
	public boolean isPrime()
	{
		if(mValue == 1 || mValue == 2)
		{
			return true;
		}
		else
		{
			for(int i=2; i<mValue ;i++)
			{
				if(i % mValue == 0)
					return false;
			}
		}
		return true;
	}
	public static boolean isEven(int myInt)
	{
		return (myInt % 2 ==0);
	}
	public static boolean isOdd(int myInt)
	{
		return (myInt % 2 ==1);
	}
	
	public static boolean isPrime(int myInt)
	{
		if(myInt ==1 || myInt == 2)
			return true;
		else
		{
			for(int i =2 ; i<myInt ; i++)
			{
				if(i % myInt ==0 )
					return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInt myInt)
	{
		return myInt.isEven();
	}
	public static boolean isOdd(MyInt myInt)
	{
		return myInt.isOdd();
	}
	public static boolean isPrime(MyInt myInt)
	{
		return myInt.isPrime();
	}
	
	public boolean equals(int testInt)
	{
		if(testInt == mValue)
			return true;
		
		return false;
	}
	public boolean equals(MyInt myInt)
	{
		if(myInt.mValue == this.mValue)
			return true;
		return false;
	}
	public static int parseInt(char[] values) {
        int sum = 0;
        for (char i : values) {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
	
    }
}
