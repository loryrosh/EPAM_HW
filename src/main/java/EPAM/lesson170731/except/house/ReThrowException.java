package EPAM.lesson170731.except.house;

public class ReThrowException {
    public static void main(String[] args) {
        try {
            buildHouse();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void buildHouse() {
        try {
            buildBasement();
        } catch (Exception ex) {
            throw new ПроблемыСТехникой(ex);
        }
    }

    private static void buildBasement() {
        try {
            digPit();
        } catch (Exception ex) {
            throw new НетИнструмента(ex); // наверх выбрасываем ошибку более общего вида
        }

    }

    private static void digPit() {
        throw new НетЛопаты();
    }
}
