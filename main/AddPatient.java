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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Hclass.Patient;
import fileio.FileReadWriteDemo;


public class AddPatient extends JFrame {

	private JPanel contentPane;
	private JTextField txtPid;
	private JLabel lblPatientName;
	private JTextField txtPname;
	private JLabel lblPatientAge;
	private JTextField txtPAge;
	private JLabel lblDisease;
	private JTextField txtDisease;
	private JButton btnGoBack;
	private JLabel lblAddPatient;
	private JLabel lblPhone;
	private JTextField txtPphone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPatient frame = new AddPatient();
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
	public AddPatient() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Patient ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(261, 118, 121, 22);
		contentPane.add(lblNewLabel);
		
		txtPid = new JTextField();
		txtPid.setBounds(427, 120, 140, 22);
		contentPane.add(txtPid);
		txtPid.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Patient patient = new Patient();
				patient.setID(txtPid.getText());
				patient.setName(txtPname.getText());
				patient.setAge(Integer.parseInt(txtPAge.getText()));
				patient.setPhone(Integer.parseInt(txtPphone.getText()));
				patient.setDisease(txtDisease.getText());
			
				FileReadWriteDemo fileReadWriteDemo = new FileReadWriteDemo();
				fileReadWriteDemo.writeInFile(patient);
				
				setVisible(false);
				new AddPatient().setVisible(true);;
				
		
			}
		});
		btnSave.setBounds(261, 327, 96, 50);
		contentPane.add(btnSave);
		
		lblPatientName = new JLabel("Patient Name");
		lblPatientName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPatientName.setBounds(261, 153, 121, 22);
		contentPane.add(lblPatientName);
		
		txtPname = new JTextField();
		txtPname.setColumns(10);
		txtPname.setBounds(427, 153, 140, 22);
		contentPane.add(txtPname);
		
		lblPatientAge = new JLabel("Patient Age");
		lblPatientAge.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPatientAge.setBounds(261, 186, 121, 22);
		contentPane.add(lblPatientAge);
		
		txtPAge = new JTextField();
		txtPAge.setColumns(10);
		txtPAge.setBounds(427, 186, 140, 22);
		contentPane.add(txtPAge);
		
		lblDisease = new JLabel("Disease");
		lblDisease.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDisease.setBounds(261, 252, 121, 22);
		contentPane.add(lblDisease);
		
		txtDisease = new JTextField();
		txtDisease.setColumns(10);
		txtDisease.setBounds(427, 252, 140, 22);
		contentPane.add(txtDisease);
		
		btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Home().setVisible(true);
			}
		});
		btnGoBack.setBounds(471, 327, 96, 50);
		contentPane.add(btnGoBack);
		
		lblAddPatient = new JLabel("Add Patient");
		lblAddPatient.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddPatient.setForeground(Color.WHITE);
		lblAddPatient.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblAddPatient.setBounds(261, 11, 306, 50);
		contentPane.add(lblAddPatient);
		
		lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhone.setBounds(261, 219, 121, 22);
		contentPane.add(lblPhone);
		
		txtPphone = new JTextField();
		txtPphone.setColumns(10);
		txtPphone.setBounds(427, 219, 140, 22);
		contentPane.add(txtPphone);
	}
}
