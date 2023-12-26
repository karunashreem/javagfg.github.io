string k;
        for(int i=0; i<s.length(); i++)
        {
            if(s[i]!=' '){
                k.push_back(s[i]);
            }
            else{
                continue;
            }
        }
        return k;