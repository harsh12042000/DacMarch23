import java.io.*;
import java.util.*;

public class Solution {
    
    public static void towerofHanoi(int n, String src, String helper, String dest) {

        if(n == 1) {
            System.out.println("Disk " + n + " moved from " + src + " to " + dest);
            return;
        }
        towerofHanoi(n-1 , src, dest, helper);
        System.out.println("Disk " + n + " moved from " + src + " to " + dest);
        towerofHanoi(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerofHanoi(n, "A", "B", "C");
    }
}