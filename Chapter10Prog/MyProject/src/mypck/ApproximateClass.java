package mypck;

import java.math.BigDecimal;

public class ApproximateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int count = 0;
	        BigDecimal num = new BigDecimal(Long.MAX_VALUE).add(BigDecimal.ONE);
	        while (count < 10) {

	            if (num.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO) ||
	                num.remainder(new BigDecimal(6)).equals(BigDecimal.ZERO)) {
	                count++;
	                System.out.println(count+ ": " +num);
	            }
	            num = num.add(BigDecimal.ONE);
	        }
	}

}
