package by.belhard.j20.BPJ20.lessons.lesson08.IOExamples;

import java.io.*;

public class IOExample {

    public static void main(String[] args) {

        String path = "input.tt";

        File file = new File(path);

        InputStream input;

        try {
            try (InputStream input = new FileInputStream()) {

                int readByte;
                while ((readByte = input.read()) != -1) {
                    System.out.println(readByte);
                }
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            input.close();


        }







    }
}
