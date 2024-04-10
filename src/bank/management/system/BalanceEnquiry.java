package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;

public class BalanceEnquiry extends JFrame implements ActionListener {
 JButton back;
 String pinnumber;
 
	public BalanceEnquiry(String pinnumber){
          this.pinnumber = pinnumber;
        
         int balance =0;
		setLayout(null);
		  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
			Image i2 = i1.getImage().getScaledInstance(900 , 900, Image.SCALE_DEFAULT);
			ImageIcon i3 = new ImageIcon(i2);
			JLabel image = new JLabel(i3);
			image.setBounds(0 , 0 , 900 , 900);
			add(image);
			
			
			back = new JButton("BACK");
			 back.setBounds(355,520,150 , 30);
			 image.add(back);
			 back.addActionListener(this);
			 
			  Conn c = new Conn();
			  
			  try {
				 ResultSet rs = c.s.executeQuery("select * from bank where pin= '"+pinnumber+"'"); 
			      
			      while(rs.next()) {
			    	  if(rs.getString("type").equals("Deposit")) {
			    		  balance+=Integer.parseInt(rs.getString("amount"));
			    	  }else {
			    		  balance -= Integer.parseInt(rs.getString("amount"));
			    	  }
			      }
			  }
			  catch(Exception e) {
				  System.out.println(e);
			  }
			  
			  JLabel amount = new JLabel("Your Current balance is " + balance);
			  amount.setForeground(Color.WHITE);
			  amount.setBounds(170 , 300 , 400 ,30);
			  image.add(amount);
			
			 setVisible(true);
			  setSize(900 , 900); 
			  setLocation(300 ,0);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		
	}
	public static void main(String args[]) {
		new BalanceEnquiry("").setVisible(true);
	}
	 
	

}
