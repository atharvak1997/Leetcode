class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hashmap = {}

        for i in nums:
            if i in hashmap:
                hashmap[i] += 1
            else:
                hashmap[i] = 1
        sorthashmap = sorted((hashmap.values()), reverse=True)
        res = []
        i = 0
        print(sorthashmap)
        while i < k:
            for m in hashmap:
                if hashmap[m] == sorthashmap[i]:
                    res.append(m)
                    i += 1
                    hashmap.pop(m)
                    break
        
        return res