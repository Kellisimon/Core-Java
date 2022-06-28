package TypeCasting;

public class Implicit_Widening_CastingExample {
    public static void main(String[] args) {
        int i = 200;
        // automatic type conversion to long
        long l = i;
        // automatic type conversion to float
        float f = l;

        System.out.println(((Object)i).getClass().getSimpleName());
        System.out.println(((Object)l).getClass().getSimpleName());
        System.out.println(((Object)f).getClass().getSimpleName());
    }

}
