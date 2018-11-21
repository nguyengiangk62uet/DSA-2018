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
public class insertionSort {
    /* Hàm sắp xếp chèn
       Độ phức tạp O(N*2)
    */
    public static void insertSort(int a[]) {
        int i, j, key;
        for (i = 1; i < a.length; i++) {
            key = a[i];         // Chọn phần tử thứ 1 để so sánh
            j = i - 1;
            while (j >= 0 && a[j] > key) {                
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
}
