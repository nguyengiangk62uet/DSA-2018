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
public class selectedSort {
    /* Hàm sắp xếp lựa chọn
       Độ phức tạp O(N*2)
    */
    public static void selectSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int min_idx = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
    }
}
