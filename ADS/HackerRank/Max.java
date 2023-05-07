import java.io.*;
import java.util.*;

public class Solution {
    
    public static void max(int[] arr) {
 
        int max = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i] > max )
                max = arr[i];
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int input=0;input<3;input++) {
            String inputString = sc.nextLine();
            inputString = inputString.replaceAll("\\D+", " "); // Replace all non-digit characters with spaces
            inputString = inputString.trim(); // Trim leading and trailing spaces
            String[] inputArr = inputString.split(" "); // Split the string into an array of strings
            
            int arrSize = inputArr.length;
            int[] arr = new int[arrSize];

            for(int i=0;i<arrSize;i++) {   
                arr[i] = Integer.parseInt(inputArr[i]); // Parse each element of the array from a string to an integer
            }
            max(arr);   
        }
    }
}