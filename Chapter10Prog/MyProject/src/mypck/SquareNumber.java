package mypck;

import java.math.BigDecimal;

public class SquareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
        long start = (long) Math.sqrt(Long.MAX_VALUE);
        BigDecimal n = new BigDecimal(start);
        int count = 0;


        while (count < 10) {

            BigDecimal squared = n.multiply(n);
            if (squared.compareTo(longMaxValue) > 0) {
                count++;
                System.out.println(count+": " + n + " squared = " + squared);
            }
            n = n.add(BigDecimal.ONE);
        }
	}
}
