import java.io.*;
import java.util.*;

public class Solution {
    
    public static float sumSeries(float num){
        if(num == 1)
            return 1;
        if(num % 2 == 0)
            return sumSeries(num-1) - (1/num);
        else
            return sumSeries(num-1) + (1/num);
 }


    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((double)Solution.sumSeries(n));
    }
}