class Solution{
    static void printPattern(int N){
        // code here'\
        for(int i=0;i<N;i++){
            String vector[]=new String[N]; 
            String aux="";
            for(int m=0;m<=i;m++){
                aux=aux+"*";
            }
            vector[i]=aux;
            System.out.print(vector[i]);
            System.out.print(" ");
        }
    }
}