class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum = 0;
        int count = 1;
        int[] arr = new int[2];
        
        for(int i = 0; i < s.length(); i++) {
            if(sum + widths[s.charAt(i) - 'a'] > 100) {
                sum = 0;
                count++;
            }
            sum += widths[s.charAt(i) - 'a'];
        }
        
        arr[0] = count;
        arr[1] = sum;
        return arr;
    }
}