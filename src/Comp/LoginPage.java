package Comp;
import javax.swing.*;


import JDBC.JdbcConnectivity;

import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionListener;
class LoginPages{
	JFrame f1;
	JTextField tf1,tf2;
	JComboBox jc1;
	int adminId = 123;
	String adminPass = "pass123";
	public void MyFrame(){
		f1 = new JFrame();
		f1.setBounds(100,100,600,400);
		f1.setLayout(null);
		f1.setTitle("LoginForm");
		
		
		JLabel lb1 = new JLabel("Username");
		lb1.setBounds(170,90,100,20);
		f1.add(lb1);
		
		tf1 = new JTextField();
		tf1.setBounds(250,90,120,20);
		f1.add(tf1);
		
		JLabel lb2 = new JLabel("Password");
		lb2.setBounds(170,140,100,20);
		f1.add(lb2);
		
		tf2 = new JTextField();
		tf2.setBounds(250,140,120,20);
		f1.add(tf2);

		JLabel lb3 = new JLabel("UserRole");
		lb3.setBounds(170,190,100,20);
		f1.add(lb3);
		
		String[] modes = {"-select-","Admin","Employee",};
		jc1 = new JComboBox(modes);
		jc1.setBounds(250, 190, 120, 20);
		f1.add(jc1);
		
		JButton bt1 = new JButton("Login");
		bt1.setBounds(250, 240, 80, 20);
		f1.add(bt1);
		
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(tf1.getText());
				String password = tf2.getText();
				
				
				String mode = (String) jc1.getSelectedItem();
				
				
				if(mode.equals("Admin")) {
					if(password.equals(adminPass) && id==adminId){
						AdminPage ad = new AdminPage();
					}
					else {
						JOptionPane.showMessageDialog(f1,"Enter correct Password",mode, JOptionPane.WARNING_MESSAGE);
					}
				}
				else if(mode.equals("Employee")){
					JdbcConnectivity Myjdbc = new JdbcConnectivity();
					
					String salesPass = Myjdbc.FetchPassword(id);
							
					if(password.equals(salesPass)){
						SalesBoyPage sbp = new SalesBoyPage();
					}
					else {
						JOptionPane.showMessageDialog(f1,"Enter correct UserName And Password","Message",JOptionPane.WARNING_MESSAGE);
					}
				}
				else {
					JOptionPane.showMessageDialog(f1,"Select Mode","Message",JOptionPane.WARNING_MESSAGE);
				}
			}
			
			
		});
		
		f1.setVisible(true);
	}
}
public class LoginPage {
	public static void main(String args[]) {
		LoginPages obj1 = new LoginPages();
		obj1.MyFrame();
				
	}
}
