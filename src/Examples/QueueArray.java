package Examples;

public class QueueArray {
    private int[] queueArray;
    private int front;
    private int rear;
    private int length;
    private int capacity;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.queueArray = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.length = 0;
    }

    public void getFirst() {
        if(length > 0) {
            System.out.println("First: " + queueArray[front]);
        } else {
            System.out.println("Empty Queue.");
        }
    }

    public void getLast() {
        if(length > 0) {
            System.out.println("Last: " + queueArray[rear]);
        } else {
            System.out.println("Empty Queue.");
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void print() {
        System.out.println("###########");
        for(int i = 0; i < length; i++) {
            System.out.println(queueArray[(front + i) % capacity]);
        }
        System.out.println("###########");
    }

    public void enqueue(int valor) {
        if(length == capacity) {
            System.out.println("Queue is full.");
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = valor;
        length++;
    }

    public Integer dequeue() {
        if(length == 0) {
            System.out.println("Queue is empty.");
            return null;
        }
        int value = queueArray[front];
        front = (front + 1) % capacity;
        length--;
        return value;
    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        
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
