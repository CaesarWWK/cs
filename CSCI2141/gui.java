import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class gui extends JFrame {
JFrame frame1,frame2,frame3,frame4;
JPanel ButtonPanel,LablePanel,InputPanel,OutputPanel,AddPanel,DeletePanel,UpdatePanel,ButtonArea;
JButton search,modify,search1,back,addbutton,modifybuttoon,deletebuttoon,process,backtomain,backmodify;
JTextField searchvalue,searchca,modifypk,deletepk,inputdata,inputcol;
JTextArea outputarea,addarea;


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
								modify.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {

																																if (e.getSource() == modify) {
																																								modifyui();
																																}
																								}
																});
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

public void modifyui(){
								frame3=new JFrame();
								frame1.setVisible(false);
								AddPanel = new JPanel();
								UpdatePanel=new JPanel();
								DeletePanel =new JPanel();

								JLabel userLabel = new JLabel("Modify the Data");
								userLabel.setFont(new   java.awt.Font("Dialog",   0,   20));
								userLabel.setBounds(10,20,80,25);


								JLabel addLable = new JLabel("Input the rows you want to add to the Database(Follow the Example in the Text Area)");
								addLable.setFont(new   java.awt.Font("Dialog",   0,   15));
								addLable.setBounds(10,20,80,25);
								addarea=new JTextArea(100,50);
								addbutton = new JButton("Apply");

								JLabel updateLable = new JLabel("Input the PK of the rows you want to modify\n(You can use the Search function to find it)");
								updateLable.setFont(new   java.awt.Font("Dialog",   0,   15));
								updateLable.setBounds(10,20,80,25);
								modifypk=new JTextField(10);
								modifybuttoon=new JButton("NEXT STEP");
								modifybuttoon.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {

																																if (e.getSource() == modifybuttoon) {
																																								updateui();
																																}
																								}
																});

								JLabel deleteLable = new JLabel("Input the PK of the rows you want to delete");
								deleteLable.setFont(new  java.awt.Font("Dialog",   0,   15));
								deleteLable.setBounds(10,20,80,25);
								deletepk=new JTextField(10);
								deletebuttoon=new JButton("Apply");
								backmodify=new JButton("Back");
								backmodify.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {

																																if (e.getSource() == backmodify) {
																																								frame1.setVisible(true);
																																								frame3.setVisible(false);
																																}
																								}
																});

								frame3.setLayout(new GridLayout(4,1));
								AddPanel.setLayout(new GridLayout(3,1));
								UpdatePanel.setLayout(new GridLayout(3,1));
								DeletePanel.setLayout(new GridLayout(3,1));
								AddPanel.add(addLable);
								AddPanel.add(addarea);
								AddPanel.add(addbutton);
								UpdatePanel.add(updateLable);
								UpdatePanel.add(modifypk);
								UpdatePanel.add(modifybuttoon);
								DeletePanel.add(deleteLable);
								DeletePanel.add(deletepk);
								DeletePanel.add(deletebuttoon);
								frame3.add(userLabel);
								frame3.add(AddPanel);
								frame3.add(UpdatePanel);
								frame3.add(DeletePanel);
								frame3.setSize(900,700);
								frame3.setLocation(200,200);
								frame3.setVisible(true);

}

public void updateui()
{
								frame3.setVisible(false);
								frame4=new JFrame();

								ButtonArea =new JPanel();
								JLabel userLabel = new JLabel("The data to be modified");
								userLabel.setFont(new   java.awt.Font("Dialog",   0,   20));
								userLabel.setBounds(10,20,80,25);




								JLabel dataLabel = new JLabel("");
								dataLabel.setFont(new   java.awt.Font("Dialog",   0,   15));
								dataLabel.setBounds(10,20,80,25);
								dataLabel.setPreferredSize(new Dimension(500, 200));


								JLabel inputLabel1 = new JLabel("Input the data value");
								inputLabel1.setFont(new   java.awt.Font("Dialog",   0,   15));
								inputLabel1.setBounds(10,20,80,25);
								inputdata=new JTextField(25);
								JLabel inputLabel2 = new JLabel("Input the column name");
								inputcol=new JTextField(25);


								process=new JButton("Process");
								backtomain=new JButton("Back");
								backtomain.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {

																																if (e.getSource() == backtomain) {
																																								frame1.setVisible(true);
																																								frame4.setVisible(false);
																																}
																								}
																});

								frame4.setLayout(new GridLayout(7,1));
								frame4.add(userLabel);
								frame4.add(dataLabel);
								frame4.add(inputLabel1);
								frame4.add(inputdata);
								frame4.add(inputLabel2);
								frame4.add(inputcol);
								ButtonArea.add(process);
								ButtonArea.add(backtomain);
								frame4.add(ButtonArea);
								frame4.setSize(900,700);
								frame4.setLocation(200,200);
								frame4.setVisible(true);
}



}
