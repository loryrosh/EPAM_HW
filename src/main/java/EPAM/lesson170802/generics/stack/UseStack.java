package EPAM.lesson170802.generics.stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("one");
        //s.push(1); // ошибка компиляции

        Stack<Number> n = new Stack<>();
        n.push(1);
        //n.push("one"); // ошибка компиляции

        
    }
}
