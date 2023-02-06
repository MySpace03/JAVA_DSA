package DSA.Sorting;

import java.util.*;

public class selectionsort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int len = sc.nextInt();
        System.out.print("Enter the element of the array: ");
        int []arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Sorted Array: ");
        selection_sort(arr);
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    static void selection_sort(int[]a){
        for(int i=0;i<a.length;i++){
            int min = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }
}
