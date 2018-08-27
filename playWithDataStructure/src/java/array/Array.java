package array;

import com.sun.org.apache.bcel.internal.generic.SIPUSH;

/**
 * @program: PlayWithDataStructure
 * @description: custom array data structure
 * @author: botao
 * @create: 2018-08-10 21:17
 **/
public class Array<E> {

    private E[] data;

    private int size;

    private static final int DEFAULT_CATACITY = 10;

    public Array(int catacity) {
        data = (E[]) new Object[catacity];
    }

    public Array() {
        data = (E[]) new Object[DEFAULT_CATACITY];
    }

    public int getSize() {
       return size;
    }

    public int getCatacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, E e) {

        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and");

        if(size == data.length)
            resize(2 * data.length);
        checkIllegal(index, index > size, "add failed, index is error");
        for(int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];
        data[index] = e;
        size++;
    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for(int i = 0 ; i < size ; i ++)
            newData[i] = data[i];
        data = newData;
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);
    }

    public E get(int index) {
        checkIllegal(index, index >= size, "get failed, index error");
        return data[index];
    }

    public E getLast() {
        return get(size - 1);
    }

    public E getFirst() {
        return get(0);
    }

    public void set(int index, E e) {
        checkIllegal(index, index >= size, "set failed, index error");
        data[index] = e;
    }

    public boolean contains(E e) {
        for(int i = 0; i < size; i++)
            if(data[i].equals(e))
                return true;
        return false;
    }

    public int find(E e) {
        for(int i  = 0; i < size; i++)
            if(data[i].equals(e))
                return i;
        return -1;
    }

    private void checkIllegal(int index, boolean b, String s) {
        if (index < 0 || b)
            new IllegalArgumentException(s);
    }

    public E delete(int index) {
        checkIllegal(index, index >= size, "delete failed, index error");
        E deleteElement = data[index];
        for(int i = index; i < size - 1; i++)
            data[i] = data[i + 1];
        size--;
        data[size] = null; // loitering objects != memory leak

        if(size == getCatacity() / 4 && getCatacity() / 2 != 0)
            resize(data.length / 2);
        return deleteElement;
    }

    public E deleteFirst() {
        return delete(0);
    }

    public E deleteLast() {
        return delete(size - 1);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array : size = %d, capacity = %d\n",size, data.length));
        res.append('[');
        for(int i = 0; i < size; i++) {
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }

}
