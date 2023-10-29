class Solution {
    public int lengthOfLastWord(String s) {
        ArrayList<List> arrList = new ArrayList<>();
        int i = 0;

        while(i < s.length()) {
            ArrayList<Character> arr = new ArrayList<>();
            while(i < s.length() && Character.isAlphabetic(s.charAt(i))) {
                arr.add(s.charAt(i));
                i++;
            }
            if(!arr.isEmpty()) {
                arrList.add(arr);
            }
            i++;
        }

        int res = arrList.get(arrList.size() - 1).size();
        System.out.println(res);

        return res;
    }
}