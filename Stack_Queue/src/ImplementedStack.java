public class ImplementedStack {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack();
        stack.push(12);
        stack.push(42);
        stack.push(18);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
