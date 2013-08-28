/* Head ends here */
import java.util.*;

public class Solution4 {
           
    static void partition(int[] ar) {
        /* This example should be rewrite to use list*/
        int first = ar[0];
        int n = ar.length;
        int[] l = new int[n];
        int[] h = new int[n];
        int z = 0;
        int m = 0;    

        for(int i = 1; i < ar.length; ++i) {
            if(first < ar[i]) {
                h[z++] = ar[i];
            } else { 
                l[m++] = ar[i];
            } 
        }
       
       if(l[0] != 0) { 
           System.arraycopy(l, 0, ar, 0, l.length);
           ar[l.length] = first;
           System.arraycopy(h, 0, ar, l.length+1, h.length);
        } else {
           ar[0] = first;
           System.arraycopy(h,0,ar,1,h.length-1);
        }

        printArray(ar);
    }   

    /* Tail starts here */           
    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
                      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 9; //in.nextInt();
        int[] ar = {2,10,3,7,9,4,6,12,8}; //new int[n];
        /*for(int i=0;i<n;i++){
            ar[i]=in.nextInt(); 
        }*/
        partition(ar);
    }    
}
