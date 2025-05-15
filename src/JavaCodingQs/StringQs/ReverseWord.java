package JavaCodingQs.StringQs;

public class ReverseWord {
    public static void main(String[] args) {
        String s = " I am learning java";
        String[] w = s.split("\\s");
        String reverseString="";
        for(String s1:w){
            String reverseWord="";
            for(int i=s1.length()-1;i>=0;i--){
                reverseWord=reverseWord + s1.charAt(i);
            }
            reverseString=reverseString+reverseWord + " ";
        }
        System.out.println("The output:" +reverseString);
    }
}
