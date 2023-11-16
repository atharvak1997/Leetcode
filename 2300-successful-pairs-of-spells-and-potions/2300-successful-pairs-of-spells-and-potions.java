class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] answer = new int[spells.length];
        Arrays.sort(potions);

        for(int i = 0; i < spells.length; i++) {
            int count = potions.length;
            int l = 0;
            int r = potions.length - 1;

            while(l <= r) {
                int mid = (l + r) / 2;

                if((long) spells[i] * potions[mid] >= success) {
                    r = mid - 1;
                    count = mid;
                }
                else {
                    l = mid + 1;
                }
            }
            answer[i] = potions.length - count;
        }


        return answer;
    }
}