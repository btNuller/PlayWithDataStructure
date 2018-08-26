package app;

import array.Array;

/**
 * @program: PlayWithDataStructure
 * @description:
 * @author: botao
 * @create: 2018-08-10 22:53
 **/
public class ArrayMain {

    public static void main(String[] args) {
        Array<Integer> array = new Array<>();

        for(int i = 0 ; i < 8 ; i ++)
            array.addLast(i);
        array.addFirst(250);
        array.addLast(123);

        array.add(1, 123);

        System.out.println("add : " + array);


        array.delete(1);
        array.delete(1);
        array.delete(1);
        array.delete(1);
        array.delete(1);

        System.out.println("delete array : " + array);
    }
}
