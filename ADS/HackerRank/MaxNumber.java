import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer str;
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            str = new StringTokenizer(s,"{},");
            int[] arr = new int[str.countTokens()];
            int i=0;
            
            while(str.hasMoreTokens()&&i<arr.length){
                String token = str.nextToken().trim();
                arr[i] = Integer.parseInt(token);
                i++;
            }
            
            int max =0;
            
            for(int j =0;j<arr.length;j++)
                max= Math.max(max,arr[j]);
            
            System.out.println(max);
        }
    }
}