package com.rar.service;


import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.rar.dao.RARDB;

//import com.cares.dao.DataBase;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.UIManager;

public class Login_Page extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page frame = new Login_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 *
	 */
	public Login_Page()  {
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Cafe Managment System\\Images\\login_page_burgur.jpg"));
		lblNewLabel_1.setBounds(480, 36, 288, 382);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Enter");
		panel.setBounds(34, 36, 447, 382);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setBounds(0, 0, 145, 34);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		JLabel lblNewLabel_3 = new JLabel("Table Number");
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNewLabel_3.setBounds(41, 58, 116, 22);
		panel.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(41, 175, 293, 34);
		panel.add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("Table Password");
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNewLabel_4.setBounds(41, 154, 116, 22);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(41, 79, 293, 34);
		panel.add(textField);
		textField.setBackground(new Color(255, 255, 255));
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBorder(UIManager.getBorder("RadioButton.border"));
		btnNewButton.setBounds(218, 259, 116, 34);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(""))
				{
					//lblNewLabel_8.setVisible(true);
				}
				else {
				
				RARDB db = new RARDB();
				int a = db.login(passwordField.getText() , textField.getText());
				switch (a)
				{
				case 1: 
//					lblNewLabel_3.setVisible(true);
					break;
				case 2:
					//lblNewLabel_3_1.setVisible(true);
					//lblNewLabel_5.setVisible(true);
					
					break;
				}
				
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Background\\bg9.jpg"));
		lblNewLabel_5.setBounds(0, 0, 447, 382);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\background1\\bg11.jpg"));
		lblNewLabel.setBounds(0, 0, 809, 451);
		contentPane.add(lblNewLabel);
		
		Menu m = new Menu(textField.getText());
		
		if(m.isVisible()==true) {
			this.setVisible(false);
		}
	}
}

