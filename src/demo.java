import java.util.Stack;

public class demo {
    public static void main(String[] args) {
        Stack binary = H10ToH2(12);
        showStack(binary);


    }




    static Stack H10ToH2(int number){
        int n=number;
        Stack binary = new Stack();
        while (n>0){
            binary.push(n%2);
            n=n/2;
        }
        return binary;
    }
    static void showStack(Stack stack){
        while (stack.size()>0){
            System.out.print(stack.pop());
        }
    }
}
