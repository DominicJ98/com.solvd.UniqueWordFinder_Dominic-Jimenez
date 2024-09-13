import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] ags) {
        try {
            // Read file as string
            File file = new File(Main.class.getClassLoader().getResource("input.txt").getFile());
            String content = FileUtils.readFileToString(file, "UTF-8");

            // Split content into words to determine unique words
            Set<String> uniqueWords = new HashSet<>(Arrays.asList(StringUtils.split(content.toLowerCase(), " \n\r\t.,;:!?")));

            // Write the result to output file
            FileUtils.writeStringToFile(new File("output.txt"), "Unique words: " + uniqueWords.size(), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
