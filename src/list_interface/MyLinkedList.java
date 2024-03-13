package list_interface;
import java.util.*;

public class MyLinkedList {
    //  It uses a doubly linked list internally to store the duplicate and ordered elements
    //it hase the same function of the ArrayList

    //access functions O(n)
    //removeFirst(),removeLast() , add from the end and begin ==> O(n)
    //remove , add from any other position O(n)

    //the functions the same in the ArrayList
    //the most used function
    //   removeFirst(),removeLast(),add(value), addFirst()

    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();

        //additin
        list.add(5); //O(1)
        list.add(8); //O(1)
        list.addFirst(18); //O(1)
        list.addAll(Arrays.asList(1,4,7,8,2,5)); //O(1)

        //deletion
        list.removeFirst(); //O(1)
        list.removeLast(); //O(1)
        list.remove((Integer) 8); //O(N)

        //accessing
        int getValue = list.get(2); //O(N)
        int index = list.indexOf(7); //O(N)
        int lastElement = list.getLast(); //O(1)
        int firstElement = list.getFirst(); //O(1)

        //iterator
        Iterator<Integer>iterator=list.iterator();
        while(iterator.hasNext()) {
            int value= iterator.next();
            System.out.printf("%-5d",value);;
        }
    }
}
