package leetcodeeasy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	
	public static boolean isHappyNumber(int num){
		int sum=0;
		int temp=0;
		HashSet<Integer> seen = new HashSet<Integer>();
		
		while (seen.add(num))
			 {	         
		            int value = 0;
		            while (num > 0)
		            {
		             value+= (num%10)*(num%10);
		                num /= 10;
		            }
		            num = value;
		        }
			 return num ==  1;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method s
		System.out.println(isHappyNumber(19));

	}

}
