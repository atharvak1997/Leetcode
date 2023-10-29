class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0;
        int costSum = 0;
        int total = 0;
        int res = 0;

        for(int i : gas) {
            gasSum += i;
        }
        
        for(int i : cost) {
            costSum += i;
        }

        if(gasSum < costSum) {
            return -1;
        }

        for(int i = 0; i < gas.length; i++) {
            total = total + gas[i] - cost[i];

            if(total < 0) {
                total = 0;
                res = i + 1;
            }
        }

        return res;
    }
}