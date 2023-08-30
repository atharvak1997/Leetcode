class Solution {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        int len = 0;
        String[] elem = new String[hs.size()];
        
        for(String str : strs ) {
            if(str != " ") {
                hs.add(str);
            }
        }
        elem = hs.toArray(elem);
        return elem[elem.length - 1].length();
    }
}