package stack;

public class Main {
    public static void main(String[] args) {
        Stack s= new Stack(10);
             s.push(10);
             s.push(20);
             s.push(30);
        System.out.println(s.pop());
        System.out.println(s.pop());

    }

}
