import java.io.*;
import java.util.*;

public class Solution {
    
    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strArr = s.split(", ");

        int[] arr = new int[strArr.length];
            for(int i=0;i<arr.length;i++)
                arr[i] = Integer.parseInt(strArr[i]);

            for(int i=arr.length-1;i>=0;i--){
                if(arr[i] >= 0){
                    for(int j=i;j<arr.length - 1 && arr[j+1] < 0;j++)
                        swap(j, j+1, arr);
                }
            }
            for(int itr : arr)
                System.out.print(itr + " ");
        }
    }
