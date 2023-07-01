package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import Hclass.Doctor;
import fileio.FileReadWriteDemo;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class AddDoctors extends JFrame {

	private JPanel contentPane;
	private JTextField txtDid;
	private JTextField txtDname;
	private JTextField txtDage;
	private JTextField txtDphone;
	private JTextField txtDspecialist;
	private JTextField txtAvailability;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddDoctors frame = new AddDoctors();
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
	public AddDoctors() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDoctorId = new JLabel("Doctor ID");
		lblDoctorId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDoctorId.setBounds(261, 93, 121, 22);
		contentPane.add(lblDoctorId);
		
		txtDid = new JTextField();
		txtDid.setColumns(10);
		txtDid.setBounds(427, 93, 140, 22);
		contentPane.add(txtDid);
		
		JLabel lblDoctorName = new JLabel("Doctor Name");
		lblDoctorName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDoctorName.setBounds(261, 126, 121, 22);
		contentPane.add(lblDoctorName);
		
		txtDname = new JTextField();
		txtDname.setColumns(10);
		txtDname.setBounds(427, 126, 140, 22);
		contentPane.add(txtDname);
		
		txtDage = new JTextField();
		txtDage.setColumns(10);
		txtDage.setBounds(427, 159, 140, 22);
		contentPane.add(txtDage);
		
		JLabel lblDoctorAge = new JLabel("Doctor Age");
		lblDoctorAge.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDoctorAge.setBounds(261, 159, 121, 22);
		contentPane.add(lblDoctorAge);
		
		JLabel lblPhone = new JLabel("Phone ");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhone.setBounds(261, 192, 121, 22);
		contentPane.add(lblPhone);
		
		txtDphone = new JTextField();
		txtDphone.setColumns(10);
		txtDphone.setBounds(427, 192, 140, 22);
		contentPane.add(txtDphone);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Doctor doctor = new Doctor();
				
				doctor.setID(txtDname.getText());
				doctor.setName(txtDid.getText());
				doctor.setPhone(Integer.parseInt(txtDphone.getText()));
				doctor.setAge(Integer.parseInt(txtDage.getText()));
				doctor.setSpecialist(txtDspecialist.getText());
				doctor.setAvailability(txtAvailability.getText());
				
				FileReadWriteDemo fileReadWriteDemo = new FileReadWriteDemo();
				fileReadWriteDemo.writeInFile(doctor);
				
				setVisible(false);
				new AddDoctors().setVisible(true);
				
			}
		});
		btnSave.setBounds(261, 302, 96, 50);
		contentPane.add(btnSave);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Home().setVisible(true);
			}
		});
		btnGoBack.setBounds(471, 302, 96, 50);
		contentPane.add(btnGoBack);
		
		JLabel lblSpecialist = new JLabel("Specialist");
		lblSpecialist.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSpecialist.setBounds(261, 225, 121, 22);
		contentPane.add(lblSpecialist);
		
		txtDspecialist = new JTextField();
		txtDspecialist.setColumns(10);
		txtDspecialist.setBounds(427, 225, 140, 22);
		contentPane.add(txtDspecialist);
		
		JLabel lblAvailability = new JLabel("Availability");
		lblAvailability.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAvailability.setBounds(261, 258, 121, 22);
		contentPane.add(lblAvailability);
		
		txtAvailability = new JTextField();
		txtAvailability.setColumns(10);
		txtAvailability.setBounds(427, 258, 140, 22);
		contentPane.add(txtAvailability);
		
		JLabel lblNewLabel = new JLabel("Add Doctor");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(261, 11, 306, 50);
		contentPane.add(lblNewLabel);
	}

}
