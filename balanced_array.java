int left = 0;
int right = 0;

for(int i=0; i<n/2; i++){
    left += a[i];
}
for(int i=n/2; i<n; i++){
    right += a[i];
}

//System.out.println(left + " "+ right);
return Math.abs(left-right);