package list_interface;

import java.util.Stack;

public class MyStack {
    //The stack is the subclass of Vector
    //It implements the last-in-first-out data structure

    //new functions
    //pop() , push(val) , peek()
    public static void main(String[] args) {
        //"1478544587"
        //remove the 2s consecutive element
        System.out.println(filter("        "));
        System.out.println(filter("    mostaatfa"));

    }
    public static String filter(String str){
        Stack<Character>st=new Stack<>();
        str=str.trim();
        if(str == null || str.isEmpty()) {
            System.out.println("there are no input string");
            return "";
        }
        st.push(str.charAt(0));
        for (int i=1; i<str.length(); i++){
            if (st.peek() == str.charAt(i)) {
                st.pop();
            }
            else
                st.push(str.charAt(i));
        }
        return st.toString();
    }
}
