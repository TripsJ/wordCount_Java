
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        File file = new File("Lorem.txt");
        try {
            Scanner scanner = new Scanner(new FileInputStream(file));
            HashMap<String, Integer> map = new HashMap<>();
            int count =0;
            while(scanner.hasNext()){
                count++;
                String word = scanner.next().toLowerCase();
                if (map.containsKey(word)){
                    map.put(word,map.get(word) +1);
                }
                else{
                    map.put(word,1);
                }


            }
            scanner.close();
            System.out.println(count);
            System.out.println(map);


        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        }
    }
}
