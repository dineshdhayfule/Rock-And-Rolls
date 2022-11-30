package com.rar.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Loading_Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loading_Page frame = new Loading_Page();
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
//	void showMe() {
//		Login_Page p1 = new Login_Page();
//		Loading_Page pt = new Loading_Page();
//		try {
//			Thread.sleep(3000);
//			System.out.println("Strted ");
//			p1.setVisible(true);
//			pt.setVisible(false);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	public Loading_Page() {
//		showMe();
//		class tr extends Thread{
//			
//			public void run(){
//				try {
//					sleep(5000);
//					Login_Page lp = new Login_Page();
//					lp.setVisible(true);
//					Loading_Page obj = new Loading_Page();
//					obj.setVisible(false);
//				}catch(Exception e){
//					
//				}
//			}
//		}
//		tr t = new tr();
//		t.start();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 500, 500);
		contentPane.add(lblNewLabel);
		
		ImageIcon gif = new ImageIcon(this.getClass().getResource("/BRAR.gif"));
		lblNewLabel.setIcon(gif);
		
		Login_Page lp = new Login_Page();
		lp.setVisible(true);
	//	setUndecorated(true);
		
		
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			Thread.sleep(5000);
//			setVisible(false);
//			Menu m = new Menu();
//			m.setVisible(true);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
