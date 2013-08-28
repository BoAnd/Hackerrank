/* Head ends here */
import java.util.*;
public class Solution {
           
    static void insertionSort(int[] ar) {
        int i;
        int len = ar.length -1;
        int z = len;
        int tmp = ar[len];

        for(i = len - 1; i >= 0; i--, z--) {
            if (tmp < ar[i]){
                ar[z] = ar[i];
            } else {
                ar[z] = tmp;
                break;
            }

            printArray(ar); // Last thing we do is print 
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
        //Scanner in = new Scanner(System.in);
        int n = 5;
        int[] ar = {2,4,6,8,7};
        //for(int i=0;i<n;i++){
        //    ar[i]=in.nextInt(); 
        //}
        insertionSort(ar);
    }    
}

