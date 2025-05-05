package ex_25_Collection_Framework.LIST;

import java.util.Stack;

public class Lab120_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("Seyon");
        s.push("Praveena");
        s.push("Minnoli");
        s.push("Karthik");
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);


        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("alagzhi"));
        System.out.println(s);
        System.out.println(s);
        s.add("Yogi");
        s.add("Yazh");
        s.push("Veena");
        System.out.println(s);

    }
}
