package test;

//find a min
public class Min {
    public static void main(String[] args) {
        Min m = new Min();
        int arr[]={75,89,3,24,45,88,88,53,12,15};
        m.findMin(arr);
        
    }
    
    void findMin(int x[]){
        int min=x[0];
        for(int i=0;i<x.length;i++){
            
            if(x[i]<min){
                min = x[i];
            }
        }
        
        //print elements

        System.out.println(min);
        
        
    }
}
