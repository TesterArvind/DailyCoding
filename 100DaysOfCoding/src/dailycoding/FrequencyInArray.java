package dailycoding;

public class FrequencyInArray {

	public static void main(String[] args) {
		int[] a = {1,3,1,4,5,3,5,5,55};
		int[] freq = new int[a.length];
		int visited =-1;

		for(int i=0; i<a.length; i++){
			int count=1;
			for(int j=i+1; j<a.length; j++){
				if(a[i] == a[j]){
					count++;
					freq[j] = visited;
				}
			}

			if(freq[i] != visited)  
				freq[i] = count; 

		}

		for(int i=0; i< freq.length; i++){
			if(freq[i]!=visited){
				System.out.println(a[i]+"  | "+freq[i]);
			}
		}
	}

}
