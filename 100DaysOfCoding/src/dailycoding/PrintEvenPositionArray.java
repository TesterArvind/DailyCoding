package dailycoding;

public class PrintEvenPositionArray {

	public static void main(String[] args) {
		
		int[] a = {0,1,2,3,4,5,6};
		for(int i=1; i<a.length; i++){
			if(i%2 != 0){   
//				if(i%2 == 0){  even //// odd
				
				System.out.println(a[i]);
			}	
		}

	}

}
