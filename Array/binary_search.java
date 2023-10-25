package DSA.Array;

public class binary_search {
    public static int binarySearch(int[] arr, int key){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            //compare
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    
    
    public static void main(String []args){
        int nums[] = {2,4,6,8,10,12,14};
        int key = 12;
        System.out.println("index of key is: "+" "+ binarySearch(nums, key));
    }
}