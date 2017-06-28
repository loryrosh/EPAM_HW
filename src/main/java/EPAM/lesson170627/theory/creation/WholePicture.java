package EPAM.lesson170627.theory.creation;

public class WholePicture {

    static class A {
        // значения по умолчанию либо инициализация
        int i;
        int y = 10;
        final int z; // обязательно должна быть проиниц-на в блоке инициал-и или в конструкторе

        // блок инициализации экземпляра
        {
            i = y + 10;
        }

        A() {
            z = 30;
        }
    }
}
