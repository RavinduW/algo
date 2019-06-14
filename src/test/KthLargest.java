package test;


//find the Nth largest number
public class KthLargest {
    public static void main(String[] args) {
         int arr[]={75,89,3,24,45,88,88,53,12,15};
         KthLargest l =new KthLargest();
         l.findlk(arr,3);
        
    }

    public void findlk(int x[],int k){
        int temp;
        for(int i=0;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
                if(x[i]<x[j]){
                    temp = x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
        for(int t=0;t<x.length;t++){
            if(k==t){
                System.out.println(x[t]);
            }
        }
    }
}
