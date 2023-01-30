package DSA.Sorting;

import java.util.*;

public class binary_search {
    
    public static int binarysearch(int arr[],int left, int right,int iteam){
        while(left<=right){
        int mid = left + (right-left)/2;
        if (arr[mid]==iteam){
            return mid;
        }
        if (left<iteam){
            left = mid +1;
        }
        else{
            right = mid -1;
        }
    }
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

        int pos = binarysearch(arr, 0, size-1, ser);

        if(pos == -1){
            System.out.println("The element is not present in the array");
        }
        else{
            System.out.println("The element has been found at the index of: "+ pos);
        }
        s.close();
    }    
}
// Binary Search implementation in Java (Recursive)
// Time Complexity : O(N)
// Space Complexity : O(1)
// Auxiliary Space Complexity : O(N) due to function call stack