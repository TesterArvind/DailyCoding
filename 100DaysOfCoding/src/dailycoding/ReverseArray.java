package dailycoding;

public class ReverseArray {

	public static void main(String[] args) {
		int [] a = {1,2,3,4};
		int temp;
		for(int i=0; i< a.length/2; i++){
			temp = a[i];
			a[i] = a[a.length-1-i];
			 a[a.length-1-i] =temp;
		}
      for(int c:a){
    	  System.out.print(c);
      }
	}

}
