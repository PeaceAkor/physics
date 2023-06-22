package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhysicsUI {
    JFrame frame = new JFrame("Window");
    JButton PhysicsCalc = new JButton("Physics Calculation");

    public void mainUI() {
        frame.setSize(150, 200);
        frame.setLayout(new GridLayout(3, 1));
        frame.setVisible(true);

        frame.add(PhysicsCalc);

        PhysicsCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { mainUI1();}
        });

    }

    JFrame frame2 = new JFrame("Window");
    JButton kinetic = new JButton("Calculate Kinetic Energy");
    JButton potential = new JButton("Calculate potential Energy");
    JButton momentum = new JButton("Calculate momentum Energy");
    JButton force = new JButton("Calculate force Energy");
    JButton workDone = new JButton("Calculate workDone Energy");

    public void mainUI1() {
        frame2.setSize(150, 200);
        frame2.setLayout(new GridLayout(5, 1));
        frame2.setVisible(true);

        frame2.add(kinetic);
        frame2.add(potential);
        frame2.add(momentum);
        frame2.add(force);
        frame2.add(workDone);
        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        kinetic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { mainUI2();

            }
        });

        potential.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { mainUI3();

            }
        });

        momentum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { mainUI4();

            }
        });

        force.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        workDone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    JFrame frame3 = new JFrame("Wimdow");

    JLabel text1 = new JLabel("Enter Mass");
    JLabel text2 = new JLabel("Enter Velocity");
    JTextField textField1 = new JTextField();
    JTextField textField2 = new JTextField();
    JButton calculate = new JButton("calculate");

    public void mainUI2() {
        frame3.setSize(150, 200);
        frame3.setLayout(new GridLayout(5, 1));
        frame3.setVisible(true);

        frame3.add(text1);
        frame3.add(textField1);
        frame3.add(text2);
        frame3.add(textField2);
        frame3.add(calculate);
        frame3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Energy myObj = new Energy();
                float answer = myObj.kineticEnergy(Float.parseFloat(textField1.getText()), Float.parseFloat(textField2.getText()));
                JOptionPane.showMessageDialog(null, answer);
            }

        });
    }

    JFrame frame4 = new JFrame("Wimdow");

    JLabel text3 = new JLabel("Enter mass");
    JLabel text4 = new JLabel("Enter height");
    JTextField textField3 = new JTextField();
    JTextField textField4 = new JTextField();
    JButton calculates = new JButton("calculate");

    public void mainUI3() {
        frame4.setSize(150, 200);
        frame4.setLayout(new GridLayout(5, 1));
        frame4.setVisible(true);

        frame4.add(text1);
        frame4.add(textField1);
        frame4.add(text2);
        frame4.add(textField2);
        frame4.add(calculate);
        frame4.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Energy myObj = new Energy();
                float answer = myObj.kineticEnergy(Float.parseFloat(textField1.getText()), Float.parseFloat(textField2.getText()));
                JOptionPane.showMessageDialog(null, answer);
            }

        });
    }

    JFrame frame5 = new JFrame("Wimdow");

    JLabel text5 = new JLabel("Enter mass");
    JLabel text6 = new JLabel("Enter velocity");
    JTextField textField5 = new JTextField();
    JTextField textField6 = new JTextField();
    JButton solvefor = new JButton("calculate");

    public void mainUI4() {
        frame4.setSize(150, 200);
        frame4.setLayout(new GridLayout(5, 1));
        frame4.setVisible(true);

        frame4.add(text1);
        frame4.add(textField1);
        frame4.add(text2);
        frame4.add(textField2);
        frame4.add(calculate);
        frame4.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Energy myObj = new Energy();
                float answer = myObj.kineticEnergy(Float.parseFloat(textField1.getText()), Float.parseFloat(textField2.getText()));
                JOptionPane.showMessageDialog(null, answer);
            }

        });
    }
}

