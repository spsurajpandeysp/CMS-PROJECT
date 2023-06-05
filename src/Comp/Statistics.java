package Comp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.*;

import JDBC.JdbcConnectivity;

public class Statistics {
	JFrame f1;
	JTextField tf1,tf2;
	JComboBox jc1;
	String adminPass = "pass123";
	public Statistics(){
		f1 = new JFrame();
		f1.setBounds(100,100,700,400);
		
		f1.setTitle("statistics");
		
		JdbcConnectivity jd = new JdbcConnectivity();
		int [] record= jd.fetchStatistics();
		
		String[] columnName= {"Time Period","Total_Ammount","Discount","Total_Amount After Discount"};
		String[][] data = {{"Today",Integer.toString(record[0]),Integer.toString(record[1]),Integer.toString(record[2])},
		{"Week",Integer.toString(record[3]),Integer.toString(record[4]),Integer.toString(record[5])},
		{"Month",Integer.toString(record[6]),Integer.toString(record[7]),Integer.toString(record[8])},
		{"Year",Integer.toString(record[9]),Integer.toString(record[10]),Integer.toString(record[11])}};
		
		JTable table = new JTable(data,columnName);
		
		f1.add(new JScrollPane(table));
		
		f1.setVisible(true);
	}
}
