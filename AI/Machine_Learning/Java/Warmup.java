import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mean = 0; //Average
        int median = 0; // middle element or the middle two elements
        int mode = 0; // most feq
        int sd = 0; // ((()²+()²)/n)⁰⁵
        int sum = 0; // use as temp value

        int num = in.nextInt();
        int[] ar = new int[num];
        for(int i = 0; i < num; ++i){
            ar[i] = in.next();
        }

        for(int i = 0; i < ar.length(); ++i){
            sum += ar[i];
        }
        mean = sum/num;

        if(num % 2 == 0){
            median = (ar[num/2] + ar[num/2+1])/2
        } else {
            median = ar[num/2+1];
        }
        
        int c1 = 0;
        int c2 = 0;
        int pu1 = 0;
        int pu2 = 0;

        for(int i = 0; i < ar.length; ++i){
            pu1 = ar[i];
            c1 = 1;
            for(int j = i+1; j < ar.length; ++j){
                if (pu1 == ar[j]) c1++;
            }

            if(c1 > c2){
                pu2 = pu1;
                c2 = c1;
            } else if(c1 == c2){
                pu2 = Math.min(p1,p2);
            } 
        }
        
        mode = p2;
    }
}
