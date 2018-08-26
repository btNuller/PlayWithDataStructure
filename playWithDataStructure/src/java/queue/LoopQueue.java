package queue;

/**
 * @program: PlayWithDataStructure
 * @description:
 * @author: botao
 * @create: 2018-08-26 09:15
 **/
public class LoopQueue<E> implements Queue<E> {

    private E[] data;

    private int front, rear;

    private int size;

    public LoopQueue(int capacity) {
        data = (E[])new Object[capacity + 1];
        front = 0;
        rear = 0;
        size = 0;
    }

    public LoopQueue() {
        this(10);
    }

    public int getCapacity() {
        return data.length - 1;
    }

    @Override
    public void enqueue(E e) {
        if(isFull())
            resize(getCapacity() * 2);

        data[rear] = e;
        rear = (rear + 1) % data.length;
        size++;
    }

    @Override
    public E dequeue() {
        throwEmpty();
        E ret = data[front];

        data[front] = null;
        front = (front + 1) % data.length;
        size--;

        if(size == getCapacity() / 4 && getCapacity() / 2 != 0)
            resize(getCapacity() / 2);
        return ret;
    }

    private void throwEmpty() {
        if(isEmpty())
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
    }

    /**
     * 新的数组数据将之前的数组按公式从front头元素开始存，第一个位置，然后一直到rear队尾
     * @param newCapacity
     */
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity + 1];
        for(int i = 0 ; i < size ; i++)
            newData[i] = data[(i + front) % data.length];

        data = newData;
        front = 0;
        rear = size;
    }

    private boolean isFull() {
        return (rear + 1) % data.length == front;
    }

    @Override
    public E getFront() {
        throwEmpty();
        return data[front];
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue : size = %d , capacity = %d\n", size, getCapacity()));
        res.append("front [");
        for(int i = front ; i != rear ; i = (i + 1) % data.length) {
            res.append(data[i]);
            if((i + 1) % data.length != rear)
                res.append(", ");
        }
        return res.append("] rear").toString();
    }
}
