package test;


//Find common elements in several arrays
public class CommonEle {
    public static void main(String[] args) {
        CommonEle c = new CommonEle();
        int a[]={1,2,5,6,7};
        int b[]={2,4,8,9,23};
        int d[]={1,3,2};
        c.findCommon(a, b, d);
        
    }
    
    public void findCommon(int x[],int y[],int z[]){
        try{
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++){
                for(int k=0;k<x.length;k++){
                    if(x[i]==y[j]&&y[j]==z[k]){
                        System.out.println(x[i]);
                    }
                }
            }
        }
        }catch(ArrayIndexOutOfBoundsException er){
 
    }
    }
    
   
        
        
        
    }
    

