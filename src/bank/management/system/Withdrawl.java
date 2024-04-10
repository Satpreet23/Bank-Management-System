package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.*;

public class Withdrawl extends JFrame implements ActionListener{
	
	JTextField amount;
	JButton withdraw ,back;
	String pinnumber ;
	
   Withdrawl(String pinnumber){
	  this.pinnumber = pinnumber;
	  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900 , 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0 , 0 , 900 , 900);
		add(image);
		
		JLabel text = new JLabel("Enter the amount you want to withdraw");
		text.setFont(new Font("System", Font.BOLD , 16));
		text.setForeground(Color.WHITE);
		text.setBounds(180 , 300,400,20);
		image.add(text);
		
	    amount = new JTextField();
	    amount.setFont(new Font("Raleway" , Font.BOLD , 30));
		amount.setBounds(170 , 350 , 320 , 30);
		image.add(amount);
		
		withdraw = new JButton("Withdraw");
		withdraw.setBounds(355 , 455 , 150 , 30);
		image.add(withdraw);
		withdraw.addActionListener(this);
	
		back = new JButton("Back");
		back.setBounds(355 , 490 , 150 , 30);
		image.add(back);
		back.addActionListener(this);
		
	  setSize(900 , 900);
	  setLocation(300 , 0);
	  setVisible(true);
}

public void actionPerformed(ActionEvent ae) {
	  if(ae.getSource()== withdraw) {
		  String number = amount.getText();
		  Date date = new Date();
		  if(number.equals("")) {
			  JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
		  }
		  else {
			  try {
				  Conn c = new Conn();
				  ResultSet rs = c.s.executeQuery("select * from bank where pin= '"+pinnumber+"'"); 
			      int balance=0;
			      while(rs.next()) {
			    	  if(rs.getString("type").equals("Deposit")) {
			    		  balance+=Integer.parseInt(rs.getString("amount"));
			    	  }else {
			    		  balance -= Integer.parseInt(rs.getString("amount"));
			    	  }
			      }
			  if( balance < Integer.parseInt(number) ) {
				  JOptionPane.showMessageDialog(null, "Insufficient Balance");
			  }
			  else {
			 
			  String query = "insert into bank values('"+pinnumber+"' ,'"+date+"', 'Withdrawl' ,'"+number+"')";
			  c.s.executeUpdate(query);
			    JOptionPane.showMessageDialog(null, "Rs." + number +" debited successfully");
			  }
			  setVisible(false);
			  new Transactions(pinnumber).setVisible(true);
			  }
		  
			  
			  
			  catch(Exception e) {
				  System.out.println(e);
			  }
	  }
	  }
	  else if(ae.getSource()== back) {
		  setVisible(false);
		new Transactions(pinnumber).setVisible(true);;
	  }
}
	  
	  
  
   
   
   public static void main(String args[]) {
	   new Withdrawl("");
   }
}
