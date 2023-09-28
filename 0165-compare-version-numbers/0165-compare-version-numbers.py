class Solution:
    def compareVersion(self, version1: str, version2: str) -> int:
        version1 = version1.split(".")
        version2 = version2.split(".")

        if len(version1) > len(version2):
            while len(version2) != len(version1):
                version2.append("0")
        if len(version2) > len(version1):
            while len(version2) != len(version1):
                version1.append("0")
        print(version1)
        print(version2)
        for i in range(len(version1)):
            if int(version1[i]) > int(version2[i]):
                return 1
            elif int(version1[i]) < int(version2[i]):
                return -1
        return 0
        