package DSA.Sorting;
import java.util.*;

class Linear_Search{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter len of the array: ");
        int len = s.nextInt();
        int [] array = new int[len];
        System.out.print("enter the elements of the array: ");
        for (int i = 0; i<len ; i++){
            array[i] = s.nextInt();
        }
        System.out.print("enter the element you want to search for: ");
        int es = s.nextInt();
        LinearSearch(array, es);
        s.close();
    }
    private static void LinearSearch(int[] arr, int item){
         for(int i = 0; i< arr.length; i++){
            if(arr[i]==item){
                System.out.println("The element has been found at index: "+i);
                return;
            }
         }
         System.out.println("Not found");
    }
}

// Space Complexity : O(N)
// Time Complexity : O(N)