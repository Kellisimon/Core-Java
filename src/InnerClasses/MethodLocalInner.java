package InnerClasses;

public class MethodLocalInner {
    private static MethodLocalInner Inner;
    private String x = "My OuterClass";

    void display(){
        final String z = "Local Variable";
        System.out.println("x: " + x);

        class Inner{
            public void print(){
                System.out.println("will it print x? " + x);
                System.out.println("will it print x?");
            }
        }

        Inner run = new Inner();
        run.print();

    }

    public static void main(String[] args) {
        MethodLocalInner Inner = new MethodLocalInner();
        Inner.display();

    }


}
