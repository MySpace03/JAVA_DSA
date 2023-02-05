package DSA.Sorting;
import java.util.*;
public class Bubblesort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the arry: ");
        int len = sc.nextInt();
        System.out.print("Enter the element of the array: ");
        int arr [] = new int[len];
        for(int i = 0 ; i<len; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.print("sorted arry: ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    static void bubbleSort(int arr[]){
        int len = arr.length;
        for (int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
}
// Time Complexity : O(N^2)
// Space Complexity : O(1)
