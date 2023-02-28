package DSA.Searching;

import java.util.*;

public class binary_search {
    
    static int binarysearch(int arr[],int iteam){
        int left = 0;
        int right = arr.length -1 ;
        while(left<=right){
        int mid = left + (right-left)/2;
        if (arr[mid]==iteam){
            System.out.print("The element has been found at the index of: "+ mid);
            return mid;
        }
        else if (iteam>arr[mid]){
            left = mid +1;
        }
        else{
            right = mid -1;
        }
    }
        System.out.print("Element not found");
        return -1;
    }
    
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter size of the array: ");
        int size = s.nextInt();
        System.out.print("enter the array: ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = s.nextInt();
        }
        System.out.print("enter the search element: ");
        int ser = s.nextInt();

        binarysearch(arr,ser);
        s.close();
    }    
}
// Binary Search implementation in Java (Recursive)
// Time Complexity : O(log N)
// Space Complexity : O(1)
// Auxiliary Space Complexity : O(N) due to function call stack
