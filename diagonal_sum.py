class Solution:
	def DiagonalSum(self, matrix):
		# Code here
		first=second=0
        
        for i in range(len(matrix)):
            first+=matrix[i][i]
            second+=matrix[i][-i-1]
        
        return first+second