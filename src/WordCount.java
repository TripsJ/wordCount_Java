
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        File file = new File("Lorem.txt");
        try {
            Scanner scanner = new Scanner(new FileInputStream(file));
            int count =0;
            while(scanner.hasNext()){
                scanner.next();
                count++;
            }
            System.out.println(count);

        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        }
    }
}
