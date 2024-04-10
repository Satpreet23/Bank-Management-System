package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.Date;
public class FastCash extends JFrame implements ActionListener{

	JButton b1 , b2 , b3 , b4 , b5, b6 , b7;
	  String pinnumber;
  public FastCash(String pinnumber) {
	  this.pinnumber = pinnumber;
	  System.out.println(pinnumber);
	  
	  setLayout(null);
	  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900 , 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0 , 0 , 900 , 900);
		add(image);
		 
		
		JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
		text.setBounds(220 , 300 , 700 , 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,16));
		image.add(text);
		
		b1 = new JButton("Rs.100");
		b1.setBounds(170 ,415 , 150 , 30);
		add(b1);
		b1.addActionListener(this);
		
		
		b2 = new JButton("Rs.500");
		b2.setBounds(355 ,415 , 150 , 30);
		add(b2);
		b2.addActionListener(this);
		
		
		b3 = new JButton("Rs.1000");
		b3.setBounds(170 ,450 , 150 , 30);
		add(b3);
		b3.addActionListener(this);
		
		
		b4 = new JButton("Rs.2000");
		b4.setBounds(355 ,450 , 150 , 30);
		add(b4);
		b4.addActionListener(this);
		
		
		b5 = new JButton("Rs.5000");
		b5.setBounds(170 ,485 , 150 , 30);
		add(b5);
		b5.addActionListener(this);
		
		
		b6 = new JButton("Rs.10000");
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
	 
	  if(ae.getSource() == b7) {
		  setVisible(false);
		  new Transactions(pinnumber).setVisible(true);
		  System.exit(0);
	  }
	  else {
		  String amount = ((JButton)ae.getSource()).getText().substring(3);
		  Conn c = new Conn();
		  try {
			 ResultSet rs = c.s.executeQuery("select * from bank where pin= '"+pinnumber+"'"); 
		      int balance=0;
		      while(rs.next()) {
		    	  if(rs.getString("type").equals("Deposit")) {
		    		  balance+=Integer.parseInt(rs.getString("amount"));
		    	  }else {
		    		  balance -= Integer.parseInt(rs.getString("amount"));
		    	  }
		      }
		  if(ae.getSource()!= b7 && balance < Integer.parseInt(amount) ) {
			  JOptionPane.showMessageDialog(null, "Insufficient Balance");
		  }
		  else {
		  Date date = new Date();
		  String query = "insert into bank values('"+pinnumber+"' ,'"+date+"', 'Withdrawl' ,'"+amount+"')";
		  c.s.executeUpdate(query);
		    JOptionPane.showMessageDialog(null, "Rs." + amount +" debited successfully");
		  }
		  setVisible(false);
		  new Transactions(pinnumber).setVisible(true);
		  }
		  catch(Exception e){
			  System.out.println(e);
		  }
	  }
	  
  }
  
  public static void main(String args[]) {
	  new Transactions("");
  }
}

