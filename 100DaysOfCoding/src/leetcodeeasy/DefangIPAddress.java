package leetcodeeasy;

/*
 *  Input = 10.1.22.1
 *  Output= 10[.]1[.]22[.]1
 * 
 * */

public class DefangIPAddress {

	public static void main(String[] args){
		
		String ipaddress = "10.1.22.1";
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < ipaddress.length(); i++) {
			
			if(ipaddress.charAt(i) == '.' ){
				
				builder.append("[.]");		
			}
			else{
				builder.append(ipaddress.charAt(i));
			}
			
		}
	System.out.println(builder.toString());
	}

}
