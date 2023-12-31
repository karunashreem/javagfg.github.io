
class Sol
{
    int[] count (String s)
    {
        // your code here     
        int[] ans = {0,0,0,0};

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 65 && ch <= 90) ans[0]++; // upperCase count

            if (ch >= 97 && ch <= 122) ans[1]++; // lowerCase count

            if (ch >= 48 && ch <= 57) ans[2]++; // numeric Count

            if (ch >= 32 && ch <= 47 ||

                ch >= 58 && ch <= 64 ||

                ch >= 91 && ch <= 96 ||

                ch >= 123 && ch <= 126) ans[3]++; // specialCharacter count

        }

       return ans;
    }
}