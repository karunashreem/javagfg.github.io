class Solution:
    def splitString(ob, S): 
        # code here 
        a = ''.join([i for i in S if i.isalpha()])
        d = ''.join([i for i in S  if i.isnumeric()])
        e = ''.join([i for i in S if not i.isalpha() and not i.isnumeric()])
        return a,d,e