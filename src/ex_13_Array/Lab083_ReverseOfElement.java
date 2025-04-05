package ex_13_Array;

public class Lab083_ReverseOfElement {
    public static void main(String[] args) {
        String names[] ={"Apple","Banana","Guava","Chickoo"};
        String rev="";
        for(int i= names.length-1;i>=0;i--){
            rev=rev + names[i] + " ";
        }
        System.out.println("reverse of elements:" +rev.trim());
    }
}
