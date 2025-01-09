package chapter7;
import java.awt.*;
import java.awt.event.*;
//
//class EventHandler implements ActionListener {
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("ActionEvent occurred!!!");
//    }
//}

public class _52anonymousClass {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                System.out.println("ActionEvent occurred !!!");
            }
        });
    }
}