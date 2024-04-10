package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class SignUpThree  extends JFrame implements ActionListener  {
	JRadioButton SA , FD, CA , DA ;
	JCheckBox c1 , c2 ,c3,c4,c5,c6,c7;
	JButton submit , cancel;
     String formno;
	public SignUpThree(String formno) {
        this.formno = formno;
		setSize(850 , 800);  // to set size
		setLocation(350,10);  // to set location
		setVisible(true);   // make the frame visible
		getContentPane().setBackground(Color.white);
		
		
		setLayout(null);
		setTitle("NEW ACCOUNT APPLICATION FROM-PAGE 3");
		
		 
		
		
		JLabel details = new JLabel("Page 3 : Account Details");
		details .setFont(new Font("Raleway" , Font.BOLD , 20));
		details .setBounds(300 , 70 , 300 ,30);
		add(details );
		
		JLabel type = new JLabel("Account Type");
		type .setFont(new Font("Raleway" , Font.BOLD , 20));
		type .setBounds(120 ,150 , 300 ,40);
		add(type);
		
		 SA = new JRadioButton("Saving Account");
		 SA.setBounds(130 , 190 ,170 ,30);
		 SA.setBackground(Color.WHITE);
		 add(SA);
		 
		 FD = new JRadioButton("Fixed Deposit Account");
		 FD.setBounds(400 , 190 ,250 ,30);
		 FD.setBackground(Color.WHITE);
		 add(FD);
		 
		 CA = new JRadioButton("Current Account");		
		 CA.setBounds(130 , 220 ,150 ,30);
		 CA.setBackground(Color.WHITE);
		 add(CA);
		 
		 DA = new JRadioButton("Recurring Deposit Account");
		 DA.setBounds(400 , 220 ,200 ,30);
		 DA.setBackground(Color.WHITE);
		 add(DA);
		 
		 ButtonGroup acc = new ButtonGroup();
			acc.add(SA);
			acc.add(FD);
			acc.add(CA);
			acc.add(DA);
		 
			
			JLabel card = new JLabel("Card Number");
			card .setFont(new Font("Raleway" , Font.BOLD , 20));
			card.setBounds(120 ,290 , 200 ,30);
			add(card );
			
			JLabel ccard= new JLabel("Your 16 Digit Card Number");
			ccard .setFont(new Font("Raleway" , Font.BOLD , 10));
			ccard .setBounds(120 ,310 , 200 ,40);
			add(ccard);

			JLabel cardno = new JLabel("XXXX-XXXX-XXXX-3245");
			cardno .setFont(new Font("Raleway" , Font.BOLD , 20));
			cardno .setBounds(400 ,300 , 300 ,40);
			add(cardno);
			
			JLabel pin = new JLabel("PIN:");
			pin .setFont(new Font("Raleway" , Font.BOLD , 20));
			pin .setBounds(120 ,360 , 300 ,40);
			add(pin );
			
			JLabel cpin = new JLabel("Your 4 Digit Password");
			cpin .setFont(new Font("Raleway" , Font.BOLD , 10));
			cpin .setBounds(120 ,380 , 300 ,40);
			add(cpin );
			
			JLabel pinNO = new JLabel("XXXX");
			pinNO .setFont(new Font("Raleway" , Font.BOLD , 20));
			pinNO.setBounds(400 ,360 , 300 ,40);
			add(pinNO );
			
			
			JLabel ser = new JLabel("Services Required");
			ser.setFont(new Font("Raleway" , Font.BOLD , 20));
			ser .setBounds(120 ,440 , 300 ,40);
			add(ser );
			
			c1 = new JCheckBox("ATM Card");
			c1.setBackground(Color.WHITE);
			c1.setFont(new Font("Raleway" , Font.BOLD , 20));
			c1.setBounds(120 ,500 , 200 , 30);
			add(c1);
			
			c2 = new JCheckBox("Internet Banking");
			c2.setBackground(Color.WHITE);
			c2.setFont(new Font("Raleway" , Font.BOLD , 20));
			c2.setBounds(400 ,500 , 200 , 30);
			add(c2);
			
			
			
			c3 = new JCheckBox("Mobile Banking");
			c3.setBackground(Color.WHITE);
			c3.setFont(new Font("Raleway" , Font.BOLD , 20));
			c3.setBounds(120 ,550 , 200 , 30);
			add(c3);
			
			c4 = new JCheckBox("EMAIL & SMS Alerts");
			c4.setBackground(Color.WHITE);
			c4.setFont(new Font("Raleway" , Font.BOLD , 20));
			c4.setBounds(400 ,550 , 250 , 30);
			add(c4);
			
			c5 = new JCheckBox("Cheque Book");
			c5.setBackground(Color.WHITE);
			c5.setFont(new Font("Raleway" , Font.BOLD , 20));
			c5.setBounds(120 ,600 , 200 , 30);
			add(c5);
			
			c6 = new JCheckBox("E-Statement");
			c6.setBackground(Color.WHITE);
			c6.setFont(new Font("Raleway" , Font.BOLD , 20));
			c6.setBounds(400 ,600 , 200 , 30);
			add(c6);
			
			c7 = new JCheckBox("I hereby declare that all the details are correct to the best of my knowledge");
			c7.setBackground(Color.WHITE);
			c7.setFont(new Font("Raleway" , Font.BOLD , 10));
			c7.setBounds(120 ,660 , 550 , 30);
			add(c7);
			
			submit = new JButton("Submit");
			submit.setBackground(Color.BLACK);
			submit.setForeground(Color.WHITE);
			submit.setFont(new Font("Raleway" , Font.BOLD , 14));
			submit.setBounds(230 ,700 , 100 , 30);
			add(submit);
			submit.addActionListener(this);
			
			
			cancel = new JButton("Cancel");
			cancel.setBackground(Color.BLACK);
			cancel.setForeground(Color.WHITE);
			cancel.setFont(new Font("Raleway" , Font.BOLD , 14));
			cancel.setBounds(450 ,700 , 100 , 30);
			add(cancel);
			cancel.addActionListener(this);
			
					
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== submit) {
			String accountType =null;
			if(SA.isSelected()) {
				accountType ="Saving Account";
			}
			else if(FD.isSelected()) {
				accountType ="Fixed Deposit Account";
			}
			else if(CA.isSelected()) {
				accountType ="Current Account";
			}
			else if(DA.isSelected()) {
				accountType ="Recurring Deposit Account";
			}
			Random random = new Random();
			String cardnumber = "" +Math.abs((random.nextLong()%(90000000L) + 5040936000000000L));
			String pinnumber =   "" +Math.abs((random.nextLong()%(9000L) + 1000L));
			
			String facility ="";
			if(c1.isSelected()) {
				facility = facility +" ATM Card";
			}
			if(c2.isSelected()) {
				facility = facility +" Internet Banking";
			}
			if(c3.isSelected()) {
				facility = facility +" Mobile Banking";
			}
			if(c4.isSelected()) {
				facility = facility +" EMAIL & SMS Alert";
			}
			if(c5.isSelected()) {
				facility = facility +" Cheque Book";
			}
			if(c6.isSelected()) {
				facility = facility +" E-Statement";
			}
			
			try {
				if(accountType.equals("")) {
					 JOptionPane.showMessageDialog(null,"Account type is Required" );
				}
				else if(facility.equals("")) {
					 JOptionPane.showMessageDialog(null,"Facility cannot be blank" );
				}
				else {
				Conn c = new Conn();
				String query1 = "insert into signupThree values ( '"+formno+"', '"+accountType+"'  ,'"+cardnumber+"' , '"+pinnumber+"' , '"+facility+"')";
				String query2 = "insert into login values ( '"+formno+"', '"+cardnumber+"'  , '"+pinnumber+"' )";
				c.s.executeUpdate(query1);
				c.s.executeUpdate(query2);
				
				 JOptionPane.showMessageDialog(null,"Card Number: " + cardnumber +"\n Pin: "+ pinnumber );
				 setVisible(false);
				 
				 new Deposit(pinnumber).setVisible(true);;
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
		else if(ae.getSource()== cancel) {
			setVisible(false);
			new login().setVisible(true);
		}
	}
	public static void main(String args[]) {
		new SignUpThree("");
	}
	
	
}
