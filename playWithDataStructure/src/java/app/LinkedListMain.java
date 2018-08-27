package app;

import linked.LinkedList;

/**
 * @program: PlayWithDataStructure
 * @description:
 * @author: botao
 * @create: 2018-08-27 21:29
 **/
public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0 ; i < 5 ; i ++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }

        linkedList.add(2, 666);
        System.out.println(linkedList);

        linkedList.delete(2);
        System.out.println(linkedList);

        linkedList.deleteFirst();
        System.out.println(linkedList);

        linkedList.deleteLast();
        System.out.println(linkedList);
    }
}
