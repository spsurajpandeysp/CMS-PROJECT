package Comp;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import JDBC.JdbcConnectivity;
public class AddIteams {
	JFrame f1;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7; 
	JComboBox jc1;
	public AddIteams(){
		
		f1 = new JFrame();
		f1.setBounds(100,100,1000,700);
		f1.setLayout(null);
		f1.setTitle("AddIteam");
		
		lb1 = new JLabel("Enter Iteam Name:");
		lb1.setBounds(200,120,120,20);
		f1.add(lb1);
		
		tf1 = new JTextField();
		tf1.setBounds(310,120,120,20);
		f1.add(tf1);
		
		lb2 = new JLabel("Enter Iteam Id:");
		lb2.setBounds(550,120,120,20);
		f1.add(lb2);
		
		tf2 = new JTextField();
		tf2.setBounds(660,120,120,20);
		f1.add(tf2);
		
		lb3 = new JLabel("Select Unit:");
		lb3.setBounds(200,220,120,20);
		f1.add(lb3);
		
		String[] modes = {"-select-","Login","ml","kg","gm"};
		jc1 = new JComboBox(modes);
		jc1.setBounds(310, 220, 120, 20);
		f1.add(jc1);

		
		lb4 = new JLabel("Enter Weight:");
		lb4.setBounds(550,220,120,20);
		f1.add(lb4);
		
		tf4 = new JTextField();
		tf4.setBounds(660,220,120,20);
		f1.add(tf4);
		
		lb5 = new JLabel("Enter Price");
		lb5.setBounds(200,320,120,20);
		f1.add(lb5);
		
		tf5 = new JTextField();
		tf5.setBounds(310,320,120,20);
		f1.add(tf5);
		
		lb6 = new JLabel("Enter Discount:");
		lb6.setBounds(550,320,120,20);
		f1.add(lb6);
		
		tf6 = new JTextField();
		tf6.setBounds(660,320,120,20);
		f1.add(tf6);
		
		lb7 = new JLabel("Enter Total Qty:");
		lb7.setBounds(380,420,120,20);
		f1.add(lb7);
		
		tf7 = new JTextField();
		tf7.setBounds(490,420,120,20);
		f1.add(tf7);
		
		JButton bt1 = new JButton("Submit");
		bt1.setBounds(450, 550, 100, 40);
		bt1.setBackground(Color.blue);
		bt1.setForeground(Color.white);
		f1.add(bt1);
		
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String itmName = tf1.getText();
				int itmId = Integer.parseInt(tf2.getText());
				String itmMeasUnit =(String)jc1.getSelectedItem();
				int itmQty = Integer.parseInt(tf4.getText());
				int itmPrice = Integer.parseInt(tf5.getText());
				int itmDiscount = Integer.parseInt(tf6.getText());
				int stock = Integer.parseInt(tf7.getText());
				
				JdbcConnectivity jc = new JdbcConnectivity();
				jc.AddStockDetails(itmName, itmId, itmQty, itmMeasUnit, itmPrice, itmDiscount, stock);
						
			}
		});
		

		
		
		f1.setVisible(true);
	}
}
