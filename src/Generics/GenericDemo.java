package Generics;

public class GenericDemo {

    public <M> M display(M val) {
        return val;
    }

    public static void main(String[] args) {
        GenericDemo obj = new GenericDemo();

        System.out.println("String: " + obj.display ("john"));
        System.out.println("Integer: " + obj.display(18));
    }

}
