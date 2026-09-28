/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
public class TestMergeSort {

      public static void main(String[] args) {

        int[] digits = {30, 42, 8, 12, 7, 5, 26, 1};

        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.println();

        MergeSort mS = new MergeSort(digits);
        mS.Sort();
    }
}
