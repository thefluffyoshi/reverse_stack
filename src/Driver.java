import java.util.Stack;

public class Driver
{
    public static void main(String[] args)
    {
        Stack<Integer> origStack = new Stack<>();
        origStack.add(34);
        origStack.add(18);
        origStack.add(66);
        origStack.add(82);
        origStack.add(55);
        System.out.println("Original Stack: " + origStack);

        reverseStack reverse = new reverseStack();
        reverse.reverseOrigStack(origStack);

        System.out.println("----------\nReversed Stack: " + origStack);

        origStack.remove(0);
        System.out.println("----------\nNew Stack after removing index: " + origStack);

    }
}
