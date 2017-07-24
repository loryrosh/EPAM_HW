package EPAM.lesson170724.serialization;

import java.io.*;
import java.util.Arrays;

public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A a = new A();
        a.x = 10;
        a.s = "Hello";

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // можно что-то записать сюда, только если оно Serializable
        // wrapper над ByteArrayOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        // записали что-то в буфер
        oos.writeObject(a);

        // получаем то, что записали
        byte[] data = baos.toByteArray();

        // произошла сериализация объекта
        System.out.println(Arrays.toString(data));

        ///////////////////////
        // десериализация
        ///////////////////////

        // читаем ByteArray
        ByteArrayInputStream bais = new ByteArrayInputStream(data);

        // делаем над ним обертку для чтения объекта целиком
        ObjectInputStream ois = new ObjectInputStream(bais);

        // читаем исходный объект
        A a2 = (A) ois.readObject();
        System.out.println(a2.x + " " + a2.s);
    }
}

class A implements Serializable {
    int x;
    String s;
}
