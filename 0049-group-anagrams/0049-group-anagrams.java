class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        List<List<String>> answer = new ArrayList<>();

        for(String s : strs) {
            char[] chararray = s.toCharArray();
            Arrays.sort(chararray);
            String temp_str = new String(chararray);

            if(hm.containsKey(temp_str)) {
              List<String> temp_lst = hm.get(temp_str);
              temp_lst.add(s);
              hm.put(temp_str, temp_lst);
            }
            else {
              List<String> temp_lst = new ArrayList<>();
              temp_lst.add(s);
              
              hm.put(temp_str, temp_lst);
            }
            
        }
        
        return new ArrayList<>(hm.values());
    }
}