import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
 
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] array = new int[k];
        
        for(int i : nums) {
            hm.merge(i, 1, Integer::sum);
        }
        
        Map<Integer, Integer> sorted = hm
        .entrySet()
        .stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .collect(
            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                LinkedHashMap::new));
        
        for (int key : sorted.keySet()) {
            if(k > 0){
                // Integer key = entry.getKey();
                array[k-1] = key;
                k--;
            }  
        }
        return array;
    }
}