package HW4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyWindow extends JFrame {
        public MyWindow() {
            setTitle("Chat Widow");
            setBounds(300, 100, 600, 400);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
            JTextField field = new JTextField();
            field.setPreferredSize(new Dimension(100, 300));
            add(field);


            JTextField field2 = new JTextField();
            add(field2);
            field2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText((field.getText()+field2.getText()));
                    field2.setText("");

                }
            });
            JButton button = new JButton("Отправить");
            add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText((field.getText()+field2.getText()));
                    field2.setText("");
                }
            });
            JButton button2 = new JButton("Удалить");
            add(button2);
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field.setText("");
                    field2.setText("");
                }
            });


            setVisible(true);
        }
    }
    class MainClass {
        public static void main(String[] args) {
            new MyWindow();
        }
    }

