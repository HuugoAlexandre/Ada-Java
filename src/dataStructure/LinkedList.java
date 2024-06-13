package dataStructure;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        String data;
        Node nextNode;

        public Node(String data) {
            this.data = data;
        }
    }

    public LinkedList(String data) {
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    public void getHead() {
        if(this.head == null) {
            System.out.println("Empty list.");
        } else {
            System.out.println("Head: " + head.data);
        }
    }
    
    public void getTail() {
        if(this.tail == null) {
            System.out.println("Empty list.");
        } else {
            System.out.println("Tail: " + tail.data);
        }
    }

    public void getLength() {
        System.out.println("Length: " + this.length);
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void print() {
        System.out.println("#################");
        Node temp = this.head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.nextNode;
        }
        System.out.println("#################");
    }

    public void append(String data) {
        Node newNode = new Node(data);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) return null;
        Node temp = head;

        head = head.nextNode;
        temp.nextNode = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node pre = head;
        Node temp = null;

        while(pre.nextNode != tail) {
            pre = pre.nextNode;
        }
        temp = tail;
        tail = pre;
        tail.nextNode = null;
        length--;

        if(length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public void preprend(String data) {
        Node newNode = new Node(data);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }
        length++;
    }

    public Node get(int index){
        if(index < 0 || index >= length) return null;
        Node temp = head;

        for(int i = 0; i < index; i++) {
            temp = temp.nextNode;
        }

        return temp;
    }

    public boolean set(int index, String data) {
        Node temp = get(index);
        if(temp != null) {
            temp.data = data;
            return true;
        }
        return false;
    }

    public boolean insert(int index, String data) {
        if(index < 0 || index >= length) return false;
        if(index == 0) {
            preprend(data);
            return true;
        } else if (index == length) {
            append(data);
            return true;
        } 

        Node newNode = new Node(data);
        Node temp = get(index - 1);
        newNode.nextNode = temp.nextNode;
        temp.nextNode = newNode;
        length++;
        return true;
       
    }

    public Node remove(int index) {
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        // Exemplo:
        // Quero eliminar o elemento 3
        Node temp = get(index - 1); // Seleciono o elemento 2
        Node nodeExclude = get(index); // Seleciono o elemento 3
        temp.nextNode = nodeExclude.nextNode; // Faço o 2 apontar pro 4
        nodeExclude.nextNode = null; // Faço o 3 apontar para nulo
        length--;
        return nodeExclude;

    }
    public static void main(String[] args) {
        LinkedList lista = new LinkedList("1");
        lista.append("2");
        lista.append("4");
        lista.preprend("0");
        lista.insert(3, "3");
        System.out.println("ANTES");
        lista.getHead();
        lista.getTail();
        lista.getLength();
        lista.print();
        System.out.println("DEPOIS");
        lista.removeFirst();
        lista.removeLast();
        lista.remove(1);
        // lista.set(1, "44");
        // System.out.println(lista.removeFirst().data);
        // System.out.println(lista.removeLast().data);
        lista.getHead();
        lista.getTail();
        lista.getLength();
        lista.print();
    }
} 