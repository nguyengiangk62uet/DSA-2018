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
public class bubbleSort {
    /* Hàm sắp xếp nổi bọt
       Độ phức tạp thuật toán O(N^2)
    */
    public static void bubblesSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
