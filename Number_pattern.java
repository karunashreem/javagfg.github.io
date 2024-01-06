class Solution{
    ArrayList<String> numberPattern(int N){
        // code here
        ArrayList<String> strLst = new ArrayList<String>();
        int ans1 = 0;
        int ans2 = 0;
        String ansStr = "";
        for(int i = 1; i <= N; i++){
            for(int j = 0; j < (2 * i - 1); j++){
                if(ans1 < i){
                    ans1 = ++ans1;
                    ans2 = ans1;
                    ansStr += Integer.toString(ans1);
                }else{
                    ans2 = --ans2;
                    ansStr += Integer.toString(ans2);
                }
            }
            strLst.add(ansStr);
            ans1 = 0;
            ans2 = 0;
            ansStr = "";
        }
        return strLst;
    }
}