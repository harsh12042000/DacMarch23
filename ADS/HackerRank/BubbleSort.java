import java.io.*;
import java.util.*;

public class Solution {
    
    public static void bubbleSort(int arr[]) {
        
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        System.out.print("[");
        for(int i=0;i<arr.length-1;i++)
            System.out.print(arr[i] + ", ");
        System.out.print(arr[arr.length-1] + "]");
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String[] strArr = str.split("[,\\s]+");
        int arr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        bubbleSort(arr);
    }
}