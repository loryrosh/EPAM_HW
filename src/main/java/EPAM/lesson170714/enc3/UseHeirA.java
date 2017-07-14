package EPAM.lesson170714.enc3;

public class UseHeirA {
    public static void main(String[] args) {
        HeirOfA heir = new HeirOfA();

        // теперь доступен прямой вызов
        // переопределенного protected-метода,
        // который находится в том же пакете
        heir.m3();
        heir.m4();
    }
}
