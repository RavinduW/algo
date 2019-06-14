package test;


//find a max
public class Max {
    public static void main(String[] args) {
        Max m = new Max();
        int arr[]={75,89,3,24,45,88,88,53,12,15};
        m.findMax(arr);
    }
    void findMax(int x[]){
        int max = x[0];
        
        for(int i=0;i<x.length;i++){
            if(x[i]>max){
                max = x[i];
            }
        }
        
        System.out.println(max);
        
    }
}
