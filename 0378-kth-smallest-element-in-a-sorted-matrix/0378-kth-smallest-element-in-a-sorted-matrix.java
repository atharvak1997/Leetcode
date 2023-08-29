class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[0].length; col++) {
                pq.add(matrix[row][col]);
            }
        }
        for(int i = 0; i < k - 1; i++) {
            pq.remove();
        }
        System.out.println(pq);
        return pq.peek();
    }
}