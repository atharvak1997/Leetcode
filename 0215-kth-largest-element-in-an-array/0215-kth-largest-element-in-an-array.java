class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int num : nums) {
            heap.add(num);
        }
        while(!heap.isEmpty()) {
            arr.add(heap.remove());
        }
        System.out.println(arr);
        return arr.get(nums.length - k);
    }
}