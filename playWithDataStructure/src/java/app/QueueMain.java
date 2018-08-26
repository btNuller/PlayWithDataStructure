package app;

import queue.ArrayQueue;

/**
 * @program: PlayWithDataStructure
 * @description:
 * @author: botao
 * @create: 2018-08-26 08:57
 **/
public class QueueMain {

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for(int i = 0 ; i < 10 ; i ++) {
            queue.enqueue(i);
            System.out.println(queue);

            if(i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }


    }
}
