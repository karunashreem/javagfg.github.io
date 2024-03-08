
class Solution {
    static int isGoodorBad(String S) {
        // code here
        int vowel=0, conso=0;
        for(int i=0;i<S.length();i++) {
            char ch=S.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vowel++;
                conso=0;
            }else if(ch=='?') {
                conso++;
                vowel++;
            }
            else {
                conso++;
                vowel=0;
            }
            if(vowel>5 || conso>3) return 0;
        }return 1;
    }
};