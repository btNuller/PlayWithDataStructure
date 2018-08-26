package app;

import queue.LoopQueue;
import queue.Queue;

/**
 * @program: PlayWithDataStructure
 * @description:
 * @author: botao
 * @create: 2018-08-26 09:49
 **/
public class LoopQueueMain {

    public static void main(String[] args) {
        Queue<Integer> queue = new LoopQueue<>();
        for(int i = 0 ; i < 10 ; i ++ ) {
            queue.enqueue(i);
            System.out.println(queue);

            if(i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
