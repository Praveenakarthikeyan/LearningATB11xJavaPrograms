package ex_13_Array;

public class Lab079_Array_MaxMin {
    public static void main(String[] args) {
        int num[]={15,14,21,10,30,78,12};
        int max_no = max_no(num);
        int min_no = min_no(num);
        System.out.println("Maximum Number: "+max_no);
        System.out.println("Minimum Number: "+min_no);
    }

    public static int min_no(int num[]){
       int min= num[0];
       for(int i:num){
           if(i<min){
               min=i;
           }
       }
        return min;
    }

    public static int max_no(int num[]) {
        int max = num[0];
        for(int i : num){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}
