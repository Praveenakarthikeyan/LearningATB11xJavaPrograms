package ex_12_String;

public class Lab075_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Append text
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: Hello World

        // Insert text
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb); // Output: Hello Java World

        // Replace text
        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb); // Output: Hello C++ World

        // Delete text
        sb.delete(6, 9);
        System.out.println("After delete: " + sb); // Output: Hello + World

        // Reverse text
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
