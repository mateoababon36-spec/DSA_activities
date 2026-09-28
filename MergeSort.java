/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
public class MergeSort {

     int[] digits;

    public MergeSort(int[] digits) {
        this.digits = digits;
    }

    public void Sort() {

        mergeSort(0, digits.length - 1);

        System.out.println("Sorted Num");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
    }

    public void mergeSort(int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            System.out.println("Splitting: ");
            showSubSortedList(left, right);
            
               // Show the LEFT side
            System.out.print("Left Side: ");
            showSubSortedList(left, mid);

            // Show the RIGHT side
            System.out.print("Right Side: ");
            showSubSortedList(mid + 1, right);

            mergeSort(left, mid);
            mergeSort(mid + 1, right);

            merge(left, mid, right);
        }
    }

    public void merge(int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = digits[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = digits[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        System.out.println("Merging:");

        while (i < n1 && j < n2) {

            System.out.printf("Comparing %d and %d..\n",
                    leftArray[i], rightArray[j]);

            if (leftArray[i] <= rightArray[j]) {
                digits[k] = leftArray[i];
                i++;
            } else {
                digits[k] = rightArray[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            digits[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            digits[k] = rightArray[j];
            j++;
            k++;
        }

        System.out.print("Merged List: ");
        showSubSortedList(left, right);
    }

    public void showSubSortedList(int left, int right) {

        for (int i = left; i <= right; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println();
    }
}