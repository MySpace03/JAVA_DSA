package DSA.Array;

public class prefixsumarray{
    public static int prefixsum(int arr[]){
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int len = arr.length;
        int presum[] = new int[len];
        presum[0] = arr[0];
        for(int i=1;i<len;i++){
            presum[i] = presum[i-1] + arr[i];
        }
        
        for(int i=0;i<len;i++){
            for(int j = i;j<len;j++){
                sum = i==0 ? presum[j] : presum[j] - presum[i-1];

                if(maxsum<sum){
                    maxsum = sum;
                }
            }
        }
        return maxsum;
    }
    public static void main(String []args){
        int nums[] = {1,-2,6,-1,3};
        System.out.println(prefixsum(nums));
    }
}
