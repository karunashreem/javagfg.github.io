
class Solution{
    static double switchCase(int choice, List<Double> arr){
        // code here
        double x=0, y=0;
        switch(choice){
        case 1:
            x = ((arr.get(0)*arr.get(0))*Math.PI);
                break;
        case 2:
            y =(arr.get(0)*arr.get(1));
                break;
        }
         if(choice ==1){
            return x;
        }else{
            return y;
        }
    }
}