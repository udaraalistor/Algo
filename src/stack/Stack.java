package stack;

public class Stack{
    private int[] stack;
    private int size;
    private int top;


    public Stack(){
        size=50;
        stack= new int[50];
        top=-1;
    }

   public Stack(int size){
       this.size= size;
       stack= new int[size];
       top=-1;
   }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean push(int value){
        if(!isFull()){
            top++;
            stack[top]=value;
            return true;
        }else {
            return false;
        }
    }
    public int pop(){
        return stack[top--];

    }

    public boolean isFull() {
        return (top==stack.length-1);
    }

}
