
class GFG {
    String longest(String names[], int n) {
        int max=0;
        int j=0;
        for (int i=0; i<n; i++){
            if(names[i].length()>max)
            {
                max = names[i].length();
                j =i;
                
            }
        }
        
        return names[j];
        
    }
}