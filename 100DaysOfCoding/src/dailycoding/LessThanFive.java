 package dailycoding;

public class LessThanFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a ={2,3,1,5,4,3,6,7,8};
		int[] a1 = new int[a.length];
		int[] a2 = new int[a.length];
		int k=0;
		int j=0;
		
		for(int i=0; i < a.length; i++){
			if(a[i] < 5){	
				a1[k++] =a[i];
			}
			else{
				a2[j++] =a[i];
			}
		}
		for (int d : a1){
			System.out.print(d);
		}
		System.out.print("---------------------");
		for (int e : a2){
			System.out.print(e);
		}

	}

}
