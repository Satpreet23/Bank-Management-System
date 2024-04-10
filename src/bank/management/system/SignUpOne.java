package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import com.toedter.calendar.*;

public class SignUpOne extends JFrame implements ActionListener{
	long random;
	JTextField nameTextField,fatherTextField ,addTextField,pinTextField ,emailTextField,cityTextField,stateTextField;
	JButton next;
	JRadioButton male ,female,married ,other, unmarried;
	JDateChooser dateChooser;
	
	
	SignUpOne(){  // Constructor
		setLayout(null);
		Random ran = new Random();
		 random = Math.abs((ran.nextLong()%9000L )+ 1000L);
		 
		// FORM NO.
		JLabel formno = new JLabel("APPLICATION FORM NO." + random );
		formno.setFont(new Font("Raleway" , Font.BOLD , 38));
		formno.setBounds(140 , 30 , 650 ,40);
		add(formno);
		
		JLabel PersonalDetails = new JLabel("Page 1 : Personal Details");
		PersonalDetails.setFont(new Font("Raleway" , Font.BOLD , 20));
		PersonalDetails.setBounds(300 , 90 , 300 ,30);
		add(PersonalDetails);
		
		// NAME
		
		JLabel name = new JLabel("Name:");
		name.setFont(new Font("Raleway", Font.BOLD , 20));
		name.setBounds(120 , 160 , 150 , 20);
		add(name);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
		nameTextField.setBounds(350 , 160 , 350 , 30);
		add(nameTextField);
		
		 // FATHER NAME
		JLabel father = new JLabel("Father's Name:");
		father.setFont(new Font("Raleway" , Font.BOLD , 20));
		father.setBounds(120 , 210 , 150 , 20);
		add(father);
		
		 fatherTextField = new JTextField();
		fatherTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
		fatherTextField.setBounds(350 , 210 , 350 , 30);
		add(fatherTextField);
		
		
		// DOB
		JLabel dob = new JLabel("Date of Birth:");
		dob.setFont(new Font("Raleway" , Font.BOLD , 20));
		dob.setBounds(120 , 260 , 150 , 20);
		add(dob);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds( 350 , 260 , 350 ,30);
		dateChooser.setForeground(new Color(105,105,105));
		add(dateChooser);
		
		// GENDER
		
		JLabel gender = new JLabel("Gender:");
		gender.setFont(new Font("Raleway" , Font.BOLD , 20));
		gender.setBounds(120 , 310 , 150 , 20);
		add(gender);
		
		 male = new JRadioButton("Male");
		male.setBounds(350 , 310 ,100 ,30);
		male.setBackground(Color.WHITE);
		add(male);
		
	    female = new JRadioButton("Female");
		female.setBounds(490 , 310 , 100 ,30);
		female.setBackground(Color.WHITE);
		add(female);
		
		ButtonGroup gendergroup = new ButtonGroup();
		gendergroup.add(female);
		gendergroup.add(male);
		
		// EMAIL
		
		
		JLabel email = new JLabel("Email Address:");
		email.setFont(new Font("Raleway" , Font.BOLD , 20));
		email.setBounds(120 , 360 , 150 , 20);
		add(email);
		
		 emailTextField = new JTextField();
		emailTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
		emailTextField.setBounds(350 , 360 , 350 , 30);
		add(emailTextField);
		
		// MARITAL STATUS
		JLabel marital = new JLabel("Marital Status:");
		marital.setFont(new Font("Raleway" , Font.BOLD , 20));
		marital.setBounds(120 , 410 , 150 , 20);
		add(marital);
		
		 married = new JRadioButton("Married");
		married.setBounds(350 , 410 ,70 ,30);
		married.setBackground(Color.WHITE);
		add(married);
		
		 unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(460 , 410 , 100 ,30);
		unmarried.setBackground(Color.WHITE);
		add(unmarried);
		
		 other = new JRadioButton("Other");
		other.setBounds(580 , 410 , 100 ,30);
		other.setBackground(Color.WHITE);
		add(other);
		
		ButtonGroup marrygroup = new ButtonGroup();
		marrygroup.add(unmarried);
		marrygroup.add(married);
		marrygroup.add(other);
		
		// ADDRESS
		JLabel add = new JLabel("Address:");
		add.setFont(new Font("Raleway" , Font.BOLD , 20));
		add.setBounds(120 , 460 , 150 , 20);
		add(add);
		
		 addTextField = new JTextField();
		addTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
		addTextField.setBounds(350 , 460 , 350 , 30);
		add(addTextField);
		 
		// CITY
		JLabel city = new JLabel("City:");
		city.setFont(new Font("Raleway" , Font.BOLD , 20));
		city.setBounds(120 , 510 , 150 , 30);
		add(city);
		
		 cityTextField = new JTextField();
		cityTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
		cityTextField.setBounds(350 , 510 , 350 , 30);
		add(cityTextField);
		
		// STATE
		JLabel state = new JLabel("State:");
		state.setFont(new Font("Raleway" , Font.BOLD , 20));
		state.setBounds(120 , 560 , 150 , 20);
		add(state);
		
		 stateTextField = new JTextField();
		stateTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
		stateTextField.setBounds(350 , 560 , 350 , 30);
		add(stateTextField);
		 
		//PIN
		JLabel pin = new JLabel("Pin Code:");
		pin.setFont(new Font("Raleway" , Font.BOLD , 20));
		pin.setBounds(120 , 610 , 150 , 20);
		add(pin);
		
		 pinTextField = new JTextField();
		pinTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
		pinTextField.setBounds(350 , 610 , 350 , 30);
		add(pinTextField);
		
		 next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		 next.setFont(new Font("Raleway" , Font.BOLD , 18));
		next.setBounds(620 , 680 , 80,30);
		next.addActionListener(this);
		add(next);
		
		
		setSize(850 , 800);  // to set size
		setLocation(350,10);  // to set location
		setVisible(true);   // make the frame visible
		getContentPane().setBackground(Color.white);
		
		
		
	}
	 public void actionPerformed(ActionEvent  ae) {
		 String formno = "" + random;
		 String name = nameTextField.getText();
		 String fname = fatherTextField.getText();
		 String dob = ((JTextField ) dateChooser.getDateEditor().getUiComponent()).getText();
		 String gender = null;
		 if(male.isSelected()) {
			 gender = "Male";
		 }
		 else if (female.isSelected()){
			 gender = "Female";
		 }
		 else {
			 gender ="Other";
		 }
		 String email = emailTextField.getText();
		 String marital = null;
		 if(married.isSelected()) {
			 marital = "Married";
		 }
		 else if (unmarried.isSelected()){
			 marital ="Unmaaried";
		 }
		 else {
			 marital ="Other";
		 }
		 String address = addTextField.getText();
		 String city = cityTextField.getText();
		 String state = stateTextField.getText();
		 String pin = pinTextField.getText();
		 
		 try {
			 if(name.equals("")) {
				 JOptionPane.showMessageDialog(null,"Name is Required" );
			 }
			 else  if(fname.equals("")) {
				 JOptionPane.showMessageDialog(null,"Father Name is Required" );
			 }
			 else if(dob.equals("")) {
				 JOptionPane.showMessageDialog(null,"DOB is Required" );
			 }
			 else  if(gender.equals("")) {
				 JOptionPane.showMessageDialog(null,"gender is Required" );
			 }
			 else if(email.equals("")) {
				 JOptionPane.showMessageDialog(null,"email is Required" );
			 }
			 else if(marital.equals("")) {
				 JOptionPane.showMessageDialog(null,"Marital Status is Required" );
			 }
			 else if(address.equals("")) {
				 JOptionPane.showMessageDialog(null,"Address is Required" );
			 }
			 else if(city.equals("")) {
				 JOptionPane.showMessageDialog(null,"City is Required" );
			 }
			 else  if(state.equals("")) {
				 JOptionPane.showMessageDialog(null,"State is Required" );
			 }
			 else  if(pin.equals("")) {
				 JOptionPane.showMessageDialog(null,"Pin is Required" );
			 }
			 else {
				 Conn c = new Conn();
				 String query = "insert into signup values ( '"+formno+"' , '"+name+"' , '"+fname+"' , '"+dob+"' , '"+gender+"' , '"+email+"' , '"+marital+"' , '"+address+"' , '"+city+"' , '"+state+"' , '"+pin+"')";
			     c.s.executeUpdate(query);
			     
			     setVisible(false);
			     new SignUpTwo(formno).setVisible(true);
			 
			 }
			
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 
	 }
	
 public static void main(String args[]) {
	 new SignUpOne();
		
	}
}