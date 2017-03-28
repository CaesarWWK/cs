

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class gui extends JFrame {
JFrame frame1,frame2,frame3;
JPanel ButtonPanel,LablePanel,InputPanel,OutputPanel;
JButton search,modify,search1,back;
JTextField searchvalue,searchca;
JTextArea outputarea;


public gui() {

								frame1=new JFrame();
								ButtonPanel = new JPanel();
								LablePanel = new JPanel();


								JLabel userLabel = new JLabel("Welcome to the Database of the Game: Rainbox 6:Siege ");
								userLabel.setFont(new   java.awt.Font("Dialog",   0,   20));
								userLabel.setBounds(10,20,80,25);
								LablePanel.add(userLabel);
								LablePanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));



								search = new JButton("Search");
								search.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {

																																if (e.getSource() == search) {

																																								searchUI();
																																}

																								}
																});
								modify = new JButton("Modify");
								ButtonPanel.add(search);
								ButtonPanel.add(modify);

								ButtonPanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));




								frame1.setLayout(new BorderLayout());
								frame1.setSize(900,700);
								frame1.setLocation(200,200);
								frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								frame1.setVisible(true);
								frame1.add(ButtonPanel,"South");
								frame1.add(LablePanel,"North");
}

public void searchUI(){
								frame2=new JFrame();
								frame1.setVisible(false);
								JPanel ButtonPanel = new JPanel();
								LablePanel = new JPanel();
								InputPanel = new JPanel();
								OutputPanel=new JPanel();

								JLabel userLabel = new JLabel("Search whatever you like");
								userLabel.setFont(new   java.awt.Font("Dialog",   0,   20));
								userLabel.setBounds(10,20,80,25);

								LablePanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));


								JLabel inputLabel = new JLabel("Input the value, Null means select all from the table");
								inputLabel.setFont(new   java.awt.Font("Dialog",   0,   15));
								inputLabel.setBounds(10,20,80,25);
								searchvalue=new JTextField(25);

								JLabel inputLabel2 = new JLabel("Input the category, Null means select all from the table");
								inputLabel.setFont(new   java.awt.Font("Dialog",   0,   15));
								inputLabel.setBounds(10,20,80,25);
								searchca=new JTextField(25);

								InputPanel.setLayout(new GridLayout(4,4));

								InputPanel.add(inputLabel);
								InputPanel.add(searchvalue);
								InputPanel.add(inputLabel2);
								InputPanel.add(searchca);
								LablePanel.setLayout(new BorderLayout());


								LablePanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));





								JLabel outputLabel = new JLabel("Output");
								inputLabel.setFont(new  java.awt.Font("Dialog",   0,   15));
								inputLabel.setBounds(10,20,80,25);
								outputarea=new JTextArea("Output of the result",60,20);


								InputPanel.setLayout(new GridLayout(2,1));
								OutputPanel.setLayout(new BorderLayout());
								OutputPanel.add(outputLabel,"West");
								OutputPanel.add(outputarea,"Center");

								InputPanel.add(inputLabel);
								InputPanel.add(searchvalue);
								InputPanel.add(inputLabel2);
								InputPanel.add(searchca);
LablePanel.add(userLabel,"North");
								LablePanel.add(InputPanel,"North");
								LablePanel.add(OutputPanel,"Center");
								LablePanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));





								search1 = new JButton("Search");
								back=new JButton("Back");
								back.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {

																																if (e.getSource() == back) {

frame2.setVisible(false);
																																								frame1.setVisible(true);

																																}

																								}
																});
								ButtonPanel.add(search1);
								ButtonPanel.add(back);
								ButtonPanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));




								frame2.setLayout(new BorderLayout());
								frame2.setSize(900,700);
								frame2.setLocation(200,200);
								frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								frame2.setVisible(true);
								frame2.add(ButtonPanel,"South");
								frame2.add(LablePanel,"North");

}










}
