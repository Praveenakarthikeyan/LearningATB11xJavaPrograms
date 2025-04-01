package ex_13_Array;

public class Lab077_ArrayCreation {
    public static void main(String[] args) {
         int arr[] = {1,2,3,4,5};
         int [] arr1 ={14,15,6,7,8};
        System.out.println(arr[1]);
        System.out.println(arr1[0]);
        System.out.println("----------------");

        String names[] ={"Seyon", "Minnoli", "Praveena"};
        System.out.println(names[1]);
        System.out.println(names[0]);
        System.out.println(names[2]);

        System.out.println("-------------");

        String[] n1 = {"Mowli", "Peter", "Simba"};
        System.out.println(n1.length);
        System.out.println(n1[2]);
        System.out.println(n1[1]);
        System.out.println(n1[0]);

        System.out.println("-----------------");

        String s1[] = new String[3];
        s1[0]="Moana";
        s1[1]="Rapunzel";
        s1[2]="Triya";

        for(int i=0; i< s1.length; i++){
            System.out.println(s1[i]);
        }
    }
}
