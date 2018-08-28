package tree;

import java.sql.SQLOutput;

/**
 * @program: PlayWithDataStructure
 * @description: binary search true
 * @author: botao
 * @create: 2018-08-28 20:40
 **/
public class BST<E extends Comparable<E>> {

    private class Node {

        public E e;

        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;

    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E e) {
        root = add(root, e);
    }

    //向以Node为根的二分搜索树中插入元素E，递归算法
    private Node add(Node node, E e) {
        if(node == null) {
            size++;
            return new Node(e);
        }

        if(e.compareTo(node.e) < 0)
            node.left = add(node.left, e);
        else if(e.compareTo(node.e) > 0) //e.compareTo(node, e) > 0
            node.right = add(node.right,e);
        return node;
    }

    //是否包含元素e
    public boolean contains(E e) {
        return contains(root, e);
    }

    // 看以node为根的二分搜索树中是否包含元素e，递归算法
    private boolean contains(Node node, E e) {
        if(node == null)
            return false;

        if(e.compareTo(node.e) == 0)
            return true;
        else if(e.compareTo(node.e) < 0)
            return contains(node.left, e);
        else //e.compareTo(node.e) > 0
            return contains(node.right, e);
    }

    //二分搜索树的前序遍历
    public void preOrder() {
        preOrder(root);
    }

    //前序遍历以node为根的二分搜索树
    private void preOrder(Node node) {

        if(node == null)
            return;

        System.out.println(node.e);

        preOrder(node.left);
        preOrder(node.right);
    }

    //二分搜索树的中序遍历
    public void midOrder() {
        midOrder(root);
    }

    //中序遍历以node为根的二分搜索树
    public void midOrder(Node node) {
        if(node == null)
            return;

        midOrder(node.left);
        System.out.println(node.e);
        midOrder(node.right);
    }

    //二分搜索树的后序遍历
    public void postOrder() {
        postOrder(root);
    }

    public void postOrder(Node node) {
        if(node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBSTString(root, 0, res);
        return res.toString();
    }

    //生成以node为根节点，深度为depth的描述二叉树的字符串
    private void generateBSTString(Node node, int depth, StringBuilder res) {
        if(node == null) {
            res.append(generateDepthString(depth) + "null\n");
            return;
        }

        res.append(generateDepthString(depth) + node.e + "\n");
        generateBSTString(node.left, depth + 1, res);
        generateBSTString(node.right, depth + 1, res);
    }

    private String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < depth ; i ++)
            res.append("--");
        return res.toString();
    }
}
