package queue_interface;

//functions
//offerFirst(value)
//offerLast(value)
//pollFirst()
//pollLast()
//peekFirst()
//peekLast()

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MyArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer>deque = new ArrayDeque<>();
        deque.offer(15);
        deque.offer(19);
        deque.offer(17);
        deque.offer(11);
        deque.offer(1);




    }
}
