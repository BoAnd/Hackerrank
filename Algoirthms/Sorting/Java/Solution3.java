import java.util.*;
public class Solution3 {
    public static void insertionSort(int[] ar){
        int i,z;
        int tmp = 0;
        int count = 0;

        for(i = 1; i < ar.length; ++i) {
            for(z = 0 ; z < i; z++) {
                if(ar[z] > ar[i]){
                    tmp = ar[z];
                    ar[z] = ar[i];
                    ar[i] = tmp;
                    ++count;
                }
            }
        }
        System.out.println(count);
    }
                  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i][z]=in.nextInt(); 
        }
        insertionSort(ar);
    }    
}
