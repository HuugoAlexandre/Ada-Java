package DataStructure;

public class Stack {
    private Node top;
    private int height;

    public class Node {
        int value;
        Node nextNode;
    
        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void getTop() {
        if(top == null) {
            System.out.println("Empty stack.");
        } else { 
            System.out.println("Top: " + top.value);
        }
    }

    public void getHeight() {
        System.out.println("Height: " + height);
    }

    public void print() {
        Node temp = top;
        System.out.println("#############");
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.nextNode;
        }
        System.out.println("#############");
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if(height == 0) {
            top = newNode;
        } else {
            newNode.nextNode = top;
            top = newNode;
        }
        height++;
    }

    public Node pop() {
        if(height == 0) return null;
        
        Node temp = top;
        top = top.nextNode;
        temp.nextNode = null;
        height--;

        return temp;
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(10);
        myStack.getTop();
        myStack.getHeight();
        myStack.print();
        System.out.println("|||||||||||||");
        myStack.push(3);
        myStack.getTop();
        myStack.getHeight();
        myStack.print();
        System.out.println("|||||||||||||");
        myStack.push(5);
        myStack.getTop();
        myStack.getHeight();
        myStack.print();
        System.out.println("|||||||||||||");
        myStack.pop();
        myStack.getTop();
        myStack.getHeight();
        myStack.print();
    }
}   
