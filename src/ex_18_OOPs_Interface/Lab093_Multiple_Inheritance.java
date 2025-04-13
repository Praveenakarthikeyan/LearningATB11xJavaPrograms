package ex_18_OOPs_Interface;

public class Lab093_Multiple_Inheritance {
    public static void main(String[] args) {
Child child=new Child();
child.money();
    }
}
interface Father{
    void money();
}

interface Mother{
    void money();
}

class Child implements Father,Mother {

    @Override
    public void money() {
        System.out.println("Child's money!!");
    }
}