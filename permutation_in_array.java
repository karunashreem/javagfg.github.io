sort(a,a+n);
        sort(b,b+n,greater<long long>());
        
        for(int i=0;i<n;i++)
        {
            if(a[i]+b[i]<k)
            return false;
        }
        return true;