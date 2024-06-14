package DataStructure;

public class Queue {
    private Node firstNode;
    private Node lastNode;
    private int length;

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

    public Queue(int valor) {
        Node newNode = new Node(valor);
        firstNode = newNode;
        lastNode = newNode;
        length++;
    }

    public void getFirst() {
        if(firstNode != null) {
            System.out.println("First: " + firstNode.value);
        } else {
            System.out.println("Empty Queue.");
        }
    }

    public void getLast() {
        if(lastNode != null) {
            System.out.println("Last: " + lastNode.value);
        } else {
            System.out.println("Empty Queue.");
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void print() {
        System.out.println("###########");
        Node temp = firstNode;
        
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.nextNode;
        }
        System.out.println("###########");
    }

    public void enqueue(int valor) {
        Node newNode = new Node(valor);
        if(length == 0) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.nextNode = newNode;
            lastNode = newNode;
        }
        length++;
    }

    public Node dequeue() {
        if(length == 0) return null;
        Node temp = firstNode;
        if(length == 1) {
            firstNode = null;
            lastNode = null;
        } else {
            firstNode = firstNode.nextNode;
            temp.nextNode = null;
        }
        length--;
        return temp;
    }
    public static void main(String[] args) {
        Queue queue = new Queue(1);

        // queue.getFirst();
        // queue.getLast();
        // queue.getLength();
        
        // queue.print();

        queue.enqueue(2);
        queue.enqueue(3);
        
        queue.print();
        queue.getFirst();
        queue.getLast();
        queue.getLength();

        System.out.println("================");
        queue.dequeue();
        queue.print();
        queue.getFirst();
        queue.getLast();
        queue.getLength();
        
    }
}