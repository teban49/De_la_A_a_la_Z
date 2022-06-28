package de_la_a_a_la_z;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class graficos extends JFrame {
	
	int indice=0;

	private JPanel contentPane;

	public graficos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon imagen=new ImageIcon(MacintoshHD:\\Users\\esteban\\Desktop\\proyecto\\De_la_A_a_la_Z\\img\\0.jpg);
		lblNewLabel.setIcon(imagen);
		lblNewLabel.setBorder(null);
		lblNewLabel.setBounds(96, 91, 61, 16);
		contentPane.add(lblNewLabel);
	}

}
