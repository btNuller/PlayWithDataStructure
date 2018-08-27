package app;

import queue.LinkedListQueue;

/**
 * @program: PlayWithDataStructure
 * @description:
 * @author: botao
 * @create: 2018-08-27 22:31
 **/
public class LinkedListQueueMain {

    public static void main(String[] args) {
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<Integer>();

        for(int i = 0 ; i < 10 ; i ++) {
            linkedListQueue.enqueue(i);
            System.out.println(linkedListQueue);

            if(i % 3 == 2) {
                linkedListQueue.dequeue();
                System.out.println(linkedListQueue);
            }
        }

    }
}
