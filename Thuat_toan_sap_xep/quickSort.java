/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuattoansapxep;

/**
 *
 * @author DELL
 */
public class quickSort {

    /* Hàm sắp xếp nhanh
       Độ phức tạp trung bình O(NlogN), đạt max O(N*2) khi pilot max hoặc min
     */

    public static int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }
        int temp = a[i];
        a[i] = a[high];
        a[high] = temp;
        return i;
    }

    public static void quickSort(int a[], int low, int high) {
        if (low < high) {
            int idx = partition(a, low, high);
            quickSort(a, low, idx - 1);
            quickSort(a, idx + 1, high);
        }
    }
}
