
public class BubbleSort {

	public static void main(String[] args) {
		int [] a={1,535,3,12,5,9,4,3};
		int temp;
		
		for(int i=0; i<a.length-1; i++){
			
			for (int j=0; j<a.length-1-i; j++){
				if (a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;	
				}						
			}
		}
		
		for(int c:a){
			System.out.println(c);
		}

	}

}
