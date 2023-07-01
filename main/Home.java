package main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddP = new JButton("Add patient");
		btnAddP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new AddPatient().setVisible(true);
			}
		});
		btnAddP.setBounds(202, 90, 145, 96);
		contentPane.add(btnAddP);
		
		JButton btnClose = new JButton("Log Out");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login().setVisible(true);
			}
		});
		btnClose.setBounds(342, 347, 145, 96);
		contentPane.add(btnClose);
		
		JButton btnShowPatients = new JButton("Show Patients");
		btnShowPatients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ShowPatients().setVisible(true);
			}
		});
		btnShowPatients.setBounds(488, 90, 145, 96);
		contentPane.add(btnShowPatients);
		
		JButton btnAddDoctor = new JButton("Add Doctor");
		btnAddDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new AddDoctors().setVisible(true);
			}
		});
		btnAddDoctor.setBounds(202, 221, 145, 96);
		contentPane.add(btnAddDoctor);
		
		JButton btnShowDoctors = new JButton("Show Doctors");
		btnShowDoctors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ShowDoctors().setVisible(true);
			}
		});
		btnShowDoctors.setBounds(485, 221, 145, 96);
		contentPane.add(btnShowDoctors);
		
		JLabel lblNewLabel = new JLabel("HOME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(279, 11, 270, 49);
		contentPane.add(lblNewLabel);
	}
}
