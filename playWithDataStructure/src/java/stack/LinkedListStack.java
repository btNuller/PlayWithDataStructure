package stack;

import linked.LinkedList;

/**
 * @program: PlayWithDataStructure
 * @description: 栈的链表结构，在数据量不是特别大的时候性能较数组栈较好，但是没有复杂度巨大差距。
 * @author: botao
 * @create: 2018-08-27 21:56
 **/
public class LinkedListStack<E> implements Stack<E>{

    private LinkedList<E> list;

    public LinkedListStack() {
        list = new LinkedList<>();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.deleteFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack : top ");
        res.append(list);
        return res.toString();
    }
}
