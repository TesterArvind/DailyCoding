package dailycoding;

public class DupplicateArray {
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,4,3,1,2,5,5,1,22,121,12121,121211};
		for (int i=0; i < arr.length; i++){
			for (int j=i+1; j < arr.length; j++){
				if(arr[i] == arr[j]){
					System.out.println(arr[j]);
					break;
					
				}				
			}
		}
	}

}
