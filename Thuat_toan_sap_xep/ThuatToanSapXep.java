/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuattoansapxep;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ThuatToanSapXep {

    /**
     * @param args the command line arguments
     */
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];
        System.out.println("Nhập giá trị các phần tử mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        //bubbleSort.bubblesSort(arr);
        //insertionSort.insertSort(arr);
        //selectedSort.selectSort(arr);
        //mergeSort.sort(arr, 0, (arr.length - 1));
        System.out.println(arr[quickSort.partition(arr, 0, arr.length - 1)]);
        quickSort.quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
    
}
