unordered_map<long long int,bool> visited;
for(int i=0;i<n;i++){
    if(visited[a[i]])
        return("BOYS");
    visited[a[i]]=true;
    
}
return("GIRLS");