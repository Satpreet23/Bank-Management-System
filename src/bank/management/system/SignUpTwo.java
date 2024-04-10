package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class SignUpTwo extends JFrame implements ActionListener{
	
	JTextField pan , Aadhar ;
	JButton next;
	JRadioButton syes , sno,eyes ,eno;
    JComboBox religion , category,Income,education,occupation;
    String formno;
	
	public SignUpTwo(String formno){  // Constructor
		this.formno =formno;
		setLayout(null);
		setTitle("NEW ACCOUNT APPLICATION FROM-PAGE 2");
		
		 
		
		
		JLabel AdditionD = new JLabel("Page 2 : Additional Details");
		AdditionD .setFont(new Font("Raleway" , Font.BOLD , 20));
		AdditionD .setBounds(300 , 90 , 300 ,30);
		add(AdditionD );
		
		// Religion
		
		JLabel rel = new JLabel("Religion:");
		rel.setFont(new Font("Raleway", Font.BOLD , 20));
		rel.setBounds(120 , 160 , 150 , 30);
		add(rel);
		
		String valReligion[] = {"Hindu","Muslim","Sikh", "Christian","Other"};
		 religion = new JComboBox(valReligion);
		religion.setBounds(350 , 160 , 350 , 30);
		add(religion);
		religion.setBackground(Color.WHITE);
		
		
		
		 // category
		JLabel cat = new JLabel("Category:");
		cat.setFont(new Font("Raleway" , Font.BOLD , 20));
		cat.setBounds(120 , 210 , 150 , 30);
		add(cat);
		
		String valcategory[] = {"General","OBC","SC", "ST","EWS"};
		 category = new JComboBox(valcategory);
		category.setBounds(350 , 210 , 350 , 30);
		add(category);
		religion.setBackground(Color.WHITE);
		
		
		// Income
		JLabel income = new JLabel("Income:");
		income.setFont(new Font("Raleway" , Font.BOLD , 20));
		income.setBounds(120 , 264 , 150 , 20);
		add(income);
		
		String valincome[] = {"Null","<1,50,000","<2,50,000", "<5,00,000","Upto 10,00,000"};
		 Income = new JComboBox(valincome);
	     Income.setBounds( 350 , 260 , 350 ,30);
		add(Income);
		Income.setBackground(Color.WHITE);
		
		
		
		// Education Qualification
		
		JLabel Edu = new JLabel("Educational");
		Edu.setFont(new Font("Raleway" , Font.BOLD , 20));
		Edu.setBounds(120 , 310 , 150 , 30);
		add(Edu);
		
		
		JLabel Qual = new JLabel("Qualification:");
		Qual.setFont(new Font("Raleway" , Font.BOLD , 20));
		Qual.setBounds(120 , 335 , 150 , 20);
		add(Qual);
	
		String Education[] = {"Non-Graduate","Graduate","Post-Graduate", "Doctrate","Others"};
		 education = new JComboBox(Education);
	     education.setBounds( 350 , 320 , 350 ,30);
		add(education);
		education.setBackground(Color.WHITE);
		
		
		
		// Occupation
		JLabel Occ= new JLabel("Occupation:");
		Occ.setFont(new Font("Raleway" , Font.BOLD , 20));
		Occ.setBounds(120 , 390 , 150 , 30);
		add(Occ);
		
		String valOccupation[] = {"Salaried","Self-Employee","Business", "Student","Retired","Other"};
		 occupation = new JComboBox(valOccupation);
		occupation.setBounds( 350 , 390 , 350 ,30);
		add(occupation);
		occupation.setBackground(Color.WHITE);
		
		
		// PAN
		JLabel PAN = new JLabel("PAN Number:");
		PAN.setFont(new Font("Raleway" , Font.BOLD , 20));
		PAN.setBounds(120 , 455 , 150 , 20);
		add(PAN);
		
		 pan = new JTextField();
		pan.setFont(new Font("Raleway" , Font.BOLD , 14));
		pan.setBounds(350 , 455 , 350 , 30);
		add(pan);
		 
		// Aadhar
		JLabel aadhar = new JLabel("Aadhar Number:");
		aadhar.setFont(new Font("Raleway" , Font.BOLD , 20));
		aadhar.setBounds(120 , 500 , 200 , 30);
		add(aadhar);
		
		 Aadhar = new JTextField();
		 Aadhar.setFont(new Font("Raleway" , Font.BOLD , 14));
		 Aadhar.setBounds(350 , 500, 350 , 30);
		add(Aadhar);
		
		// SENIOR CITIZEN
		JLabel SC = new JLabel("Senior Citizen:");
		SC.setFont(new Font("Raleway" , Font.BOLD , 20));
		SC.setBounds(120 , 560 , 150 , 20);
		add(SC);
		
		 syes = new JRadioButton("Yes");
		syes.setBounds(350 , 555 , 100 , 30);
		syes.setBackground(Color.WHITE);
		add(syes);

		 sno = new JRadioButton("No");
		sno.setBounds(520 , 555 , 100 , 30);
		sno.setBackground(Color.WHITE);
		add(sno);
		
		ButtonGroup sc = new ButtonGroup();
		sc.add(syes);
		sc.add(sno);
		
		
		 
		//Existing Account
		JLabel EA = new JLabel("Existing Account:");
		EA.setFont(new Font("Raleway" , Font.BOLD , 20));
		EA.setBounds(120 , 610 , 200 , 30);
		add(EA);
		
		 eyes = new JRadioButton("Yes");
			eyes.setBounds(350 , 610 , 100 , 30);
			eyes.setBackground(Color.WHITE);
			add(eyes);

			 eno = new JRadioButton("No");
			eno.setBounds(520 , 610 , 100 , 30);
			eno.setBackground(Color.WHITE);
			add(eno);
			
			ButtonGroup ea = new ButtonGroup();
           ea.add(eyes);
			ea.add(eno);
		
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
	
		 String sreligion = (String)religion.getSelectedItem();
		 String scategory = (String)category.getSelectedItem();
		 String sincome = (String)Income.getSelectedItem();
		 String sedu = (String)education.getSelectedItem();
		 String sOccu = (String)occupation.getSelectedItem();
		 String sPAN = pan.getText();
		 String sAD = Aadhar.getText();
		 
		 String Senior = "";
		 if(syes.isSelected()) {
			 Senior = "Yes";
		 }
		 else if (sno.isSelected()){
			 Senior = "NO";
		 }
		
		
		 String Existing = null;
		 if(eyes.isSelected()) {
			 Existing = "Yes";
		 }
		 else if (eno.isSelected()){
			 Existing = "No";
		 }
			 
		
		 try {
			 if(sreligion.equals("")) {
				 JOptionPane.showMessageDialog(null,"Religion is Required" );
			 }
			
			 else  if(scategory.equals("")) {
				 JOptionPane.showMessageDialog(null,"Category is Required" );
			 }
			 else if(sincome.equals("")) {
				 JOptionPane.showMessageDialog(null,"Income is Required" );
			 }
			 else  if(sedu.equals("")) {
				 JOptionPane.showMessageDialog(null,"Education is Required" );
			 }
			 else if(sOccu.equals("")) {
				 JOptionPane.showMessageDialog(null,"Occupation is Required" );
			 }
			 else if(sPAN.equals("")) {
				 JOptionPane.showMessageDialog(null,"PAN  is Required" );
			 }
			 else if(sAD.equals("")) {
				 JOptionPane.showMessageDialog(null,"Aadhar is Required" );
			 }
			 else if(Senior.equals("")) {
				 JOptionPane.showMessageDialog(null,"This field cannot be blank" );
			 }
			 else  if(Existing.equals("")) {
				 JOptionPane.showMessageDialog(null,"This field cannot be blank" );
			 }
			
			 else {
				 Conn c = new Conn();
				 
				String query = "insert into signupTwo values ( '"+formno+"','"+sreligion+"' , '"+scategory+"' , '"+sincome+"' , '"+sedu+"' , '"+sOccu+"' , '"+sPAN+"' , '"+sAD+"' , '"+Senior+"' , '"+Existing+"' )";
			     c.s.executeUpdate(query);
			     
			     setVisible(false);
			     new SignUpThree(formno).setVisible(true);
			 
			 }
			
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 
	 }
	
 public static void main(String args[]) {
	 new SignUpTwo("");
		
	}
}