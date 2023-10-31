class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();

        for(int i : nums1) {
            hs1.add(i);
        }

        for(int i : nums2) {
            hs2.add(i);
        }

        for(int i : hs1) {
            if(!hs2.contains(i)) {
                l1.add(i);
            }
        }
        for(int i : hs2) {
            if(!hs1.contains(i)) {
                l2.add(i);
            }
        }
        // System.out.println(l1);
        // System.out.println(l2);
        answer.add(l1);
        answer.add(l2);

        return answer;
    }
}