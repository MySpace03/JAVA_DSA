package DSA.Array;
public class largestnumber{
    
    public static int largeelemnet(int arr[]){
        int lar = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>lar){
                    lar = arr[i];
                }
                if(arr[i]<small){
                    small = arr[i];
                }
            }
        System.out.println("smallest value"+" "+small);
        return lar;
    }
    
    public static void main(String args[]){
        int element[] = {1,2,6,3,4,5};
        System.out.println("largest value"+ " " + largeelemnet(element));
    }
}