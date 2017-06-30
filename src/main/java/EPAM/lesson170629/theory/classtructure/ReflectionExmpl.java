package EPAM.lesson170629.theory.classtructure;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionExmpl {
    public static void main(String[] args) throws Exception {
        Class<A> c = A.class;
        System.out.println(c.getName());

        for (Method m : c.getMethods()) {
            System.out.println(m);
        }

        // то же, что и A a = new A();
        A a = c.newInstance();
        Constructor<A> constructor = c.getConstructor();
        A a2 = constructor.newInstance();

        Method m = c.getMethod("say");
        m.invoke(a); // то же, что и a.say()
    }
}
