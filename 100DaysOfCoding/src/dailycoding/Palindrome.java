package dailycoding;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "kyak";

		Boolean flag = true;
		for (int i=0; i<s.length()/2; i++){

			if(s.charAt(i) != s.charAt(s.length()-1-i)){
				flag=false;
				break;
			}

			if(flag){
				System.out.println("Is Palindrome");
			}
			else{
				System.out.println("Not Palindrom");
			}
		}
	}
}
