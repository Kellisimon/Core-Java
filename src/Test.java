public class Test <k, v> {
//    int num = 5;
//    double number = 2.0;
//
//    public void num(){
////        return num;
//    }
//
//    public String run(){
//        return "num";
//    }
//
//    public double number(){
//        return number;
//    }
//
//    public int one (){
//        return 4;
//    }
    private k first;
    private v second;

    public Test(k a1, v a2){
        first = a1;
        second = a2;
    }

    public static void main(String[] args) {
        Test<Integer,String> obj = new Test<Integer, String>(10,"Kelli");

    }


}

