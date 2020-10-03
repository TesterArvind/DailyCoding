package dailycoding;

public class SortingArrayInAscending {

	public static void main(String[] args) {
		int [] a = {6,4,3,6,9,0};
		int temp;
		for (int i=0; i<a.length; i++){
			for(int j=0; j<a.length-1-i; j++){
				
				// for descending order just need to change "<"
				if(a[j]>a[j+1]){
					temp= a[j];
					a[j] =a[j+1];
					a[j+1] =temp;
				}
			}
		}
		for(int c:a){
			System.out.print(c+" ");
		}

	}

}
