package mypck;

import java.util.ArrayList;

public class ShuffleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        System.out.println(list);

        System.out.println("Shuffling list...");
        shuffle(list);
        System.out.println(list);
    }

    public static void shuffle(ArrayList<Integer> list) {

        // simple solution
        //Collections.shuffle(list);

        // manual shuffle
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int) (Math.random() * list.size());
            int temp = list.get(randomIndex);
            list.set(randomIndex, list.get(i));
            list.set(i, temp);
        }
	}

}
