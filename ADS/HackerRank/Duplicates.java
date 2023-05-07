import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        
        StringTokenizer st = new StringTokenizer(s, ", ");
        int[] arr = new int[st.countTokens()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < k - 1; i++) {
            if (k > arr.length) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println("Duplicates found");
                    }
                }
            } else {
                for (int j = i + 1; j <= i + k; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println("Duplicates found");
                    }
                }
            }
        }
    }
}