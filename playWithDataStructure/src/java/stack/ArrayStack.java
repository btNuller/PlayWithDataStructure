package stack;

import array.Array;

/**
 * @program: PlayWithDataStructure
 * @description: 线性栈结构，复用array中的数据
 * @author: botao
 * @create: 2018-08-26 08:23
 **/
public class ArrayStack<E> implements Stack<E> {

    Array<E> array;

    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }

    public ArrayStack() {
        array = new Array<>();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.deleteLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity() {
        return array.getCatacity();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack : ");
        res.append('[');
        for(int i = 0 ; i < array.getSize() ; i ++) {
            res.append(array.get(i));
            if(i != array.getSize() - 1)
                res.append(", ");
        }
        return res.append("] TOP").toString();
    }
}
