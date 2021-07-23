package cn.viewshine.starbuzz.correct2;

import java.io.*;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream is = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream("E:/1.txt")
                )
        );
        while ( (c=is.read()) >= 0) {
            System.out.print((char)c);
        }
        is.close();
    }
}
