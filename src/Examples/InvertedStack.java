package Examples;

import DataStructure.Stack;

public class InvertedStack {
    private static void invert(int[] numbers) {
        Stack stack = new Stack(numbers[0]);

        for(int i = 1; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }

        var node = stack.pop();
        while(node != null) {
            System.out.println(node.getValue());
            node = stack.pop();
        }
    }
    public static void main(String[] args) {
        int [] numbers = {10,9,8,7,6,5,4,3,2,1};
        // int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        
        invert(numbers);
    }

}
