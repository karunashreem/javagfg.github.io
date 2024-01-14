class GfG {
    int convertfive(int num) {
        // Your code here
        String str = Integer.toString(num);

        str = str.replaceAll("0","5");

        int ans = Integer.valueOf(str);

        return ans;
    }
}