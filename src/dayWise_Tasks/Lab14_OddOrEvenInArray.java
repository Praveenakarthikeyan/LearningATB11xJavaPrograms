package dayWise_Tasks;

public class Lab14_OddOrEvenInArray {
    public static void main(String[] args) {
        int num[] = {10,21,14,30,23,24};

        for(int i=0; i<num.length;i++){
            if(num[i] % 2 ==0){
                System.out.println(" Even no in array:" +num[i]);
            }else
                System.out.println(" odd No in array:" + num[i]);
        }



    }
}
