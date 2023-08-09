import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        ArrayList<BigInteger> n = new ArrayList<>();
        for(String i : nums){
            n.add(new BigInteger(i));
        }
        Collections.sort(n, Collections.reverseOrder());
        BigInteger x = n.get(k - 1);
        String i = x.toString();
        return i;
    }
}