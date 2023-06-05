package Comp;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

import JDBC.JdbcConnectivity;
public class SalesBoyPage {
	JFrame f1;
	public SalesBoyPage(){
		f1 = new JFrame();
		f1.setBounds(100,100,1000,700);
		f1.setLayout(null);
		
		
		JButton bt1 = new JButton("Stock Update");
		bt1.setBounds(100, 60, 150, 120);
		bt1.setBackground(Color.blue);
		bt1.setForeground(Color.white);
		f1.add(bt1);
		
		JButton bt2 = new JButton("Take Order");
		bt2.setBounds(100, 200, 150, 120);
		bt2.setBackground(Color.blue);
		bt2.setForeground(Color.white);
		f1.add(bt2);
		
		JButton bt3 = new JButton("statistics");
		bt3.setBounds(100, 340, 150, 120);
		bt3.setBackground(Color.blue);
		bt3.setForeground(Color.white);
		f1.add(bt3);
		
		JButton bt4 = new JButton("About");
		bt4.setBounds(100, 480, 150, 120);
		bt4.setBackground(Color.blue);
		bt4.setForeground(Color.white);
		f1.add(bt4);
		
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				StockUpdate su = new StockUpdate();
			}
		});
		
		bt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		bt3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Statistics st = new Statistics();
			}
		});
		
		bt4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				About ab = new About();
			}
		});
		
		
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\Computer\\Downloads\\game.png"));

        f1.add(background);

		f1.setVisible(true);
	}
}

