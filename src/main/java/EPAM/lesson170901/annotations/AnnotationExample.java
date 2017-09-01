package EPAM.lesson170901.annotations;

import java.lang.annotation.Annotation;

@Anno
public class AnnotationExample {
    public static void main(String[] args) {
        Class<AnnotationExample> clazz = AnnotationExample.class;

        Annotation[] annos = clazz.getAnnotations();
        for (Annotation ann : annos) {
            System.out.println(ann);
        }
    }
}
