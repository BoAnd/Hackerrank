import java.util.*;
public class Solution1 {
    public static void insertionSort(int[] ar){
        int i,z;
        int tmp = 0;

        for(i = 1; i < ar.length; ++i) {
            for(z = 0 ; z < i; z++) {
                if(ar[z] > ar[i]){
                    tmp = ar[z];
                    ar[z] = ar[i];
                    ar[i] = tmp;
                }
            }
            printArray(ar);
        }
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
        int idx = in.nextInt()
        int n = in.nextInt();
        int[] ar = new int[n][idx];
        for(int z=0;i<idx;i++){
            for(int i=0;i<n;i++){
                ar[i][z]=in.nextInt(); 
            }
        }
        printArray(ar[1]);
        printArray(ar[2]);
        //insertionSort(ar);
    }    
}
