import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int insertionSort(int[] ar){
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
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] result = new int[num];
        for(int i = 0; i < num; ++i){
            int len = in.nextInt(); 
            int[] ar = new int[len];
            for(z = 0; z < len; ++z) {
                ar[i] = in.nextInt();
            }
            result[i] = insertionSort(ar);
            
            /* We just calc the number and store it to leave 
             * and save it in an array ;)
             * */ 
        }
        for(int i = 0; i < num; ++i){
            System.out.println(result[i]);
        }
    }
}
