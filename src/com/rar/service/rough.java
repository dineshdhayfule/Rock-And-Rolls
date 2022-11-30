package com.rar.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class rough extends JFrame {
	JCheckBox cb1 , cb2;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rough frame = new rough();
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
	
	
	public rough() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 360, 445);
		contentPane.add(panel);
		panel.setLayout(null);
		rough1 r1 = new rough1();
		r1.setVisible(true);
		ArrayList a = new ArrayList();
		cb1 = new JCheckBox("New check box");
		cb1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(cb1.isSelected()==true) {
					a.add(true);
					r1.check(a);
					cb1.setVisible(false);
				}
			}
		});
		cb1.setBounds(21, 178, 97, 23);
		panel.add(cb1);
		
		cb2 = new JCheckBox("New check box");
		cb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(cb2.isSelected()==true) {
					a.add(true);
					r1.check(a);
					cb2.setVisible(false);
				}
			}
		});
		cb2.setBounds(145, 178, 97, 23);
		panel.add(cb2);
		
		
		
	}
}
