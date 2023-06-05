package Comp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class StockUpdate {
	JFrame f1;
	JTextField tf1,tf2;
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7; 
	JTextArea ta1,ta2,ta3,ta4,ta5,ta8,ta6,ta7;
	public StockUpdate(){
		
		f1 = new JFrame();
		f1.setBounds(100,100,1000,700);
		f1.setLayout(null);
		f1.setTitle("LoginForm");
		
		
		
		JButton bt1 = new JButton("Search Iteam");
		bt1.setBounds(100, 60, 150, 120);
		bt1.setBackground(Color.blue);
		bt1.setForeground(Color.white);
		f1.add(bt1);
		
		
		JButton bt2 = new JButton("Add Iteam");
		bt2.setBounds(100, 200, 150, 120);
		bt2.setBackground(Color.blue);
		bt2.setForeground(Color.white);
		f1.add(bt2);
		
		JButton bt3 = new JButton("Modify Iteam");
		bt3.setBounds(100, 340, 150, 120);
		bt3.setBackground(Color.blue);
		bt3.setForeground(Color.white);
		f1.add(bt3);
		
		
		JButton bt4 = new JButton("Delete Iteam");
		bt4.setBounds(100, 480, 150, 120);
		bt4.setBackground(Color.blue);
		bt4.setForeground(Color.white);
		f1.add(bt4);
		
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				SearchProduct sp = new SearchProduct ();
			}
		});
		
		bt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				AddIteams ai = new AddIteams();
			}
		});
		
		bt3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ModifyItemsDetails mi = new ModifyItemsDetails ();
			}
		});
		
		bt4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				DeleteIteams di = new DeleteIteams ();
			}
		});
		
		f1.setVisible(true);
	}
}
