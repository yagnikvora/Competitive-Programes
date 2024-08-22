import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyProgramToFile {
    public static void main(String[] args) {
        try{
            String content = new String(Files.readAllBytes(Paths.get("Extra/CopyProgramToFile.java")));
            FileWriter fw = new FileWriter("Code.txt");
            fw.write(content);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
