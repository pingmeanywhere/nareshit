package corejava.part3.streams.introduction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkingOfStreams {
    static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\streams\\streams.txt");

        fos.write("Ahh shit here we go again!!!".getBytes());
        fos.flush();
        fos.close();

        FileInputStream fis = new FileInputStream("D:\\streams\\streams.txt");

        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }
        fis.close();


        File file = new File("D:\\streams\\hello.pdf");
        file.createNewFile();
        if (file.exists()) {
            file.delete();
        }

        File fileList = new File("D:\\streams");

        System.out.println("\nFILES ARE : ");
        for (String s : fileList.list()) {
            if (new File(fileList, s).isFile()) {
                System.out.println(s);
            }
        }

    }
}
