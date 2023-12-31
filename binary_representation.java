class Solution{
    static String getBinaryRep(int N){
        // code here
        String binaryString = Integer.toBinaryString(N);

        String str = "";

        for (int i = 0; i < 30 - binaryString.length(); i++) {

            str += "0";

        }

        return (str+binaryString);
    }
}