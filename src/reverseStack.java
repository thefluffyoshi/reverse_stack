import java.util.Stack;

public class reverseStack
{
    public void reverseOrigStack(Stack<Integer> origStack)
    {
        if (origStack.isEmpty() == false)
        {
            int store = origStack.pop();
            reverseOrigStack(origStack);

            addToBottom(origStack, store);
        }//end if
    }//end reverseOrigStack

    public void addToBottom(Stack<Integer> origStack, int store)
{
    if (origStack.isEmpty())
    {
        origStack.push(store);
        return;
    }

    int store2 = origStack.pop();
    addToBottom(origStack, store);

    origStack.push(store2);
}//end add to bottom

}//end class reverseStack
