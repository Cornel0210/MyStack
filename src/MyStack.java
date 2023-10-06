import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> firstQueue;
    private Queue<Integer> secondQueue;

    public MyStack() {
        firstQueue = new LinkedList<>();
        secondQueue = new LinkedList<>();
    }

    public void push(int x) {
        firstQueue.add(x);
    }

    public int pop() {
        while (firstQueue.size() > 1){
            secondQueue.add(firstQueue.poll());
        }
        int removedItem;
        if (firstQueue.size() == 1){
            removedItem = firstQueue.poll();
        } else {
            return Integer.MIN_VALUE;
        }

        while (secondQueue.size() != 0){
            firstQueue.add(secondQueue.poll());
        }
        return removedItem;
    }

    public int top() {
        while (firstQueue.size() > 1){
            secondQueue.add(firstQueue.poll());
        }
        int topItem;
        if (firstQueue.size() == 1){
            topItem = firstQueue.poll();
        } else {
            return Integer.MIN_VALUE;
        }

        secondQueue.add(topItem);
        while (secondQueue.size() != 0){
            firstQueue.add(secondQueue.poll());
        }
        return topItem;
    }

    public boolean empty() {
        return firstQueue.isEmpty();
    }
}
