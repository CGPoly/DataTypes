public class Stack<ContentType> {
    private class StackNode{
        StackNode lastNode = null;
        ContentType content;
        public StackNode(ContentType pContent){
            content = pContent;
        }
    }
    private StackNode top = null;
    public int length = 0;
    public boolean isEmpty(){
        return top == null;
    }

    public void push(ContentType pContent){
        if (!(pContent == null)){
            length++;
            if (isEmpty())
                top = new StackNode(pContent);
            else {
                StackNode tmp = new StackNode(pContent);
                tmp.lastNode = top;
                top = tmp;
            }
        }
    }

    public void pop(){
        if (!isEmpty()) {
            length--;
            top = top.lastNode;
        }
    }

    public ContentType top(){
        if (isEmpty())
            return null;
        else
            return top.content;
    }

    @Override
    public String toString(){
        return "Top = " + top() + "; length = " + length;
    }
}
