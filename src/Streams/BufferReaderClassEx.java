package Streams;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderClassEx {
    public static void main(String[] args) {
        //creates an array of characters
        char[] array = new char[100];
        try{
            FileReader file = new FileReader("C:\\Java\\input.txt.txt");
            //creates a bufferedReader
            BufferedReader input = new BufferedReader(file);
            //skips the 5 characters
            input.skip(5);
            //reads the characters
            input.read(array);
            System.out.println("Data after skipping 5 characters:");
            System.out.println(array);
            //closes the reader
            input.close();
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }
}
