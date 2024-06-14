package DataStructure;

public class BST {
    public Node root;

    public class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        if(root == null) {
            root = new Node(value);
        } else {
            insert(root, value);
        }
    }

    private void insert(final Node root, final int value) {
        if(root == null) return;
        if(value == root.value) return;
        if(value > root.value) {
            if(root.right == null) root.right = new Node(value);
            else insert(root.right, value);
        } else {
            if(root.left == null) root.left = new Node(value);
            else insert(root.left, value);
        }
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

    public boolean contains(int value) {
        return contains(root, value);
    }
    private boolean contains(final Node root, final int value) {
        if(root == null) return false;
        if(root.value == value) return true;
        if(value > root.value) return contains(root.right, value);
        else return contains(root.left, value);
    }

    public int minValue(Node currentNode) {
        while(currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    public void deleteNode(int value) {
        root = deleteNode(root, value);
    }
    private Node deleteNode(final Node root, final int value) {
        if(root == null) return null;

        if(value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else { 
            if(root.left == null && root.right == null) return null;
            else if (root.left == null) return root.right; 
            else if (root.right == null) return root.left; 
            else {
                int minValue = minValue(root.right);
                root.value = minValue;
                root.right = deleteNode(root.right, minValue);
                
            }
        }  
        return root; 
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(11);
        tree.insert(9);
        tree.insert(8);
        tree.insert(22);
        tree.insert(19);
        tree.insert(15);
        tree.insert(3);

        // System.out.println(tree.contains(6));
        tree.deleteNode(11);
        // Navegação em ordem na busca binária resulta na ordem crescente
        tree.inOrder();
    }
}
