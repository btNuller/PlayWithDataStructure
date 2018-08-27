package app;

import linked.LinkedList;
import stack.ArrayStack;
import stack.LinkedListStack;
import stack.Stack;

import java.util.Random;

/**
 * @program: PlayWithDataStructure
 * @description:
 * @author: botao
 * @create: 2018-08-26 08:31
 **/
public class StackMain {

    public static double testStack(Stack<Integer> stack, int opCount) {
        long startTime = System.nanoTime();

        Random random = new Random();
        for(int i = 0 ; i < opCount ; i ++)
            stack.push(random.nextInt(Integer.MAX_VALUE));
        for(int i = 0 ; i < opCount ; i ++)
            stack.pop();

        long endTime = System.nanoTime();
        return (endTime - startTime) / 100000000.0;
    }

    public static void main(String[] args) {
        int opCount = 1000000;

        ArrayStack<Integer> arrayStack = new ArrayStack<>();

        double timeArray = testStack(arrayStack, opCount);
        System.out.println("ArrayStack, time : " + timeArray + " s");

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();

        double timeLinkedList = testStack(linkedListStack, opCount);
        System.out.println("LinkedStack time :  " + timeLinkedList + " s");
//        ArrayStack<Integer> arrayStack = new ArrayStack<>();
//        for(int i = 0 ; i < 5 ; i ++) {
//            arrayStack.push(i);
//            System.out.println(arrayStack);
//        }
//
//        arrayStack.pop();
//        System.out.println(arrayStack);
//
//
//        System.out.println("==========================");
//        System.out.println("linked List stack");
//
//        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
//
//        for(int i = 0 ; i < 5 ; i ++) {
//            linkedListStack.push(i);
//            System.out.println(linkedListStack);
//        }
//
//        linkedListStack.pop();
//        System.out.println(linkedListStack);
    }
}
