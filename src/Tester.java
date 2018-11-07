public class Tester {
    public static void main(String args[]){
        StackInt<String> stack = new LinkedStack<>();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack);
    }

}
