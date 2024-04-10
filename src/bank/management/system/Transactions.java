package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener{

	JButton b1 , b2 , b3 , b4 , b5, b6 , b7;
	  String pinnumber;
  public Transactions(String pinnumber) {
	  this.pinnumber = pinnumber;
	  
	  
	  setLayout(null);
	  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900 , 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0 , 0 , 900 , 900);
		add(image);
		
		JLabel text = new JLabel("Please select your Transaction");
		text.setBounds(220 , 300 , 700 , 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,16));
		image.add(text);
		
		b1 = new JButton("Deposit");
		b1.setBounds(170 ,415 , 150 , 30);
		add(b1);
		b1.addActionListener(this);
		
		
		b2 = new JButton("Cash Withdraw");
		b2.setBounds(355 ,415 , 150 , 30);
		add(b2);
		b2.addActionListener(this);
		
		
		b3 = new JButton("Fast Cash");
		b3.setBounds(170 ,450 , 150 , 30);
		add(b3);
		b3.addActionListener(this);
		
		
		b4 = new JButton("Mini Statement");
		b4.setBounds(355 ,450 , 150 , 30);
		add(b4);
		b4.addActionListener(this);
		
		
		b5 = new JButton("Pin Change");
		b5.setBounds(170 ,485 , 150 , 30);
		add(b5);
		b5.addActionListener(this);
		
		
		b6 = new JButton("Balance Enquiry");
		b6.setBounds(355 ,485 , 150 , 30);
		add(b6);
		b6.addActionListener(this);
		
		
		b7 = new JButton("Exit");
		b7.setBounds(355 ,520 , 150 , 30);
		add(b7);
		b7.addActionListener(this);
		
		
	  
	  
	  
	  setUndecorated(true);
	  setVisible(true);
	  setSize(900 , 900); 
	  setLocation(300 ,0);
		
		
		
  }
  public void actionPerformed(ActionEvent ae) {
	  if(ae.getSource() == b1) {
		  setVisible(false);
		  new Deposit(pinnumber).setVisible(true);
	  }
	  else if(ae.getSource() == b2) {
		  setVisible(false);
		  new Withdrawl(pinnumber).setVisible(true);  
	  }
	  else  if(ae.getSource() == b3) {
		  setVisible(false);
		  new FastCash(pinnumber).setVisible(true);  
	  }
	  else if(ae.getSource() == b4) {
		 
		  new MiniStatement(pinnumber).setVisible(true);
	  }
	  else if(ae.getSource() == b5) {
		  setVisible(false);
		  new ChangePin(pinnumber).setVisible(true);
	  }
	  else if(ae.getSource() == b6) {
		  setVisible(false);
		  new BalanceEnquiry(pinnumber).setVisible(true);
	  }
	  
	  else  if(ae.getSource() == b7) {
		  setVisible(false);
		  System.exit(0);
	  }
	  
  }
  
  public static void main(String args[]) {
	  new Transactions("");
  }
}
