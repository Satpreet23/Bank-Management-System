package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
	 JButton login , clear , signup;
	 JTextField cardtextfield ;
	 JPasswordField pintextfield;
	 
	login(){                     // constructor of login class
		setTitle("AUTOMATED TELLER MACHINE");
	    setLayout(null);    // so that we can get layout according to us for every component
		
		// to add image of atm
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
		Image i2 = i1.getImage().getScaledInstance(100 , 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(70 , 10 , 100 , 100);
		add(label);
		 
		JLabel text = new JLabel("WELCOME TO ATM");       // text for label
		text.setFont(new Font("Osward" , Font.BOLD , 38));  // font of label
		text.setBounds(200 ,40 , 400, 40);                    // layout of label
		add(text);
		
		JLabel card = new JLabel("Card No:");
		card.setFont(new Font("Osward" , Font.BOLD , 20));   
		card.setBounds(150 ,150 , 150, 40);
		add(card);
		
		 cardtextfield = new JTextField();    // to take input from the user
		cardtextfield.setFont(new Font("Arial" , Font.BOLD , 30));
		 cardtextfield.setBounds(300 , 150 , 250 , 40);
		add(cardtextfield);
		
		
		JLabel pin = new JLabel("PIN:");
		pin.setFont(new Font("Osward" , Font.BOLD , 20));
		pin.setBounds(150 ,220 , 250, 40);
		add(pin);
		
		pintextfield= new JPasswordField();
		cardtextfield.setFont(new Font("Arial" , Font.BOLD , 30));
		pintextfield.setBounds(300 , 220 , 250 , 40);
		add(pintextfield);
		
	    login = new JButton("SIGN IN");
	   login.setBounds( 300 , 300, 100 ,50);
	   login.setBackground(Color.black);
	   login.setForeground(Color.white);
	   login.addActionListener(this);
	   add(login);
	   
	    clear = new JButton("CLEAR");
	   clear.setBounds( 450 , 300, 100 ,50);
	   clear.setBackground(Color.black);
	   clear.setForeground(Color.white);
	   clear.addActionListener(this);
	   add(clear);
	   
	    signup = new JButton("SIGN UP");
	   signup.setBounds( 300 , 380, 250 ,50);
	   signup.setBackground(Color.black);
	   signup.setForeground(Color.white);
	   signup.addActionListener(this);
	   add(signup);
		
		
		getContentPane().setBackground(Color.white);    // to change the color of background
		
		
		setSize(800 , 480);         //  set dimension of frame length=800,width=400
		setVisible(true);          // to make the frame visible
		setLocation(350 , 200);      // set the opening location of frame on the deskstop
	}
	
 public void actionPerformed(ActionEvent  ae) {
	 // button par click karne ke baad kya hoga
	 if(ae.getSource() == clear) {
		 cardtextfield.setText("");
		 pintextfield.setText("");
	 }
	 else if( ae.getSource() == login) {
		 Conn c = new Conn();
		 String CN= cardtextfield.getText();
		 String PN = pintextfield.getText(); // cut because password is not test field its password field
         String query = "select * from login where cardnumber ='"+CN+"' and pin ='"+PN+"'";
		 
         try {
        	ResultSet rs = c.s.executeQuery(query);
        	if(rs.next()) {
        		setVisible(false);
           	 new Transactions(PN).setVisible(true);;
        	}
        	else {
        		JOptionPane.showMessageDialog(null , "Incorrect Card Number or Pin");
        		 cardtextfield.setText("");
        		 pintextfield.setText("");
        	}
         }
         catch(Exception e) {
        	 System.out.println(e);
         }
		 	 
		 
	 }
	 else if(ae.getSource() == signup) {
		 setVisible(false);
		 new SignUpOne().setVisible(true);;
	 }
 }
	public static void main(String[] args) {
         new login();
          

	}

}

