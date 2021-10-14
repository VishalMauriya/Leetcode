**Time complexity : O(n) -  `Only a single pass is needed`
<br>Space complexity : O(1) -` Only two variables are used`**

*One Pass Algo*

 We can maintain two variables - minprice and maxprofit. Maximum profit (maximum difference between selling price and minprice) obtained.

```
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i=0; i<prices.length; i++){
            
           if(prices[i] < minPrice)
               minPrice = prices[i];
            
            else if(prices[i]-minPrice > maxProfit)
                maxProfit = prices[i]-minPrice;
        }
        return maxProfit;
    }
}
```
