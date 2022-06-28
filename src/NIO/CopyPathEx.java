package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyPathEx {

    public static void main(String[] args)
    {
        Path source = Paths.get("C:\\Java\\input.txt");
        Path target = Paths.get("\\Java\\NIO");
        try {
            Files.copy(source, target.resolve(source.getFileName()), REPLACE_EXISTING);
        }catch
        (IOException e){
            e.printStackTrace();
        }
    }
}
