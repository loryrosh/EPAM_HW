package EPAM.lesson170901;

public class HashCodeEquals {
    private final int id;
    private final String name;
    private final int age;

    public HashCodeEquals(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // эта строка присутствует в любой реализации (переданный объект обладает нужным типом)
        if (!(obj instanceof HashCodeEquals)) {
            return false;
        }

        // обязательный каст
        HashCodeEquals other = (HashCodeEquals) obj;

        if (this.id != other.id) {
            return false;
        }

        if (this.age != other.age) {
            return false;
        }

        return this.name.equals(other.name); // сравниваем только имени
    }

    @Override
    public int hashCode() {
        int hashCode = 7;

        // использовать те же поля, что и в equals
        // использовать final-поля
        hashCode += 31 * this.name.hashCode();
        hashCode += 31 * this.id;
        hashCode += 31 * this.age;
        return hashCode;
    }
}
