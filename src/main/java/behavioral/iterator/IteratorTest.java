package behavioral.iterator;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        try {
            IteratorTest main = new IteratorTest();
            File file = main.getFileFromResources("IteratorTestFile.txt");
            FileContentReader fileContentReader = new FileContentReader(file);
            Iterator<String> iterator = fileContentReader.iterator();
            while (iterator.hasNext()) {
                String next = iterator.next();
                System.out.println(next);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // get file from classpath, resources folder
    private File getFileFromResources(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }
}
