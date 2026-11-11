class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        
        if(cost1 + cost2 < costBoth ){
            return (long)need1 * cost1 + (long)need2 * cost2;
        }
        else{

            long minNeeded = Math.min(need1, need2);

            long bothItem = (long)costBoth*minNeeded;

            need1 -= minNeeded;
            need2 -= minNeeded;

            if(need1 > 0){
                long mini = Math.min(costBoth,cost1);
                return (long)(need1*mini + bothItem);
            }  else{
                long mini = Math.min(costBoth,cost2);
                return (long)(need2*mini + bothItem);
            }
        }


    }
}