class GfG
{
    public static Long product(Long arr[], Long mod, int n)
    {
        //yout code here
         long mul = 1;

        for (int i = 0; i < n; i++) {

            mul = (mul * arr[i])%mod;

        }

        

        return mul;
    }
}
