package test;


public class StackImplementation {

    private int max; //maximum number of elements in the stack
    private int top; //top element of stack
    private int[] stack; //stack array
    
    //constructor
    public StackImplementation(int max){
        this.max = max;
        this.stack = new int[max];
        this.top = -1;
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }  
    
    public boolean isFull(){
        return (top == max-1);
    }
    
    public void push(int number) throws Exception{
        if(this.isFull()){
            throw new Exception("Stack is already filled!");
        }else{
            this.stack[++top] = number;
        }
    }
    
    public int pop() throws Exception{
        int top_element;
        if(this.isEmpty()){
            throw new Exception("Stack is empty!");
        }else{
            top_element = stack[top]; 
            --top;
        }
        return top_element;
    }
    
    public int peek(){ //return the top element without removing
        return stack[top];
    }
    
    public void print(){
        System.out.println("Element(s) in the stack ==> ");
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
       
    public static void main(String args[]){
        StackImplementation new_stack = new StackImplementation(6);
        
        try{
            new_stack.push(10);
            new_stack.push(90);
            new_stack.push(100);
            System.out.println("Top element is "+new_stack.peek());
            new_stack.push(234);
            new_stack.push(990);
            new_stack.push(12);
            new_stack.print();
            System.out.println("Remove the top element=> "+new_stack.pop());
            System.out.println("Top element is "+new_stack.peek());
            new_stack.print();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//main method
   
}//class

