package mypck;

import java.util.ArrayList;
import java.util.List;

public class CombainTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        int[] a1 = {1, 2, 3, 4, 5, 6};
        int[] a2 = {4, 5, 6, 7, 9, 10};
        List<Integer> union = new UnionIntersection().union(a1, a2);
        System.out.println(union);
 
        /*List<Integer> intersect = new UnionIntersection().intersect(a1, a2);
        System.out.println(intersect); 	
		*/
	}
}
		
		
		
		
		
class UnionIntersection {
    public List<Integer> union(int[] list1, int[] list2) {
        List<Integer> res = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
 
        while(p1 < list1.length && p2 < list2.length) {
            if (list1[p1] < list2[p2]) {
                res.add(list1[p1]);
                p1++;
            }
            else if(list1[p1] > list2[p2]) {
                res.add(list2[p2]);
                p2++;
            }else {
                res.add(list1[p1]);
                p1++;
                p2++;
            }
        }
        while(p1 < list1.length) {
            res.add(list1[p1]);
            p1++;
        }
 
        while(p2 < list2.length) {
            res.add(list2[p2]);
            p2++;
        }
 
        return res;
    }
 
    /*public List<Integer> intersect(int[] list1, int[] list2) {
        List<Integer> res = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
 
        while(p1 < list1.length && p2 < list2.length) {
            if (list1[p1] < list2[p2]) {
                p1++;
            }
            else if(list1[p1] > list2[p2]) {
                p2++;
            }else {
                res.add(list1[p1]);
                p1++;
                p2++;
            }
        }
        return res;*/
    }