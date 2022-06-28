package Generics;

public class GenericClassDemo <T>{
    private T t;

    public void setValue (T t){
         this.t = t;
    }
    public T getValue(){
        return t;
    }

    public static void main(String[] args) {
        GenericClassDemo<Integer> Iobj = new GenericClassDemo<>();
        Iobj.setValue(10);
        System.out.println("Integer Object: " + Iobj.getValue());
    }
}
