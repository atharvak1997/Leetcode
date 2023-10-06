class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {}

        for i in strs:
            sorted_i = sorted(i)
            sorted_i = "".join(sorted_i)
            if sorted_i in hashmap:
                hashmap[sorted_i].append(i)
            else:
                hashmap[sorted_i] = [i]
        
        res = []
        for i in hashmap:
            res.append(hashmap[i])
        return res
