package Examples;

import java.util.Random;

import DataStructure.Queue;

public class CustomerServiceQueue {
    public static void main(String[] args) {
        int maxClients = 5;
        var random = new Random();
        int client = random.nextInt(101);

        Queue queue = new Queue(client);
        System.out.println("Arrived Customer: " + client);
        for(int i = 2; i < maxClients; i++) {
            client = random.nextInt(101);
            System.out.println("Arrived Customer: " + client);
            queue.enqueue(client);
        }

        // Atendimento dos clientes

        var node = queue.dequeue();
        while(node != null) {
            System.out.println("Served customer: " + node.getValue());
            node = queue.dequeue();
        }
    }
}
