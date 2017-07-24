package EPAM.lesson170724;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyAdapter extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println(e);
    }
}
