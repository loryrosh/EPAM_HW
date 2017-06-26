package EPAM.lesson170624.hw.sign;

public class Sign {
    public static int sign(int i) {
        if(0 == i)
            return 0;
        if(i < 0)
            return -1;
        else
            return 1;
    }
}
