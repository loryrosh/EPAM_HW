package EPAM.lesson170731.except;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("help.txt");

            try {
                int read = fis.read();
            } finally {
                fis.close(); // любые ошибки в finally будут перехвачены во внешнем
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) { // наследует от checked Exception - должен быть код в try
            ex.printStackTrace();
        }
    }
}
