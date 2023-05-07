import java.io.*;
import java.util.*;

public class Solution {
    
    public static void sum(int[] arr, int value) {
        
        boolean flag = false;
        
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]+arr[j] == value) {
                    System.out.println("Pair found (" + i + "," + j + ")");
                }
            }
        }
        if(!flag) 
            System.out.println("Pair not found");
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        String inputString = sc.nextLine();
        int value = sc.nextInt();
        String numOnly = inputString.replaceAll("[^0-9]", "");
        
        int strLen = numOnly.length();
        
        int arrSize = Character.getNumericValue(numOnly.charAt(0));
        
        int[] arr = new int[arrSize];
         
        for(int i=0;i<arrSize;i++) {
            arr[i] = Character.getNumericValue(numOnly.charAt(i+1));
        }
        
        sum(arr, value);
    }
}