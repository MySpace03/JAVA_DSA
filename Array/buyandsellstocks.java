package DSA.Array;

public class buyandsellstocks {
    public static int stock(int[] arr) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0;i<arr.length;i++){
            if(buyprice<arr[i]){
                int profit = arr[i] - buyprice;
                maxprofit = Math.max(profit,maxprofit);
            }
            else{
                buyprice = arr[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println(stock(price));
    }
}
