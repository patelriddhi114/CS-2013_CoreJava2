package mypck;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "foo";
		String s1 = "foo";
		
		String s2 = new String("foo");
		
		System.out.println("s==s1 is "+ (s==s1));
		System.out.println("s==s2 is "+ (s==s2));
		
		//----------------------------------------------------
		System.out.println("------------------------------");
		String str = "foo1#foo2#foo3#foo3#";
		String[] result =  str.split("#");
		
		for (int i=0 ; i<result.length;i++)
		{
			System.out.println("\n" + i + ". " + result[i] + " ");
		}
		//-----------------------------------------------------
		System.out.println("------------------------------");
		String str1 = "foo1#foo2#foo3#foo3#";
		String st = str;
		
		str1 = "Java is Fun";
		
		System.out.println("\nstr1 = " + str1);
		System.out.println("st = " + st);
		
		
		//----------------------------------------------------
		System.out.println("\n------------------------------");
		String s3 = str.replace('f', 's');
		System.out.println(s3);
		
		//----------------------------------------------------
		System.out.println("\n------------------------------");
		String s4 = str.replace("foo", "smile");
		System.out.println(s4);
		
		//----------------------------------------------------
		System.out.println("\n------------------------------");
		//ddd-dd-dddd
		String ssnpattern = "\\d{3}-\\d{2}-\\d{4}";
	
		//(xxx) xxx-xxxx
		String phonepattern1 = "([1-9])\\d{2} \\d{3}-\\d{4}";
		
		String ssn = "123-45-6789";
		System.out.println("ssn is = " + (ssn.matches(ssnpattern)));
		
		int x = 1234;
		String n1 = String.valueOf(x); //convert integer to string
		
		int y = Integer.parseInt(n1);//convert string to integer
		
		//----------------------------------------------------
		System.out.println("\n------------------------------");
		 
		StringBuffer sb = new StringBuffer();
		sb.append("Good Morning");
		sb.append("\n How are you?");
		
		System.out.println(sb.toString());
		
		
		
	}

}
