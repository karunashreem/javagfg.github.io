class GfG{
    public int count(String s)
    {
        //add code here.
        String arr [] = s.split("0");
        int len = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > len){
                len = arr[i].length();
            }
        }
        return len;
    }
}