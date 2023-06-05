package Comp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.*;
import JDBC.JdbcConnectivity;

public class ModifyItemsDetails {
	JFrame f1;
	JTextField tf1,tf2,tf3,tf4;
	
	JCheckBox jc1,jc2,jc3,jc4;
	
	public ModifyItemsDetails(){
		f1 = new JFrame();
		f1.setBounds(100,100,800,600);
		f1.setLayout(null);
		f1.setTitle("Modify Iteam Details");
		

		jc1 = new JCheckBox("Add Stock");
		jc1.setBounds(250,150,100,20);
		f1.add(jc1);
		
		tf1 = new JTextField();
		tf1.setBounds(370,150,120,20);
		f1.add(tf1);
		
		jc2 = new JCheckBox("Modify Price");
		jc2.setBounds(250,200,120,20);
		f1.add(jc2);
		
		tf2 = new JTextField();
		tf2.setBounds(370,200,120,20);
		f1.add(tf2);
		
		jc3 = new JCheckBox("Modify Discount");
		jc3.setBounds(250,250,120,20);
		f1.add(jc3);
		
		tf3 = new JTextField();
		tf3.setBounds(370,250,120,20);
		f1.add(tf3);
		
		JLabel jl1 = new JLabel("ENTER PRODUCT NAME:");
		jl1.setBounds(200,100,180,20);
		f1.add(jl1);
		
		JButton bt1 = new JButton("SUBMIT:");
		bt1.setBounds(300, 300, 120, 20);
		f1.add(bt1);
		
		tf4 = new JTextField();
		tf4.setBounds(370,100,120,20);
		f1.add(tf4);
		
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JdbcConnectivity MyJdbc = new JdbcConnectivity();
				String productName = tf4.getText();
				System.out.println(productName);
				if(jc1.isSelected()) {
					int addStock = Integer.parseInt(tf1.getText());
					MyJdbc.UpdateTotalStock(productName, addStock);
					
				}
				if(jc2.isSelected()) {
					int MRP = Integer.parseInt(tf2.getText());
					MyJdbc.UpdateMRP(productName, MRP);
					System.out.println(MRP);
				}
				
				if(jc3.isSelected()) {
					int Discount = Integer.parseInt(tf3.getText());
					MyJdbc.UpdateDiscount(productName, Discount);
					System.out.println(Discount);
				}
			}
		});
		
		f1.setVisible(true);
	}
}
