package Comp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdminPage {
	JFrame f1;
	public AdminPage(){
		f1 = new JFrame();
		f1.setBounds(100,100,1000,700);
		f1.setLayout(null);
		
		
		JButton bt1 = new JButton("Add Employee");
		bt1.setBounds(100, 60, 150, 120);
		bt1.setBackground(Color.blue);
		bt1.setForeground(Color.white);
		f1.add(bt1);
		
		JButton bt2 = new JButton("Remove Employee");
		bt2.setBounds(100, 200, 150, 120);
		bt2.setBackground(Color.blue);
		bt2.setForeground(Color.white);
		f1.add(bt2);
		
		JButton bt3 = new JButton("Add Iteam");
		bt3.setBounds(100, 340, 150, 120);
		bt3.setBackground(Color.blue);
		bt3.setForeground(Color.white);
		f1.add(bt3);
		
		JButton bt4 = new JButton("Modify Iteam");
		bt4.setBounds(100, 480, 150, 120);
		bt4.setBackground(Color.blue);
		bt4.setForeground(Color.white);
		f1.add(bt4);
		
		JButton bt5 = new JButton("Delete Iteam");
		bt5.setBounds(300, 100, 150, 120);
		bt5.setBackground(Color.blue);
		bt5.setForeground(Color.white);
		f1.add(bt5);
		
		JButton bt6 = new JButton("statistics");
		bt6.setBounds(300, 300, 150, 120);
		bt6.setBackground(Color.blue);
		bt6.setForeground(Color.white);
		f1.add(bt6);
		
		
		
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				AddEmployee ad = new AddEmployee();
			}
		});
		
		bt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				DeleteEmpAccount da = new DeleteEmpAccount();
			}
		});
		
		bt3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				AddIteams ai =new AddIteams();
			}
		});
		
		bt4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ModifyItemsDetails md = new ModifyItemsDetails ();
			}
		});
		bt5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				DeleteIteams di = new DeleteIteams ();
			}
		});
		bt6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Statistics st = new Statistics();
			}
		});
		
		
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\Computer\\Downloads\\game.png"));

        f1.add(background);

		f1.setVisible(true);
	}
}
