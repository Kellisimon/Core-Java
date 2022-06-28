package Streams;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx {
    public static void main(String[] args) {
        byte[] array = new byte[100];

        try {
            InputStream input = new FileInputStream("");
            System.out.println("available " + input.available());

            input.read(array);

        }catch (Exception e){
            e.getStackTrace();
        }

    }
}
