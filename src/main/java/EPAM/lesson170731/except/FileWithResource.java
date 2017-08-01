package EPAM.lesson170731.except;

import java.io.FileInputStream;
import java.io.IOException;

public class FileWithResource {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        try (FileInputStream fis = new FileInputStream("/data/help.txt")) {
            Thread.sleep(10000);
            int read = fis.read();
            System.out.printf("read");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("end");
    }
}
