package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

public class ChangePin extends JFrame implements ActionListener{
  JPasswordField pin , repin;
  JButton change , back;
	String pinnumber ;
	ChangePin(String pinnumber){
		this.pinnumber = pinnumber;
		System.out.println(pinnumber);
		
		setLayout(null);
		  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
			Image i2 = i1.getImage().getScaledInstance(900 , 900, Image.SCALE_DEFAULT);
			ImageIcon i3 = new ImageIcon(i2);
			JLabel image = new JLabel(i3);
			image.setBounds(0 , 0 , 900 , 900);
			add(image);
			
			JLabel text = new JLabel("CHANGE YOUR PIN");
			text.setBounds(250 , 280 , 500 , 35);
			text.setForeground(Color.WHITE);
			text.setFont(new Font("System",Font.BOLD,16));
			image.add(text);
			 
			
			JLabel pintext = new JLabel("New PIN");
			pintext.setBounds(165 , 320 , 180 , 35);
			pintext.setForeground(Color.WHITE);
			pintext.setFont(new Font("System",Font.BOLD,16));
			image.add(pintext);
			
		     pin  = new JPasswordField();
			 pin.setFont(new Font("Raleway" , Font.BOLD , 30));
		     pin.setBounds(330 , 320 , 180 , 30);
			 image.add(pin);
				
				
	     	JLabel repintext = new JLabel("Re-Enter New PIN");
			repintext.setBounds(165 , 360 ,180 , 35);
			repintext.setForeground(Color.WHITE);
			repintext.setFont(new Font("System",Font.BOLD,16));
			image.add(repintext);
			 
			 repin  = new JPasswordField();
			 repin.setFont(new Font("Raleway" , Font.BOLD , 30));
		     repin.setBounds(330 , 360 , 180 , 30);
			 image.add(repin);
			 
			 change = new JButton("CHANGE");
			 change.setBounds(355,485,150 , 30);
			 image.add(change);
			 change.addActionListener(this);
			 
			 back = new JButton("BACK");
			 back.setBounds(355,520,150 , 30);
			 image.add(back);
			 back.addActionListener(this);
			 
			 
			 setVisible(true);
			  setSize(900 , 900); 
			  setLocation(300 ,0);
				
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== change) {
			try {
				String npin = pin.getText();
				System.out.println(npin);
				String rpin = repin.getText();
				
				if(!npin.equals(rpin)) {
					JOptionPane.showMessageDialog(null, "Entered PIN does not match with");
					return;
				  }
				if(npin.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter PIN");
					return;
				}
				if(rpin.equals("")) {
					JOptionPane.showMessageDialog(null, "Please re-enter PIN");
					return;
				}
				
				Conn c= new Conn();
				String query1 = ("update bank set pin='"+npin+"' where pin='"+pinnumber+"'") ;
				String query2 = ("update login set pin='"+npin+"' where pin='"+pinnumber+"'") ;
				String query3 = ("update signupThree set Pin_Number='"+npin+"' where Pin_Number='"+pinnumber+"'") ;
			     
				c.s.executeUpdate(query1);
				c.s.executeUpdate(query2);
				c.s.executeUpdate(query3);
				
				JOptionPane.showMessageDialog(null, "PIN changed successfully");
			  setVisible(false);
			  new Transactions(rpin).setVisible(true);;
			}
			
			catch(Exception e) {
				System.out.println(e);
			}
		}
		else if(ae.getSource()== back) {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
	}
	public static void main(String[] args) {
		new ChangePin("");

	}

}
