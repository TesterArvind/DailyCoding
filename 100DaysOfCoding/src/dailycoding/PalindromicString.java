package dailycoding;

import java.util.HashMap;
import java.util.Map.Entry;

public class PalindromicString {

	public static boolean isPalindromic(String input){
		char[] ch = input.toCharArray();
		HashMap<Character,Integer> map =new HashMap<Character, Integer>();
		for (char c : ch){

			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c, 1);
			}			
		}
		int oddCount=0;
		int evenCont =0;
		for(Entry<Character,Integer> k : map.entrySet()){

			if(k.getValue() %2 != 0){
				oddCount++;	
			}
			else if (k.getValue() %2 ==0){
				evenCont++;
			}
			
		}
		if(oddCount==1 || evenCont == map.size() ) {
			return true;
			
			
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindromic("aabbhbbsaa"));
	}
}
