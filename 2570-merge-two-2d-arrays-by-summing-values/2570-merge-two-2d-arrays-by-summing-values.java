class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        // ArrayList<List> answer = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int m = 0;

        for(int i = 0; i < nums1.length; i++) {
            hm.put(nums1[i][0], nums1[i][1]);
        }

        for(int i = 0; i < nums2.length; i++) {
            if(hm.containsKey(nums2[i][0])) {
                hm.put(nums2[i][0], hm.get(nums2[i][0]) + nums2[i][1]);
            }
            else {
                hm.put(nums2[i][0], nums2[i][1]);
            }
        }

        int[][] answer = new int[hm.size()][2];
        int i = 0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int[] temp = new int[2];
            temp[0] = entry.getKey();
            temp[1] = entry.getValue();
            answer[i] = temp;
            i++;
        }

        System.out.println(answer);
        Arrays.sort(answer, (a, b) -> a[0] - b[0]);
        return answer;
    }
}