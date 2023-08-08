class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int maxValue = -1;
        ArrayList<Integer> numList = new ArrayList<>();
        for(int i : nums) {
            if(i % 2 == 0) {
                hashmap.merge(i, 1, Integer::sum);
            }
        }
        if(hashmap.isEmpty()) {
            System.out.println(hashmap);
            return -1;
        }
        for(int key : hashmap.keySet()) {
            int count = hashmap.get(key);
            System.out.println(count);
            maxValue = Math.max(maxValue, count);
        }
        for(int key: hashmap.keySet()) {
            if(hashmap.get(key).equals(maxValue)) {
                numList.add(key);
            }
        }
        Collections.sort(numList);
        return numList.get(0);
    }
}