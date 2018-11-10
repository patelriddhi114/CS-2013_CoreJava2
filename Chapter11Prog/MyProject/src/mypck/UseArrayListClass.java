package mypck;

import java.util.ArrayList;
import java.util.Date;

public class UseArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> list = new ArrayList<>();

        list.add(new Circle2D());
        list.add("Hello I'm a string");
        list.add(new Date());
        list.add(new Account(111, 230));

        list.forEach(System.out::println);

	}

}
