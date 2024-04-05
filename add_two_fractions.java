class GfG
{ 	
    void addFraction(int num1, int den1, int num2, int den2)
    {int r=0;
      int z=0;
        if(den1==den2)
        {
             r=(num1+num2);
             System.out.println(r+"/"+den1);
        }
        else
        {
             z=lcm(den1,den2);
            int p=z/den1;
            int q=z/den2;
        
             r=(p*num1+q*num2);
             //    System.out.println(r+"/"+z);
             simplify(r,z);
        }
        
    }
        public  void simplify(int num,int den)
    {
        int i=2;
        while(i<den)
        {
            while(num%i==0 && den%i==0)
            {
                num=num/i;
                den=den/i;                                
            }
            i++;
        }
        
        System.out.println(num+"/"+den);
        
    }
    public static int lcm(int denf,int dens)
    {
        int s=Math.max(denf, dens);
        while(s>0)
        {
        if(s%denf==0 && s %dens==0)
        {
            return s;
        }
        s++;
        }
        return 0;
    }
}