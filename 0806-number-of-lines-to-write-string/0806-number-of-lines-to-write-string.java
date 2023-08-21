class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum = 0;
        int count = 0;
        int[] arr = new int[2];
        
        for(int i = 0; i < s.length(); i++) {
            sum += widths[s.charAt(i) - 'a'];
            if(sum > 100) {
                sum = 0;
                count++;
                i--;
            }
        }
        
        if(sum != 0) {
            count++;
        }
        
        arr[0] = count;
        arr[1] = sum;
        return arr;
    }
}