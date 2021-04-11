import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        int a[] = {1,2,3,4};
         int b[] = new int[a.length];
         
         for(int i=0; i<a.length; i++){
             b[i] = a[i];
         }
         
         for(int k:b){
             System.out.print(k);
         }
    }
}
