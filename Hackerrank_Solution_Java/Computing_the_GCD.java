/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bttuan7dsa;

import java.util.*;

/**
 *
 * @author DELL
 */
public class Computing_the_GCD {

    public static int UCLN(int a, int b) {
        return (b == 0) ? a : UCLN(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.print(UCLN(a, b));
    }

}
