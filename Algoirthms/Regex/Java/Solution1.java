import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] lines = new String[n];
        in.nextLine();
        for(int i = 0; i < n; ++i) {
            lines[i] = in.nextLine();
        }
        System.out.println(" ");
        System.out.println(" ");
        for(int i = 0; i < n; ++i) {
            if(lines[i].startsWith("hackerrank") && lines[i].endsWith("hackerrank")) {
                System.out.println("0");
            } else if (lines[i].startsWith("hackerrank")){
                System.out.println("1");
            } else if (lines[i].endsWith("hackerrank")){
                System.out.println("2");
            } else {
                System.out.println("-1");
            }
            System.out.println(lines[i]);
        }
    }
}
