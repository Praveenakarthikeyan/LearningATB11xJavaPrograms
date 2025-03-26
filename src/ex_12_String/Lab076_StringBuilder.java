package ex_12_String;

public class Lab076_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        // Append text
        sb.append(" Programming");
        System.out.println("After append: " + sb); // Output: Java Programming

        // Insert text
        sb.insert(4, " Language");
        System.out.println("After insert: " + sb); // Output: Java Language Programming

        // Replace text
        sb.replace(5, 13, "Script");
        System.out.println("After replace: " + sb); // Output: Java Script Programming

        // Delete text
        sb.delete(5, 11);
        System.out.println("After delete: " + sb); // Output: Java Programming

        // Reverse text
        sb.reverse();
        System.out.println("After reverse:" +sb);
    }
}
