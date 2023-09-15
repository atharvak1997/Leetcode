class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        
        for(int i = 0; i < s.length(); i++) {
            hashmap.merge(s.charAt(i), 1, Integer::sum);
        }

        for(int count : hashmap.values()) {
            while(count > 0 && set.contains(count)) {
                count--;
                ans++;
            }
            set.add(count);
        }

        return ans;
    }
}