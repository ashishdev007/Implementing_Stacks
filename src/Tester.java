public class Tester {
    public static void main(String args[]){
        StackInt<String> stack = new ArrayImplement<>();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());

        try {
            System.out.println(stack);
            System.out.println(stack.peek());
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
