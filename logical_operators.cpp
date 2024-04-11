
void logicOp(int a, int b)
{
    /*output (a&&b), (a||b), and ((!a)&&(!b))separated by spaces*/ 
    int t1=a && b; 
    int t2=a || b;
    int t3=(!a) && (!b);
    
    cout<<t1<<" "<<t2<<" "<<t3<<" ";
    cout<<endl;
}