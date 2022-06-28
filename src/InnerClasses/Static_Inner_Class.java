package InnerClasses;

public class Static_Inner_Class {
    private String name = "Kelli";
    private static int age = 20;

    static class staticClass{

        public void run(){
            System.out.println("My age is "+ age);
        }
    }

    public static void main(String[] args) {
        Static_Inner_Class.staticClass run = new Static_Inner_Class.staticClass();
        run.run();
    }
}
