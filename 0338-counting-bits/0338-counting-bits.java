class Solution {
    public int dectobin(int k) {
        int[] bits = new int[40];
        int count = 0;
        int res = 0;
        
        while(k > 0) {
            bits[count++] = k % 2;
            k = k / 2;
        }
        for(int i = 0;i < bits.length;i++){ 
            // System.out.println(bits[i]);
            if(bits[i] == 1) {
                
                res++;
            }
        }   
        return res;
    }
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        for(int i = 0; i < n + 1; i++) {
            int m = dectobin(i);
            bits[i] = m;
        }
        
        return bits;
    }
}