package dailycoding;

public class ArrayRightRotate {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		int temp;

		for(int i=0; i<3; i++){
			temp=a[a.length-1];
			for(int j=a.length-1; j>0; j--){
				a[j] =a[j-1];	
			}
			a[0]=temp;
			
		}
		for(int c : a){
			System.out.println(c);
		}
	}

}
