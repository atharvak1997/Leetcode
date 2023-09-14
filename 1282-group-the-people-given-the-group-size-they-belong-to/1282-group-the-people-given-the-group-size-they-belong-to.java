class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> hashmap = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            hashmap.putIfAbsent(size, new ArrayList<>());
            
            List<Integer> res = hashmap.get(size);
            res.add(i);
            hashmap.put(size, res);
            
            if(res.size() == size) {
                ans.add(res);
                hashmap.remove(size);
            }
        }
        
        return ans;
    }
}