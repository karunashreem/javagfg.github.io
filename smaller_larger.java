class Solution{
    public:	
        vector<int> getMoreAndLess(int arr[], int n, int x) {
            // code here
            vector<int> v;
            int count1= 0;
            int count2= 0;
            for (int i=0; i<n; i++){
                if(arr[i]>x){
                    count1++;
                }else if(arr[i]<x){
                    count2++;
                }else{
                    count1++;
                    count2++;
                }
            }
            v.push_back(count2);
            v.push_back(count1);
        
            return v;
        }
    };