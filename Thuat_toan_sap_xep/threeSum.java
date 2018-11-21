/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuattoansapxep;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class threeSum {
    static void threeSum2n(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int a = arr[i];
            int start = i + 1;
            int end = arr.length - 1;
            while (start < end) {
                int b = arr[start];
                int c = arr[end];
                if (a + b + c == 0) {
                    System.out.println(a + " " + b + " " + c);
                    start++;
                    end--;
                } else if (a + b + c > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        threeSum2n(a);
    }
}
