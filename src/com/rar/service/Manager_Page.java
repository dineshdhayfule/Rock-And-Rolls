package com.rar.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Manager_Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					int gt = 0;
					Manager_Page frame = new Manager_Page("" , gt);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param tnum 
	 */
	public Manager_Page(String tnum , int gtp) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 327, 438);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(tnum);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 307, 39);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Total Bill -");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 73, 110, 28);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(347, 11, 405, 438);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel(gtp+"  Rs");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNewLabel_2.setBounds(130, 73, 153, 28);
		panel.add(lblNewLabel_2);
		
		JLabel method = new JLabel("");
		method.setBounds(92, 354, 227, 25);
		panel_1.add(method);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(63, 43, 275, 275);
		panel_1.add(lblNewLabel_3);
		
		JButton gpay = new JButton("");
		gpay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				method.setText("Payment By Google Pay");
				lblNewLabel_3.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\qrcode1.jpeg"));
			}
		});
		gpay.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\gpay1.png"));
		gpay.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		gpay.setBounds(10, 133, 110, 100);
		panel.add(gpay);
		
		JButton phonepay = new JButton("");
		phonepay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				method.setText("Payment By Phone Pay");
				lblNewLabel_3.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\qrcode1.jpeg"));
			}
		});
		phonepay.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\phonepay1.png"));
		phonepay.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		phonepay.setBounds(207, 133, 110, 100);
		panel.add(phonepay);
		
		JButton paytm = new JButton("");
		paytm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				method.setText("Payment By Paytm");
				lblNewLabel_3.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\qrcode1.jpeg"));
			}
		});
		paytm.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\paytm1.png"));
		paytm.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		paytm.setBounds(10, 264, 110, 100);
		panel.add(paytm);
		
		JButton cash = new JButton("");
		cash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				method.setText("Payment By Cash");
				panel_1.setLayout(null);
			}
		});
		cash.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\cash1.png"));
		cash.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		cash.setBounds(207, 264, 110, 100);
		panel.add(cash);
		
		JButton btnNewButton = new JButton("Paid");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane ,"PayMent Recevied"); 
				String mail = JOptionPane.showInputDialog(contentPane ,"Enter Email");
				Email_Bill eb = new Email_Bill();
				eb.sendEmail(mail, tnum ,  gtp);
			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		btnNewButton.setBounds(116, 399, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\background1\\bg6.jpg"));
		lblNewLabel_4.setBounds(0, 0, 762, 457);
		contentPane.add(lblNewLabel_4);
	}
}
