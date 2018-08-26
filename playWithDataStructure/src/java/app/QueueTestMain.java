package app;

import queue.ArrayQueue;
import queue.LoopQueue;
import queue.Queue;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Random;

/**
 * @program: PlayWithDataStructure
 * @description:
 * @author: botao
 * @create: 2018-08-26 09:53
 **/
public class QueueTestMain {

    public static double testQueue(Queue<Integer> q, int opCount) {
        long startTime = System.nanoTime();

        // ...
        Random random = new Random();
        for(int i = 0; i < opCount; i++)
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        for(int i = 0; i < opCount; i++)
            q.dequeue();

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        int opCount = 100000;

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double arrTime = testQueue(arrayQueue, opCount);

        System.out.println("arrayQueue time : " + arrTime + " s ");


        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double loopTime = testQueue(loopQueue, opCount);

        System.out.println("loopQueue time : " + loopTime + " s ");
    }
}
