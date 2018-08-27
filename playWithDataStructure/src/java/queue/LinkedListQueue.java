package queue;

/**
 * @program: PlayWithDataStructure
 * @description:
 * @author: botao
 * @create: 2018-08-27 22:17
 **/
public class LinkedListQueue<E> implements Queue<E> {

    private class Node {

        public E e;

        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node front, rear;

    private int size;

    public LinkedListQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public void enqueue(E e) {
        if(rear == null) {
            rear = new Node(e);
            front = rear;
        } else {
            rear.next = new Node(e);
            rear = rear.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if(isEmpty())
            throw new IllegalArgumentException("Cannot dequeue from an empty queue!");

        Node retNode = front;
        front = front.next;
        retNode.next = null;
        if(front == null)
            rear = null;
        size--;

        return retNode.e;
    }

    @Override
    public E getFront() {
        if(isEmpty())
            throw new IllegalArgumentException("Cannot getFront from an empty queue!");
        return front.e;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue : front");

        Node cur = front;
        while(cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }
        return res.append("NULL rear").toString();
    }
}
