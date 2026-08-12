class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0,t=0,tgas=0,tcost=0;
        for(int i=0;i<gas.length;i++)
        {
            sum += (gas[i]-cost[i]);
            if(sum<0)
            {
                 sum=0;
                 t=i+1;
            }
            tgas += gas[i];
            tcost += cost[i];
        }
        if(tgas<tcost)
            return -1;
            
        return t<gas.length? t:-1;
    }
}