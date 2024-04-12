class Solution 
{ 
    String ReverseSort(String str) 
    { 
        // code here
       char[] arr=str.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
} 