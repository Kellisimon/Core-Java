package TypeCasting;

public class Parent {
    void show(){
        System.out.println("Parent show method is called");

    }
}
class child extends Parent{
    @Override
    void show(){
        System.out.println("Child show method is called");
    }
}
class main{
    public static void main(String[] args) {
        Parent obj = new child();
        obj.show();
    }
}