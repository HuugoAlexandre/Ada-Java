package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }

        public boolean isLeaf() {
            return (this.left == null) && (this.right == null);
        }
    }

    public void insert(int value) {
        if(root == null) root = new Node(value);
        else {
            Node newNode = new Node(value);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(queue.size() > 0) {
                Node currentNode = queue.remove();
                if(currentNode.left == null) {
                    currentNode.left = newNode;
                    break;
                } else {
                    queue.add(currentNode.left);
                }
                if(currentNode.right == null) {
                    currentNode.right = newNode;
                    break;
                } else {
                    queue.add(currentNode.right);
                }
            }
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(final Node node) {
        // Raiz, esquerda, direita.
        // Funciona da mesma forma que a busca em profundidade.
        if(node == null) return; 
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void posOrder() {
        posOrder(root);
    }

    private void posOrder(final Node node) {
        // Esquerda, direita, raiz.
        if(node == null) return; 
        posOrder(node.left);
        posOrder(node.right);
        System.out.println(node.value);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(final Node node) {
        // Esquerda, raiz, direita.
        if(node == null) return; 
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    // Busca  em largura
    public void BFS() {
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            Node node = queue.remove();
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);

            System.out.println(node.value);
        }
    }
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(11);
        tree.insert(9);
        tree.insert(8);
        tree.insert(22);
        tree.insert(19);
        tree.insert(15);
        tree.insert(3);
        
        System.out.println("########## PRE ORDER ##########");
        tree.preOrder();
        System.out.println("####### END OF PRE ORDER #######");
        System.out.println();
        System.out.println("########## POS ORDER ###########");
        tree.posOrder();
        System.out.println("####### END OF POS ORDER #######");
        System.out.println();
        System.out.println("########### IN ORDER ###########");
        tree.inOrder();
        System.out.println("######## END OF IN ORDER #######");
        System.out.println();
        System.out.println("##########    BFS    ###########");
        tree.BFS();
        System.out.println("######### END OF BFS ###########");
    }
}
