package list_interface;

import java.util.*;

public class MyArrayList {
    //access in O(1)
    //modification"add, remove" O(n)

    //functions
    //modification
    /* add(value),add(index,value) ==> O(N)
    * addAll(collection<>) ==> O(N)
    * addFirst(value) ==> O(n)
    * addLast(value)
    *
    * remove(value), remove(index) ==> O(N)
    * removeALL(collection<>) ==> O(N)
    * removeIf(predicate<>) ==> O(N)
    * removeFirst(),removeLast()
    * retainAll(c)
    * */

    //accessing
    /*
    * get(index) ==> O(1)
    * getFirst(), getLast() ==> O(1)
    * set(index,value) ==> O(1)
    * indexOf(value) ==> O(n)
    * contains(value) ==> O(n)
    *
    * */

    //additional function
    /*
    * clone()
    * isEmpty()
    * size()
    * subList(from, to);
    * trimToSize()
    * sort()

    * */

    //iteration
    /*there are two ways for iterations
    * 1 - for , while
    * 2 - using iterator
    *
    * */

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        //add
        list.add(4);
        list.addAll(Arrays.asList(1,2,4,7,2,8,9,0,-5,6));
        list.add(4,4);

        //remove
        //if the value not in the list do nothing
        //list.remove((Integer) 4);//it removes the first 2 in the list
        list.remove((Integer) 155); //do nothing
        list.removeAll(Arrays.asList(4,2));//it removes the all 1s and 7s from the list
        list.sort((x,y)->{return x-y;});

        //subList
        System.out.println(list.subList(2,4));

        //iteration
        //by for loops
        System.out.print("list iteration with for loop: ");
        for(var item:list){
            System.out.printf("%-5d",item);
        }

        //by iterator
        System.out.print("\nlist iteration with for iterator: ");
        Iterator<Integer>it=list.iterator();
        while(it.hasNext()){
            int item = it.next();
            System.out.printf("%-5d",item);
        }
        //by listIterator(index)
        System.out.println();
        ListIterator<Integer>listIterator=list.listIterator(list.size());
        while(listIterator.hasPrevious()) {
            var item = listIterator.previous();
            System.out.printf("%-5d",item);
        }



    }
}
