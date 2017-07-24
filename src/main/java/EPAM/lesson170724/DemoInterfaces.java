package EPAM.lesson170724;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DemoInterfaces {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // завершаем программу по закрытию окна

        JPanel panel = new JPanel();
        //panel.addMouseListener(new MyMouseListener()); // interface MouseListener, реализующий паттерн Observer

        // слушаем drag&drop - у всех методов адаптера пустая реализация,
        // чтобы реализовать только то поведение, которое нам нужно,
        // - не нужно реализовывать все методы интерфейса MouseListener
        // анонимный класс
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
            }
        });

        panel.addMouseListener(new MyAdapter() { // вынести реализацию в отдельный класс
        });

        // действуем через анонимный класс;
        // обязательно нужно реализовать все методы интерфейса;
        // неудобно
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        panel.setPreferredSize(new Dimension(400, 400));
        frame.add(panel);
        frame.pack(); // помещаем все содержимое на экране
        frame.setVisible(true);
    }
}
