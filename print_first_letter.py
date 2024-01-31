class Solution:
    def firstAlphabet(self, S):
        ans = ""
        l = S.split()
        for i in l:
            ans += i[0]
        return ans