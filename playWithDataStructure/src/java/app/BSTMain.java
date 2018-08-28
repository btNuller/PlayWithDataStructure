package app;

import tree.BST;

/**
 * @program: PlayWithDataStructure
 * @description:
 * @author: botao
 * @create: 2018-08-28 21:32
 **/
public class BSTMain {

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();

        int[] nums = {5, 3, 6, 8, 4, 2};
        for(int num : nums)
            bst.add(num);
        bst.preOrder();
        System.out.println("=====中序遍历======");
        bst.midOrder();

        System.out.println(bst);

        System.out.println("=====后序遍历======");
        bst.postOrder();
    }
}
