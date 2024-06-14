package Problems;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReverse {
    public static Queue<Integer> reverseFirstKElements(Queue<Integer> queue, int k) {
        solveQueue(queue, k);
        int remaining = queue.size() - k;
        while(remaining-- > 0) {
            int element = queue.remove();
            queue.add(element);
        }
        return queue;
    }

    private static void solveQueue(final Queue<Integer> queue, final int k) {
        if(k == 0) return;
        int element = queue.remove();
        solveQueue(queue, k-1);
        queue.add(element);
    } 

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(11);
        queue.add(23);
        queue.add(34);
        queue.add(77);
        System.out.println(reverseFirstKElements(queue, 5));
    }
}
