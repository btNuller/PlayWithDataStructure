package stack;

/**
 * @program: PlayWithDataStructure
 * @description:
 * @author: botao
 * @create: 2018-08-26 08:21
 **/
public interface Stack<E> {

    void push(E e);

    E pop();

    E peek();

    int getSize();

    boolean isEmpty();
    
}
