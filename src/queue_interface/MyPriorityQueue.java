package queue_interface;


import java.util.*;
public class MyPriorityQueue {
    // PriorityQueue: Implements a priority heap data structure.
    //offer the element in stored way
    // Elements are ordered based on their natural ordering or a specified comparator.
    /**
     *
     *     LinkedList:  efficient insertion and removal at both ends of the list (add(), offer(), remove(), poll(), peek()),
     *                  but accessing elements by index (get()) has linear time complexity.
     *     PriorityQueue: Offers efficient retrieval of the highest (or lowest) priority element (peek() and poll() have logarithmic time complexity),
     *                  but insertion and removal operations may be slower due to heap restructuring.
     *
     *
     * */

    //functions
    //offer(value) ==> O(log(n))
    //poll() ==> O(log(n))
    //peek() ==> O(log(n))
    //contains(value) ==> O(N)

    public static void main(String[] args) {
        Queue<node>priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(List.of(new node(1,3), new node(3,1), new node(6,3), new node(18,0), new node(0,20)));
        node x = priorityQueue.poll();
        System.out.println(x.first+"\t\t"+x.last);


    }
}

class node implements Comparable<node> {
    Integer first;
    Integer last;
    public node(int first, int last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public int compareTo(node o1) {
        if(this.last == o1.last) {
            return  o1.first.compareTo(this.first);
        }
        return o1.last.compareTo(this.last);
    }
}
