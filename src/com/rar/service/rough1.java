package com.rar.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ItemEvent;

public class rough1 extends JFrame {
	JCheckBox check1 , check2;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					ArrayList a = new ArrayList();
					rough1 frame = new rough1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param a 
	 */
	public rough1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 340, 383);
		contentPane.add(panel);
		panel.setLayout(null);
		
//		rough r = new rough();
		
		check1 = new JCheckBox("New check box");
		check1.setBounds(28, 169, 97, 23);
		panel.add(check1);
		
		check2 = new JCheckBox("New check box");
		check2.setBounds(159, 169, 97, 23);
		panel.add(check2);
		

//		class roug {
//			public void rg(boolean b  , int a) {
//				if(b==true && a ==1) {
//					check1.setSelected(b);
//				}
//				else if(b==true && a==2) {
//					check2.setSelected(b);
//				}
//			}
//		}
//		roug rv = new roug();
//		for(int i = 0 ; i<a.size();i++) {
//			rv.rg((boolean) a.get(i) , i);
//		}
//		check2.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				if(check2.isSelected()==true) {
//					r.setVisible(true);
//				r.rg("true");
//				}
//				if(check2.isSelected()==false) {
//					r.setVisible(true);
//					r.rg("false");
//				}
//			}
//		});
//		check1.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				if(check1.isSelected()==true) {
//					r.setVisible(true);
//				r.rg("true");
//				}
//				if(check1.isSelected()==false) {
//					r.setVisible(true);
//					r.rg("false");
//				}
//			}
//		});
	}
	public void check(ArrayList a) {
		for(int i = 0 ; i < a.size(); i++) {
			if(i==0) {
				check1.setSelected(true);
			}else if(i==1) {
				check2.setSelected(true);
			}else {
				
			}
		}
	}
}
