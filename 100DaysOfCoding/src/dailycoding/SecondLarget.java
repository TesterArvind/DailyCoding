package dailycoding;

public class SecondLarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,3,14,4,0,1,7};
		
		int largestNum = arr[0];
		int secondNum = arr[0];
		
		for (int i=0; i<arr.length; i++){
			// for second smallest we need to change to "<"
			if(arr[i] > largestNum){
				secondNum = largestNum;
				largestNum = arr[i];
				
			}
			else {
				// for second smallest we need to change to "<"
				if(arr[i] > secondNum ){
					secondNum = arr[i];
				}
			}
		}
		
		System.out.println(secondNum);

	}

}
