import java.awt.*;
import javax.swing.*;
public class gui extends JFrame {
JPanel ButtonPanel,LablePanel;
JButton jb1,jb2;



public gui() {
								ButtonPanel = new JPanel();
								LablePanel = new JPanel();

								JLabel userLabel = new JLabel("Welcome to the Database of the Game: Rainbox 6:Siege ");
								userLabel.setBounds(10,20,80,25);
								LablePanel.add(userLabel);


								jb1 = new JButton("Search");
								jb2 = new JButton("Modify");
								ButtonPanel.add(jb1);
								ButtonPanel.add(jb2);




								this.setLayout(new BorderLayout());
								this.setSize(700,500);
								this.setLocation(200,200);
								this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								this.setVisible(true);
								this.add(ButtonPanel,"South");
								this.add(LablePanel,"North");
}
}
