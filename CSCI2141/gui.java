import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;


public class gui extends JFrame {


JFrame frame1,frame2,frame3,frame4,gunframe,equipframe,charaframe;
JLabel guncode,equcode,gunname,gundmg,gunattack,gunmag,gunmot,gunnum,equnum,equinfor,equname,chal,chaf,charc,chacode,chah,chaw,chat,chad,charj;
JPanel ButtonPanel,LablePanel,InputPanel,OutputPanel,AddPanel,DeletePanel,UpdatePanel,ButtonArea,Inputarea,Buttonarea,functions,functions1,Buttonarea1,LablePanel1,functions2,Buttonarea2,LablePanel2;
JButton mmodify,mmodify1,mmodify2,modify1,search,modify,search1,back,addbutton,modifybuttoon,deletebuttoon,process,backtomain,backmodify,backmain,ssearch,add,ddelete,backk,ssearch1,add1,ddelete1,backk1,ssearch2,add2,ddelete2,backk2;
JTextField searchvalue,searchca,modifypk,deletepk,inputdata,inputcol;
JTextArea outputarea,addarea,numarea,codearea,namearea,dmgarea,equcodearea,magarea,motarea,attackarea,information,equnumarea,equnamearea,equinforarea,information1,ccodearea,clarea,cfarea,ccarea,charea,cwarea,cdarea,cjarea,ctarea,information2;


public gui() {
								frame1=new JFrame();
								ButtonPanel = new JPanel();
								LablePanel = new JPanel();
								JLabel userLabel = new JLabel("Welcome to the Database of the Game: Rainbox 6:Siege ");
								userLabel.setFont(new   java.awt.Font("Dialog",   0,   20));
								userLabel.setBounds(10,20,80,25);
								LablePanel.add(userLabel);
								LablePanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

								search = new JButton("Guns");
								search.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {

																																if (e.getSource() == search) {
																																								gunui();
																																}
																								}
																});
								modify = new JButton("Equipment");
								modify.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {

																																if (e.getSource() == modify) {
																																								equipui();
																																}
																								}
																});
								ButtonPanel.add(search);
								modify1 = new JButton("Character");
								modify1.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {

																																if (e.getSource() == modify1) {
																																								charaui();
																																}
																								}
																});
								ButtonPanel.add(modify);
								ButtonPanel.add(modify1);

								ButtonPanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));

								frame1.setLayout(new BorderLayout());
								frame1.setSize(900,700);
								frame1.setLocation(200,200);
								frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								frame1.setVisible(true);
								frame1.add(ButtonPanel,"South");
								frame1.add(LablePanel,"North");
}


public void gunui(){
								frame1.setVisible(false);
								gunframe=new JFrame();
								gunframe.setLayout(new GridLayout(3,1));
								functions = new JPanel();
								LablePanel = new JPanel();
								Buttonarea = new JPanel();
								Buttonarea.setLayout(new GridLayout(4,2));
								JLabel userLabel = new JLabel("This is the page for GUN Data ");
								userLabel.setFont(new   java.awt.Font("Dialog",   0,   20));
								userLabel.setBounds(10,20,80,25);
								LablePanel.add(userLabel);
								LablePanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

								guncode = new JLabel("GUN_CODE(Not Aviailable in Search)");
								gunname = new JLabel("GUN_NAME");
								gundmg = new JLabel("GUN_DMG");
								gunattack = new JLabel("GUN_ATTACK_SPEED");
								gunmot = new JLabel("GUN_MOTILITY");
								gunmag = new JLabel("GUN_MAGAZINE_SIZE");
								gunnum = new JLabel("GUN_NUM(Not Aviailable in Search)");

								codearea=new JTextArea("",10,2);
								namearea= new JTextArea("",10,2);
								dmgarea= new JTextArea("",10,2);
								attackarea= new JTextArea("",10,2);
								motarea= new JTextArea("",10,2);
								magarea= new JTextArea("",10,2);
								numarea=new JTextArea("",10,2);

								Buttonarea.add(guncode);
								Buttonarea.add(codearea);
								Buttonarea.add(gunname);
								Buttonarea.add(namearea);
								Buttonarea.add(gundmg);
								Buttonarea.add(dmgarea);
								Buttonarea.add(gunattack);
								Buttonarea.add(attackarea);
								Buttonarea.add(gunmot);
								Buttonarea.add(motarea);
								Buttonarea.add(gunmag);
								Buttonarea.add(magarea);
								Buttonarea.add(gunnum);
								Buttonarea.add(numarea);
								information = new JTextArea("",60,20);
								JScrollPane scroll2 = new JScrollPane(information);
								scroll2.setHorizontalScrollBarPolicy(
																JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
								scroll2.setVerticalScrollBarPolicy(
																JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
								OutputStream textAreaStream = new OutputStream() {
																public void write(int b) throws IOException {
																								information.append(String.valueOf((char)b));
																}

																public void write(byte b[]) throws IOException {
																								information.append(new String(b));
																}

																public void write(byte b[], int off, int len) throws IOException {
																								information.append(new String(b, off, len));
																}
								};
								PrintStream myOut = new PrintStream(textAreaStream);
								System.setOut(myOut);
								System.setErr(myOut);

								ssearch = new JButton("Search");
								ssearch.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {
																																if (e.getSource() == ssearch) {
																																								String dmg = dmgarea.getText();
																																								String name = namearea.getText();
																																								String attack = attackarea.getText();
																																								String mot = motarea.getText();
																																								String mag = magarea.getText();
																																								searchfunction a = new searchfunction();
																																								a.searchgun(name,dmg,attack,mot,mag);



																																}
																								}
																});
								add = new JButton("Add");
								add.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {
																																if (e.getSource() == add) {
																																								String guncode =codearea.getText();
																																								String gunnum = codearea.getText();

																																								String dmg = dmgarea.getText();
																																								String name = namearea.getText();
																																								String attack = attackarea.getText();
																																								String mot = motarea.getText();
																																								String mag = magarea.getText();
																																								addfunction a = new addfunction();
																																								a.addgun(guncode,name,dmg,attack,mot,mag,gunnum);



																																}
																								}
																});
								ddelete = new JButton("Delete(PROVIDE CODE ONLY)");
								ddelete.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {
																																if (e.getSource() == ddelete) {

																																								String code = codearea.getText();
																																								deletefunction a = new deletefunction();
																																								a.deletegun(code);



																																}
																								}
																});
								mmodify = new JButton("Modify(USE OLD NUMBER AND NEW DATA)");
								mmodify.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {
																																if (e.getSource() == mmodify) {
																																								String guncode =codearea.getText();
																																								String gunnum = codearea.getText();

																																								String dmg = dmgarea.getText();
																																								String name = namearea.getText();
																																								String attack = attackarea.getText();
																																								String mot = motarea.getText();
																																								String mag = magarea.getText();
																																								modifyfunction a = new modifyfunction();
																																								a.modifygun(guncode,name,dmg,attack,mot,mag,gunnum);



																																}
																								}
																});
								backk=new JButton("Back");
								backk.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {
																																if (e.getSource() == backk) {
																																								gunframe.setVisible(false);
																																								frame1.setVisible(true);



																																}
																								}
																});

								gunframe.setLayout(new GridLayout(4,1));
								functions.setLayout(new GridLayout(1,5));
								functions.add(ssearch);
								functions.add(add);
								functions.add(ddelete);
								functions.add(mmodify);
								functions.add(backk);
								gunframe.setSize(900,700);
								gunframe.setLocation(200,200);
								gunframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								gunframe.setVisible(true);
								gunframe.add(LablePanel);
								gunframe.add(Buttonarea);
								gunframe.add(scroll2);
								gunframe.add(functions);
								gunframe.setVisible(true);


}
public void equipui(){
								frame1.setVisible(false);
								equipframe=new JFrame();
								equipframe.setLayout(new GridLayout(3,1));
								functions1 = new JPanel();
								LablePanel1 = new JPanel();
								Buttonarea1= new JPanel();
								Buttonarea1.setLayout(new GridLayout(2,2));
								JLabel userLabel = new JLabel("This is the page for Equipment Data ");
								userLabel.setFont(new   java.awt.Font("Dialog",   0,   20));
								userLabel.setBounds(10,20,80,25);
								LablePanel1.add(userLabel);
								LablePanel1.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

								equnum = new JLabel("EQUIP_NUM");
								equname = new JLabel("EQUIP_NAME");
								equcode = new JLabel("EQUIP_CODE");
								equinfor = new JLabel("EQUIP_INFORMATION");

								equnumarea= new JTextArea("",10,2);
								equnamearea= new JTextArea("",10,2);
								equcodearea=new JTextArea("",10,2);
								equinforarea=new JTextArea("",10,2);


								Buttonarea1.add(equnum);
								Buttonarea1.add(equnumarea);
								Buttonarea1.add(equname);
								Buttonarea1.add(equnamearea);

								Buttonarea1.add(equcode);
								Buttonarea1.add(equcodearea);
								Buttonarea1.add(equinfor);
								Buttonarea1.add(equinforarea);


								information1 = new JTextArea("",60,20);
								JScrollPane scroll3 = new JScrollPane(information1);
								scroll3.setHorizontalScrollBarPolicy(
																JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
								scroll3.setVerticalScrollBarPolicy(
																JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
								OutputStream textAreaStream = new OutputStream() {
																public void write(int b) throws IOException {
																								information1.append(String.valueOf((char)b));
																}

																public void write(byte b[]) throws IOException {
																								information1.append(new String(b));
																}

																public void write(byte b[], int off, int len) throws IOException {
																								information1.append(new String(b, off, len));
																}
								};
								PrintStream myOut = new PrintStream(textAreaStream);
								System.setOut(myOut);
								System.setErr(myOut);
								ssearch1 = new JButton("Search");
								ssearch1.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {
																																if (e.getSource() == ssearch1) {
																																								String num = equnumarea.getText();
																																								String name = equnamearea.getText();

																																								searchfunction a = new searchfunction();
																																								a.searchEquip(num,name);



																																}
																								}
																});
								add1 = new JButton("Add");
								add1.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {
																																if (e.getSource() == add1) {
																																								String equnuma =equnumarea.getText();
																																								String equnam = equnamearea.getText();
																																								String code = equcodearea.getText();
																																								String infor = equinfor.getText();

																																								addfunction a = new addfunction();
																																								a.addequip(equnuma,equnam,code,infor);



																																}
																								}
																});
								ddelete1 = new JButton("Delete(PROVIDE CODE ONLY)");
								ddelete1.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {
																																if (e.getSource() == ddelete1) {

																																								String code = equnumarea.getText();
																																								deletefunction a = new deletefunction();
																																								a.deleteequip(code);



																																}
																								}
																});
								mmodify1=new JButton("(USE OLD NUMBER AND NEW DATA)");
								mmodify1.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {
																																if (e.getSource() == mmodify1) {
																																								String equnuma =equnumarea.getText();
																																								String equnam = equnamearea.getText();
																																								String code = equcodearea.getText();
																																								String infor = equinfor.getText();

																																								modifyfunction a = new modifyfunction();
																																								a.modifyequip(equnuma,equnam,code,infor);



																																}
																								}
																});
								backk1=new JButton("Back");
								backk1.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {
																																if (e.getSource() == backk1) {
																																								equipframe.setVisible(false);
																																								frame1.setVisible(true);



																																}
																								}
																});

								equipframe.setLayout(new GridLayout(4,1));
								functions1.setLayout(new GridLayout(1,5));
								functions1.add(ssearch1);
								functions1.add(add1);
								functions1.add(ddelete1);
								functions1.add(mmodify1);

								functions1.add(backk1);
								equipframe.setSize(900,700);
								equipframe.setLocation(200,200);
								equipframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								equipframe.setVisible(true);
								equipframe.add(LablePanel1);
								equipframe.add(Buttonarea1);
								equipframe.add(scroll3);
								equipframe.add(functions1);
								equipframe.setVisible(true);

}
public void charaui(){
								frame1.setVisible(false);
								charaframe=new JFrame();
								charaframe.setLayout(new GridLayout(3,1));
								functions2 = new JPanel();
								LablePanel2 = new JPanel();
								Buttonarea2= new JPanel();
								Buttonarea2.setLayout(new GridLayout(5,4));
								JLabel userLabel = new JLabel("This is the page for Character Data ");
								userLabel.setFont(new   java.awt.Font("Dialog",   0,   20));
								userLabel.setBounds(10,20,80,25);
								LablePanel2.add(userLabel);
								LablePanel2.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

								chacode  = new JLabel("CHARACTER_CODE");

								chal = new JLabel("CHARACTER_LNAME");
								chaf = new JLabel("CHARACTER_FNAME");
								charj = new JLabel("CHARACTER_JOB");
								chad = new JLabel("CHARACTER_DOB");
								charc = new JLabel("CHARACTER_COUNTRY");
								chah = new JLabel("CHARACTER_HEIGHT");
								chaw = new JLabel("CHARACTER_WEIGHT");
								chat = new JLabel("CHARACTER_TEAM");

								clarea= new JTextArea("",10,2);
								cjarea= new JTextArea("",10,2);
								cfarea= new JTextArea("",10,2);
								cdarea= new JTextArea("",10,2);
								ccarea= new JTextArea("",10,2);
								charea= new JTextArea("",10,2);
								cwarea= new JTextArea("",10,2);
								ctarea= new JTextArea("",10,2);
								ccodearea= new JTextArea("",10,2);


								Buttonarea2.add(chacode);
								Buttonarea2.add(ccodearea);
								Buttonarea2.add(chal);
								Buttonarea2.add(clarea);
								Buttonarea2.add(chaf);
								Buttonarea2.add(cfarea);
								Buttonarea2.add(charj);
								Buttonarea2.add(cjarea);
								Buttonarea2.add(chad);
								Buttonarea2.add(cdarea);
								Buttonarea2.add(charc);
								Buttonarea2.add(ccarea);
								Buttonarea2.add(chah);
								Buttonarea2.add(charea);
								Buttonarea2.add(chaw);
								Buttonarea2.add(cwarea);
								Buttonarea2.add(chat);
								Buttonarea2.add(ctarea);


								information2 = new JTextArea("",60,20);
								JScrollPane scroll3 = new JScrollPane(information2);
								scroll3.setHorizontalScrollBarPolicy(
																JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
								scroll3.setVerticalScrollBarPolicy(
																JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
								OutputStream textAreaStream = new OutputStream() {
																public void write(int b) throws IOException {
																								information2.append(String.valueOf((char)b));
																}

																public void write(byte b[]) throws IOException {
																								information2.append(new String(b));
																}

																public void write(byte b[], int off, int len) throws IOException {
																								information2.append(new String(b, off, len));
																}
								};
								PrintStream myOut = new PrintStream(textAreaStream);
								System.setOut(myOut);
								System.setErr(myOut);
								ssearch2 = new JButton("Search");
								ssearch2.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {
																																if (e.getSource() == ssearch2) {


																																								String cl = clarea.getText();
																																								String cf = cfarea.getText();
																																								String cj = cjarea.getText();
																																								String cd = cdarea.getText();
																																								String cc = ccarea.getText();
																																								String ch = charea.getText();
																																								String cw = cwarea.getText();
																																								String ct = ctarea.getText();

																																								searchfunction a = new searchfunction();
																																								a.searchcha(cl,cf,cj,cd,cc,ch,cw,ct);



																																}
																								}
																});
								add2 = new JButton("Add");
								add2.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {
																																if (e.getSource() == add2) {
																																								String cl = clarea.getText();
																																								String cf = cfarea.getText();
																																								String cj = cjarea.getText();
																																								String cd = cdarea.getText();
																																								String cc = ccarea.getText();
																																								String ch = charea.getText();
																																								String cw = cwarea.getText();
																																								String ct = ctarea.getText();
																																								String code = ccodearea.getText();
																																								addfunction a = new addfunction();
																																								a.addchara(code,cl,cf,cj,cd,cc,ch,cw,ct);



																																}
																								}
																});
								ddelete2 = new JButton("Delete(PROVIDE CODE ONLY)");
								ddelete2.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {
																																if (e.getSource() == ddelete2) {

																																								String code = ccodearea.getText();
																																								deletefunction a = new deletefunction();
																																								a.deletecha(code);



																																}
																								}
																});
								backk2=new JButton("Back");
								backk2.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {
																																if (e.getSource() == backk2) {
																																								charaframe.setVisible(false);
																																								frame1.setVisible(true);



																																}
																								}
																});
								mmodify2=new JButton("(USE OLD NUMBER AND NEW DATA)");
								mmodify2.addActionListener(new ActionListener(){
																								public void actionPerformed(ActionEvent e) {
																																if (e.getSource() == mmodify2) {
																																								String cl = clarea.getText();
																																								String cf = cfarea.getText();
																																								String cj = cjarea.getText();
																																								String cd = cdarea.getText();
																																								String cc = ccarea.getText();
																																								String ch = charea.getText();
																																								String cw = cwarea.getText();
																																								String ct = ctarea.getText();
																																								String code = ccodearea.getText();
																																								modifyfunction a = new modifyfunction();
																																								a.modifycha(code,cl,cf,cj,cd,cc,ch,cw,ct);


																																}
																								}
																});
								charaframe.setLayout(new GridLayout(4,1));
								functions2.setLayout(new GridLayout(1,5));
								functions2.add(ssearch2);
								functions2.add(add2);
								functions2.add(ddelete2);
								functions2.add(mmodify2);
								functions2.add(backk2);
								charaframe.setSize(900,700);
								charaframe.setLocation(200,200);
								charaframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								charaframe.setVisible(true);
								charaframe.add(LablePanel2);
								charaframe.add(Buttonarea2);
								charaframe.add(scroll3);
								charaframe.add(functions2);
								charaframe.setVisible(true);
}



}
