package quize.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    JButton start, back;
    String name;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>"
                + "1. Each question has a time limit of 30 seconds. If the player does not answer within this time, the question will be forwarded." + "<br><br>"
                + "2. The player can use a 50-50 lifeline to remove two incorrect answers, leaving only the correct answer and one incorrect answer." + "<br><br>"
                + "3. The player can only use the 50-50 lifeline once." + "<br><br>"
                + "4. The player can earn 10 points for each correct answer." + "<br><br>"
                + "5. The player can move to the next question even if they answer the current question." + "<br><br>"
                + "6. The player can see their total score in last." + "<br><br>"
                + "7. The Player can not submit the quiz until he reaches the last question." + "<br><br>"
                + "8. Attempt all question freely with no cheating! Good Luck" + "<br><br>"
                + "<html>"
        );
        add(rules);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }

}
