package EPAM.lesson170901.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

public class ReflectionExample2 {
    public static void main(String[] args) {
        Object o = new Object() {
            public void one() {
                System.out.println("my one!");
            }
        };

        process(null);
        process(o);
    }

    private static void process(Object obj) {
        if (obj == null)
            return;

        Class<? extends Object> clazz = obj.getClass();

        Method met = null;
        try {
            met = clazz.getMethod("one", null);
        } catch (NoSuchMethodException e) {
            System.out.println("no one");
        }

        // если нашли метод "one", то найти и запустить, если нет, то ничего и не делаем
        Optional.ofNullable(met).ifPresent(m -> {
            try {
                m.invoke(obj, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        });
    }
}
