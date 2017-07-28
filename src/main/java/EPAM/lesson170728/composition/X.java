package EPAM.lesson170728.composition;

public class X implements LongProtocol {
    LongProtocol y;
    // класс-Helper, которому мы делегируем реальную работу
    // если очень много методов в интерфейсе, то "много" нужно делать делегирования y.<метод>()

    public X(Y y) {
        this.y = y;
    }

    @Override
    public void a() {
        y.a();
    }

    @Override
    public void b() {
        y.b();
    }

    @Override
    public void c() {
        y.c();
    }

    @Override
    public void d() {
        y.d();
    }
}
