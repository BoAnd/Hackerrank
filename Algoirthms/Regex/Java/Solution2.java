import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;

        int n = in.nextInt();
        String[] lines = new String[n];
        in.nextLine();
        for(int i = 0; i < n; ++i) {
            lines[i] = in.nextLine();
        }

        int z = in.nextInt();
        String[] test = new String[z];
        for(int i = 0; i < z; ++i) {
            test[i] = in.next();
        }
                                                                                            
        String w = null;
        for(int i = 0; i < lines.length; ++i){
            Scanner word = new Scanner(lines[i]);
            for(int j = 0; j < test.length; ++j){
                while(word.hasNext()){                                                                                                        
                    if(word.next().contains(test[j].substring(0,9))){
                        ++count;
                    }    
                }
            }
        }
        System.out.println(count);
    }
}
