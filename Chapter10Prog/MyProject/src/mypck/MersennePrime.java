package mypck;

public class MersennePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-5s%8s\n", "p", "2^p-1");
		 
		  	for (int i = 0; i < 31; i++) 
		  	{
		 
			   int prime = mersennePrime(i);
			 
			   if (prime != 0) 
			   {
				   System.out.printf("%-5d%8d\n", i, prime);
			   }
		 
		  	}
		 
		 }
		 
		 
		 public static int mersennePrime(int n) {
		 
		  int prime = (int) Math.pow(2, n) - 1;
		  if (isPrime(prime)) {
		   return prime;
		  }
		 
		  return 0;
		 
		 }
		 
		 
		 public static boolean isPrime(int number) {
		  for (int divisor = 2; divisor <= number / 2; divisor++) {
		   if (number % divisor == 0) { 
		    return false;
		   }
		  }
		 
		  return true; 
		 }
		 
}