package Parsing;

import java.io.*;

public class TXTGenerator {
    public static void generate() {
        try {
            File output = new File("output.txt");

            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output), "UTF-16"));

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
