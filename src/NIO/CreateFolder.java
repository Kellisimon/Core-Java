package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFolder {
        public static void main(String[] args) throws IOException {
            CreateFolder();

        }

        private static void CreateFolder()throws IOException {
            Path dir = Paths.get("C:/Java/NIO");
            Files.createDirectory(dir);
            System.out.println("Successful");
        }
    }

