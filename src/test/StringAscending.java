package test;



//make a string to ascending order

public class StringAscending {
    public static void main(String[] args) {
        StringAscending c = new StringAscending();
        String h = "Weerasinghe";
        c.stringasc(h);
        
    }
    
    public void stringasc(String str){
        char arr[]=str.toLowerCase().toCharArray();
        //char x[]=new char[arr.length];
        char temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        
        
    }
    
    
    
}
