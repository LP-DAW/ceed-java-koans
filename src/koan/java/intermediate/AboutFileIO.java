package intermediate;



import java.io.*;
import java.util.logging.Logger;

import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.*;

@RunWith(KoanRunner.class)
public class AboutFileIO {

    @Koan
    public void fileObjectDoesntCreateFile() {
        /* (@_@) */
        /* (^_^) */
        File f = new File("foo.txt");
        assertEquals(f.exists(), __);
    }

    @Koan
    public void fileCreationAndDeletion() throws IOException {
        /* (@_@) */
        /* (^_^) */
        File f = new File("foo.txt");
        f.createNewFile();
        assertEquals(f.exists(), __);
        f.delete();
        assertEquals(f.exists(), __);
    }

    @Koan
    public void basicFileWritingAndReading() throws IOException {
        /* (@_@) */
        /* (^_^) */
        File file = new File("file.txt");
        FileWriter fw = new FileWriter(file);
        fw.write("First line\nSecond line");
        fw.flush();
        fw.close();

        char[] in = new char[50];
        int size = 0;
        FileReader fr = new FileReader(file);
        size = fr.read(in);
        // No flush necessary!
        fr.close();
        assertEquals(size, __);
        assertEquals(new String(in), __);
        file.delete();
    }

    @Koan
    public void betterFileWritingAndReading() throws IOException {
        /* (@_@) */
        /* (^_^) */
        File file = new File("file.txt");
        file.deleteOnExit();
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("First line");
        pw.println("Second line");
        pw.close();

        FileReader fr = new FileReader(file);
        BufferedReader br = null;
        try {
            br = new BufferedReader(fr);
            assertEquals(br.readLine(), __); // first line
            assertEquals(br.readLine(), __); // second line
            assertEquals(br.readLine(), __); // what now?
        } finally {
            // anytime you open access to a file, you should close it or you may
            // lock it from other processes (ie frustrate people)
            closeStream(br);
        }
    }

    private void closeStream(BufferedReader br) {
        if (br != null) {
            try {
                br.close();
            } catch (IOException x) {
                Logger.getAnonymousLogger().severe("Unable to close reader.");
            }
        }
    }

    @Koan
    public void directChainingForReadingAndWriting() throws IOException {
        /* (@_@) */
        /* (^_^) */
        File file = new File("file.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("1. line");
        pw.println("2. line");
        pw.close();

        StringBuffer sb = new StringBuffer();
        // Add the loop to go through the file line by line and add the line
        // to the StringBuffer
        assertEquals(sb.toString(), "1. line\n2. line");
    }
}

