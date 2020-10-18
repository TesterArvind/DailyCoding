package dailycoding;

public class SumOfNumbersFromString {

	public static void main(String[] args) {
		String str = "hello10worold10";
		String num ="";
		int sum =0;

		for (int j = 0; j < str.length(); j++) {
			if(Character.isDigit(str.charAt(j))){
				num= num+str.charAt(j);
			}
			else{
				if(!num.equals("")){
				sum =sum+Integer.parseInt(num);
				num="";
			}
			}
		}

		System.out.println(sum);
	}

}
