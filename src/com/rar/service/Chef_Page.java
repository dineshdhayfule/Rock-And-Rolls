package com.rar.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Chef_Page extends JFrame {

	private JPanel contentPane;
	private JLabel n1;
	private JLabel n2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayList d = new ArrayList();
					ArrayList q = new ArrayList();
					Chef_Page frame = new Chef_Page("" , d , q);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Chef_Page(String tnum , ArrayList d , ArrayList q) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 553);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 128, 114));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 417, 492);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel i1 = new JLabel("");
		i1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		i1.setBounds(144, 65, 176, 22);
		panel.add(i1);
		
		JLabel q1 = new JLabel("");
		q1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		q1.setBounds(355, 65, 52, 22);
		panel.add(q1);
		
		JLabel i2 = new JLabel("");
		i2.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		i2.setBounds(144, 98, 176, 22);
		panel.add(i2);
		
		JLabel q2 = new JLabel("");
		q2.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		q2.setBounds(355, 98, 52, 22);
		panel.add(q2);
		
		JLabel i3 = new JLabel("");
		i3.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		i3.setBounds(144, 131, 176, 22);
		panel.add(i3);
		
		JLabel q3 = new JLabel("");
		q3.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		q3.setBounds(355, 131, 52, 22);
		panel.add(q3);
		
		JLabel i4 = new JLabel("");
		i4.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		i4.setBounds(144, 164, 176, 22);
		panel.add(i4);
		
		JLabel q4 = new JLabel("");
		q4.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		q4.setBounds(355, 164, 52, 22);
		panel.add(q4);
		
		JLabel i5 = new JLabel("");
		i5.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		i5.setBounds(144, 197, 176, 22);
		panel.add(i5);
		
		JLabel q5 = new JLabel("");
		q5.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		q5.setBounds(355, 197, 52, 22);
		panel.add(q5);
		
		JLabel i6 = new JLabel("");
		i6.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		i6.setBounds(144, 230, 176, 22);
		panel.add(i6);
		
		JLabel q6 = new JLabel("");
		q6.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		q6.setBounds(355, 230, 52, 22);
		panel.add(q6);
		
		JLabel i7 = new JLabel("");
		i7.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		i7.setBounds(144, 263, 176, 22);
		panel.add(i7);
		
		JLabel q7 = new JLabel("");
	    q7.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		q7.setBounds(355, 263, 52, 22);
		panel.add(q7);
		
		JLabel i8 = new JLabel("");
		i8.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		i8.setBounds(144, 296, 176, 22);
		panel.add(i8);
		
		JLabel q8 = new JLabel("");
		q8.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		q8.setBounds(355, 296, 52, 22);
		panel.add(q8);
		
		JLabel i9 = new JLabel("");
		i9.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		i9.setBounds(144, 329, 176, 22);
		panel.add(i9);
		
		JLabel q9 = new JLabel("");
		q9.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		q9.setBounds(355, 329, 52, 22);
		panel.add(q9);
		
		JLabel i10 = new JLabel("");
	    i10.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		i10.setBounds(144, 362, 176, 22);
		panel.add(i10);
		
		JLabel q10 = new JLabel("");
		q10.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		q10.setBounds(355, 362, 52, 22);
		panel.add(q10);
		
		JLabel i11 = new JLabel("");
		i11.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		i11.setBounds(144, 395, 176, 22);
		panel.add(i11);
		
		JLabel q11 = new JLabel("");
		q11.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		q11.setBounds(355, 395, 52, 22);
		panel.add(q11);
		
		JLabel i12 = new JLabel("");
		i12.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		i12.setBounds(144, 428, 176, 22);
		panel.add(i12);
		
		JLabel q12 = new JLabel("");
		q12.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		q12.setBounds(355, 428, 52, 22);
		panel.add(q12);
		
		n1 = new JLabel("");
		n1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		n1.setBounds(10, 65, 115, 22);
		panel.add(n1);
		
		n2 = new JLabel("");
		n2.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		n2.setBounds(10, 98, 115, 22);
		panel.add(n2);
		
		JLabel n3 = new JLabel("");
		n3.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		n3.setBounds(10, 131, 115, 22);
		panel.add(n3);
		
		JLabel n4 = new JLabel("");
		n4.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		n4.setBounds(10, 164, 115, 22);
		panel.add(n4);
		
		JLabel n5 = new JLabel("");
		n5.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		n5.setBounds(10, 197, 115, 22);
		panel.add(n5);
		
		JLabel n6 = new JLabel("");
		n6.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		n6.setBounds(10, 230, 115, 22);
		panel.add(n6);
		
		JLabel n7 = new JLabel("");
		n7.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		n7.setBounds(10, 263, 115, 22);
		panel.add(n7);
		
		JLabel n8 = new JLabel("");
		n8.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		n8.setBounds(10, 296, 115, 22);
		panel.add(n8);
		
		JLabel n9 = new JLabel("");
		n9.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		n9.setBounds(10, 329, 115, 22);
		panel.add(n9);
		
		JLabel n10 = new JLabel("");
		n10.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		n10.setBounds(10, 362, 115, 22);
		panel.add(n10);
		
		JLabel n11 = new JLabel("");
		n11.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		n11.setBounds(10, 395, 115, 22);
		panel.add(n11);
		
		JLabel n12 = new JLabel("");
		n12.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		n12.setBounds(10, 428, 115, 22);
		panel.add(n12);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\background1\\bg9_2.jpg"));
		lblNewLabel.setBounds(0, 0, 417, 492);
		panel.add(lblNewLabel);
		
//		Menu m = new Menu(tnum);
//		//m.setVisible(true);
//		ArrayList a = new ArrayList();
//		
//		JCheckBox cb1 = new JCheckBox("");
//		cb1.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				if(cb1.isSelected()==true) {
//					a.add(true);
//					m.check(a);
//					cb1.setVisible(false);
//				}
//			}
//		});
//		cb1.setBackground(new Color(244, 164, 96));
//		cb1.setBounds(430, 74, 21, 22);
//		contentPane.add(cb1);
//		
//		JCheckBox cb2 = new JCheckBox("");
//		cb2.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				if(cb2.isSelected()==true) {
//					a.add(true);
//					m.check(a);
//					cb2.setVisible(false);
//				}
//			}
//		});
//		cb2.setBackground(new Color(244, 164, 96));
//		cb2.setBounds(430, 105, 21, 22);
//		contentPane.add(cb2);
//		
//		JCheckBox cb3 = new JCheckBox("");
//		cb3.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				if(cb3.isSelected()==true) {
//					a.add(true);
//					m.check(a);
//					cb3.setVisible(false);
//				}
//			}
//		});
//		cb3.setBackground(new Color(244, 164, 96));
//		cb3.setBounds(430, 141, 21, 22);
//		contentPane.add(cb3);
//		
//		JCheckBox cb4 = new JCheckBox("");
//		cb4.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				if(cb4.isSelected()==true) {
//					a.add(true);
//					m.check(a);
//					cb4.setVisible(false);
//				}
//			}
//		});
//		cb4.setBackground(new Color(244, 164, 96));
//		cb4.setBounds(430, 168, 21, 22);
//		contentPane.add(cb4);
//		
//		JCheckBox cb5 = new JCheckBox("");
//		cb5.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				if(cb5.isSelected()==true) {
//					a.add(true);
//					m.check(a);
//					cb5.setVisible(false);
//				}
//			}
//		});
//		cb5.setBackground(new Color(244, 164, 96));
//		cb5.setBounds(430, 207, 21, 22);
//		contentPane.add(cb5);
//		
//		JCheckBox cb6 = new JCheckBox("");
//		cb6.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				if(cb6.isSelected()==true) {
//					a.add(true);
//					m.check(a);
//					cb6.setVisible(false);
//				}
//			}
//		});
//		cb6.setBackground(new Color(244, 164, 96));
//		cb6.setBounds(430, 234, 21, 22);
//		contentPane.add(cb6);
//		
//		JCheckBox cb7 = new JCheckBox("");
//		cb7.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				if(cb7.isSelected()==true) {
//					a.add(true);
//					m.check(a);
//					cb7.setVisible(false);
//				}
//			}
//		});
//		cb7.setBackground(new Color(244, 164, 96));
//		cb7.setBounds(430, 274, 21, 22);
//		contentPane.add(cb7);
//		
//		JCheckBox cb8 = new JCheckBox("");
//		cb8.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				if(cb8.isSelected()==true) {
//					a.add(true);
//					m.check(a);
//					cb8.setVisible(false);
//				}
//			}
//		});
//		cb8.setBackground(new Color(244, 164, 96));
//		cb8.setBounds(430, 301, 21, 22);
//		contentPane.add(cb8);
//		
//		JCheckBox cb9 = new JCheckBox("");
//		cb9.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				if(cb9.isSelected()==true) {
//					a.add(true);
//					m.check(a);
//					cb9.setVisible(false);
//				}
//			}
//		});
//		cb9.setBackground(new Color(244, 164, 96));
//		cb9.setBounds(430, 334, 21, 22);
//		contentPane.add(cb9);
//		
//		JCheckBox cb10 = new JCheckBox("");
//		cb10.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				if(cb10.isSelected()==true) {
//					a.add(true);
//					m.check(a);
//					cb10.setVisible(false);
//				}
//			}
//		});
//		cb10.setBackground(new Color(244, 164, 96));
//		cb10.setBounds(430, 370, 21, 22);
//		contentPane.add(cb10);
//		
//		JCheckBox cb11 = new JCheckBox("");
//		cb11.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				if(cb11.isSelected()==true) {
//					a.add(true);
//					m.check(a);
//					cb11.setVisible(false);
//				}
//			}
//		});
//		cb11.setBackground(new Color(244, 164, 96));
//		cb11.setBounds(430, 406, 21, 22);
//		contentPane.add(cb11);
//		
//		JCheckBox cb12 = new JCheckBox("");
//		cb12.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent e) {
//				if(cb12.isSelected()==true) {
//					a.add(true);
//					m.check(a);
//					cb12.setVisible(false);
//				}
//			}
//		});
//		cb12.setBackground(new Color(244, 164, 96));
//		cb12.setBounds(430, 444, 21, 22);
//		contentPane.add(cb12);
		
		class chefdish {
			public void iq(String item , String quntity) {
				if(i1.getText().equals("") && q1.getText().equals("")) {
					i1.setText(item);
					q1.setText(quntity);
					n1.setText(tnum);
				}else if(i2.getText().equals("") && q2.getText().equals("")) {
					i2.setText(item);
					q2.setText(quntity);
					n2.setText(tnum);
				}else if(i3.getText().equals("") && q3.getText().equals("")) {
					i3.setText(item);
					q3.setText(quntity);
					n3.setText(tnum);
				}else if(i4.getText().equals("") && q4.getText().equals("")) {
					i4.setText(item);
					q4.setText(quntity);
					n4.setText(tnum);
				}else if(i5.getText().equals("") && q5.getText().equals("")) {
					i5.setText(item);
					q5.setText(quntity);
					n5.setText(tnum);
				}else if(i6.getText().equals("") && q6.getText().equals("")) {
					i6.setText(item);
					q6.setText(quntity);
					n6.setText(tnum);
				}else if(i7.getText().equals("") && q7.getText().equals("")) {
					i7.setText(item);
					q7.setText(quntity);
					n7.setText(tnum);
				}else if(i8.getText().equals("") && q8.getText().equals("")) {
					i8.setText(item);
					q8.setText(quntity);
					n8.setText(tnum);
				}else if(i9.getText().equals("") && q9.getText().equals("")) {
					i9.setText(item);
					q9.setText(quntity);
					n9.setText(tnum);
				}else if(i10.getText().equals("") && q10.getText().equals("")) {
					i10.setText(item);
					q10.setText(quntity);
					n10.setText(tnum);
				}else if(i11.getText().equals("") && q11.getText().equals("")) {
					i11.setText(item);
					q11.setText(quntity);
					n11.setText(tnum);
				}else if(i12.getText().equals("") && q12.getText().equals("")) {
					i12.setText(item);
					q12.setText(quntity);
					n12.setText(tnum);
				}else {
					JOptionPane.showMessageDialog(contentPane,"Limit Reached");
				}
			}
		}
		chefdish cd = new chefdish();
		for(int v =0;v<d.size();v++) {
			cd.iq((String.valueOf(d.get(v))) , String.valueOf(q.get(v)));
		}
		
	}
}
