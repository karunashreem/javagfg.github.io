class Solution:
	def removeCharacters(self, S):
		# code here
		s = [i for i in S]
		out = []
        for i in s:
            if i.isnumeric():
               out.append(i)
        if len(out) == 0:
            return ''
        else:
            out = ''.join(out)
            return out