package MySet;
import java.util.*;
import java.util.function.Predicate;

public class MyHashSet {
    public static void main(String[] args) {

        Set<Integer>hashSet = new HashSet<>(); //unique, unordered
        Set<Integer>linkedHashSet = new LinkedHashSet<>(List.of(4,5,7,8,19)); //unique, ordered
        Set<node>treeSet = new TreeSet<>(List.of(new node(1,3), new node(3,1), new node(6,3), new node(18,0), new node(0,20))); //unique, sorted, O(log(n))



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
