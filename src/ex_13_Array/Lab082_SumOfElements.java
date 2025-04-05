package ex_13_Array;

public class Lab082_SumOfElements {
    public static void main(String[] args) {
        int arr[] = {10,21,14,30};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of elements:" +sum);
    }
}
