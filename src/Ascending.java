//Make a number set to ascending order
public class Ascending {
    public static void main(String[] args) {
        Ascending a  = new Ascending();
        int arr[]={75,89,3,24,45,88,88,53,12,15};
        a.asc(arr);
        
    }
    
    public void asc(int x[]){
        int temp;
        for(int i=0;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
                if(x[i]>x[j]){
                    temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
        for(int k=0;k<x.length;k++){
            System.out.print(x[k]+" ");
        }
    }
    
}
