//make a number set to descending order

class Descending{
    public static void main(String[] args) {
        Descending d = new Descending();
        int arr[]={75,89,3,24,45,88,88,53,12,15};
        d.descending(arr);
        
}
    void descending(int x[]){
        int temp;
        //sorting
        for(int i=0;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
                if(x[i]<x[j]){
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        //printing the descending elements
        for(int k=0;k<x.length;k++){
            System.out.print(x[k]+" ");
        }
        System.out.println();
        
        
    }
    
    
    
    
    
}