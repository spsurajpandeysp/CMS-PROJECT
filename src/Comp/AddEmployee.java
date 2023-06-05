package Comp;

import java.awt.Color;
import JDBC.JdbcConnectivity;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddEmployee {
	JFrame f1;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7; 
	JComboBox jc1;
	public AddEmployee(){
		
		f1 = new JFrame();
		f1.setBounds(100,100,1000,700);
		f1.setLayout(null);
		f1.setTitle("AdminPage");
		
		lb1 = new JLabel("Enter Emp First Name:");
		lb1.setBounds(200,120,120,20);
		f1.add(lb1);
		
		tf1 = new JTextField();
		tf1.setBounds(310,120,120,20);
		f1.add(tf1);
		
		lb2 = new JLabel("Enter EMP Last Name:");
		lb2.setBounds(550,120,120,20);
		f1.add(lb2);
		
		tf2 = new JTextField();
		tf2.setBounds(660,120,120,20);
		f1.add(tf2);
		
		lb4 = new JLabel("Enter Emp Id:");
		lb4.setBounds(200,220,120,20);
		f1.add(lb4);
		
		tf4 = new JTextField();
		tf4.setBounds(310,220,120,20);
		f1.add(tf4);
		
		lb5 = new JLabel("Enter Emp Phone NO:");
		lb5.setBounds(550,220,120,20);
		f1.add(lb5);
		
		tf5 = new JTextField();
		tf5.setBounds(660,220,120,20);
		f1.add(tf5);
		
		lb6 = new JLabel("Enter Emp Email Id:");
		lb6.setBounds(200,320,120,20);
		f1.add(lb6);
		
		tf6 = new JTextField();
		tf6.setBounds(310,320,120,20);
		f1.add(tf6);
		
		lb7= new JLabel("Create Emp Password:");
		lb7.setBounds(550,320,120,20);
		f1.add(lb7);
		
		tf7 = new JTextField();
		tf7.setBounds(660,320,120,20);
		f1.add(tf7);
		
		
		JButton bt1 = new JButton("Submit");
		bt1.setBounds(450, 550, 100, 40);
		bt1.setBackground(Color.blue);
		bt1.setForeground(Color.white);
		f1.add(bt1);
		
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int ID = Integer.parseInt(tf4.getText());
				String First_Name = tf2.getText();
				String Last_Name = tf2.getText();
				long Phone_No = Long.parseLong(tf5.getText());
				String Email_Id = tf6.getText();
				String Password = tf7.getText();
				
				System.out.println(First_Name+Last_Name+Phone_No+Email_Id+Password);
				
				JdbcConnectivity jd = new JdbcConnectivity();
				jd.AddEmpDetails(ID, First_Name, Last_Name, Phone_No, Email_Id, Password);
				
			}
		});
		
		
		f1.setVisible(true);
	}
}
