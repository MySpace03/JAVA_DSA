package DSA.Array;

public class maxsubarraysunm {
    public static int maxsum(int nums[]){
        int sum = Integer.MIN_VALUE;
        int l = nums.length;
        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                int temp = 0;
                for(int k=i;k<=j;k++){
                    temp += nums[k]; 
                }
                System.out.println(temp);
                if(temp>sum){
                    sum = temp;
                }
            }
        }
        return sum;

    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10};
        System.out.println("Maximum sum: "+maxsum(nums));
    }   
}
