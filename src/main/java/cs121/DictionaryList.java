package cs121;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryList extends ArrayList<String> {
    public DictionaryList() {
        try {
            Scanner file = new Scanner(new File("dict200k.txt"));
            while (file.hasNextLine()) {
                String line = file.nextLine();
                add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
