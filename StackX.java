package character;

public class StackX {

    private int maxSize;    // size of stack array
    private char[] stackArray;
    private int top;           //top of the stack

    public StackX(int s) // constructor
    {
        maxSize = s;       // set array size
        stackArray = new char[maxSize];
        top = -1;
    }
    public void push(char j)
    {
        // check whether stack is full
        if (top == maxSize- 1)
            System.out.println("Stack is full");
        else
            stackArray[++top] = j;
    }
    public char pop()
    {
        if (top == -1)
            return 0;
        else
            return stackArray[top--];
    }

    public char peek()
    {
        if (top == -1)
            return 0;
        else
            return stackArray[top];


    }
    public boolean isEmpty() {
        return (top == -1);
    }
}