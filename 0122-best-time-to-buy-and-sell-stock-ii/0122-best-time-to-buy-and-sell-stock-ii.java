class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0],cur=0,total=0;
        int earlier,now;
        for(int i=1;i<prices.length;i++)
        {
            earlier=prices[i-1];
            now=prices[i];
            if(now > earlier)
            {
                cur = Math.max(cur,now-buy);
            }
            if(now < earlier)
            {
                total += cur;
                cur=0;
                buy=now;
            }
        }
        return total + cur;
    }
}