package dailycoding;

public class ArmStrongNumer {
	
	public static boolean isArmstrong(int num){
		int sum=0;
		int temp=0;
		int num1=num;
		while(num !=0){
			
			temp = num%10;
			sum=sum+(temp*temp*temp);
			num=num/10;
		}
		System.out.println(sum);
		if(sum==num1){return true;}
		
		
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
	}

}
