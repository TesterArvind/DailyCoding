package dailycoding;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		int[] a ={1,1,2,2,3,3,3,4,5,6};
		int[] temp = new int[a.length];
		int index=0;
		
		for (int i = 0; i < a.length-1; i++) {
			if(a[i] != a[i+1]){
				temp[index++]= a[i];
			}
			
		}
		
	for(int c:temp){
		System.out.println(c);
	}	
    
	}

}
