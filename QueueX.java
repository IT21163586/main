package character;

public class QueueX {
    private char myArr [];

    private int maxSize;
    private int front;
    private int rear;
    private int nItems;

    public QueueX (int size)
    {
        maxSize = size;
        myArr = new char[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(char value)
    {
        if(rear == maxSize - 1)
            rear = -1;
        myArr[++rear] = value;
        nItems++;
    }
    public char remove()
    {
        char temp = myArr[front++];
        if(front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }
    public boolean isEmpty() // true if queue is empty
    {
        return (nItems == 0);
    }
    public boolean isFull() // true if queue is full
    {
        return (nItems == maxSize);
    }
}
