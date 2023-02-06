// Java Program for Insertion Sort
// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Best Case : When already Sorted, Worst Case : When reverse Sorted
package DSA.Sorting;

import java.util.*;

public class insertionsort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        System.out.print("Enter the array: ");
        int []arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        insertion_sort(arr);
        System.out.print("Sorted arra: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    static void insertion_sort(int a []){
        for(int i=1;i<a.length;i++){
            int curr = a[i];
            int j = i-1;
            while(j>=0 && a[j]>curr){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = curr;
        }
    }
}