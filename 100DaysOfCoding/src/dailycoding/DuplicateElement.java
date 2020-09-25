package dailycoding;
import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str = "automation";
		char[] charArray= str.toCharArray();

		HashMap<Character,Integer> map =new HashMap<Character, Integer>();
		
		
		

		for (char c : charArray){

			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c, 1);
			}			
		}

		for(Entry<Character,Integer> k : map.entrySet()){

			System.out.println(k.getKey() +" "+k.getValue());
		}
	}

}


