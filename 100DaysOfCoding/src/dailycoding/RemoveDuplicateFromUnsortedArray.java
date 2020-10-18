package dailycoding;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateFromUnsortedArray {
/*
 * Method 1 : Sort the Array and then remove duplicate
 * Method 2 : Use Set data structure
 * Method 3 : Use HashMap
 * 
 * */
	
	
	public static void main(String[] args) {
		int [] a = {1,2,3,4,12,1,2,3,4,12,3,4,5 };
		
		Set<Integer> s = new HashSet<>();
		
		for (int i = 0; i < a.length; i++){
			s.add(a[i]);
		}
		Iterator<Integer> i = s.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}

	}

}
