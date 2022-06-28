package NIO;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileEx1 {
    public static void main(String[] args) throws IOException {
        new CreateFileEx1();
        CreateFile();

    }

    private static void CreateFile()throws IOException {
        Path run = Paths.get("C:/Java/input2.txt");
        Files.createFile(run);
        System.out.println("Successful");
    }
}
