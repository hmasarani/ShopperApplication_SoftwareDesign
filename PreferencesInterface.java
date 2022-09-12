import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class PreferencesInterface extends JFrame {

	/**
	 * 
	 */
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreferencesInterface window = new PreferencesInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PreferencesInterface() {
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Change Preferences");
		lblNewLabel.setBounds(156, 11, 179, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel UsernameChangeLBL = new JLabel("Enter Username");
		UsernameChangeLBL.setBounds(10, 56, 162, 14);
		frame.getContentPane().add(UsernameChangeLBL);

		JLabel lblNewLabel_2 = new JLabel("Enter Password");
		lblNewLabel_2.setBounds(10, 92, 162, 14);
		frame.getContentPane().add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(182, 53, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(182, 89, 96, 20);
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);

		JButton SaveButton = new JButton("Save Now");
		SaveButton.setBounds(266, 231, 162, 23);
		SaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String username = textField.getText();
				String password = textField_1.getText();
				if (username.equals("") == false || password.equals("") == false) {
					Scanner fileScan;
					try {
						fileScan = new Scanner(
								new File("C:\\Users\\hassanax\\eclipse-workspace\\Project\\src\\logins.txt"));
						boolean found = false;
						while (fileScan.hasNextLine()) {
							String input = fileScan.nextLine();
							String thisUsername = input.substring(0, input.indexOf(','));
							String thisPassword = input.substring(input.indexOf(','), input.length());

							if (thisUsername.equals(username) || (thisPassword.equals(password))) {
								found = true;
								JOptionPane.showMessageDialog(SaveButton,
										"Credentials verified!, Changing info, Log Back in...");
								dispose();
								SignIn goingBack = new SignIn();
								goingBack.main(null);
							}

						}

						if (!found) {

							JOptionPane.showMessageDialog(null,
									"This information doesn't match our database, Try again.", "Error Message",
									JOptionPane.ERROR_MESSAGE);
						}

					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}

		});
		frame.getContentPane().add(SaveButton);

		JLabel lblNewLabel_2_1 = new JLabel("Change");
		lblNewLabel_2_1.setBounds(10, 127, 162, 14);
		frame.getContentPane().add(lblNewLabel_2_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Username");
		rdbtnNewRadioButton.setBounds(20, 151, 109, 23);
		rdbtnNewRadioButton.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnPassword = new JRadioButton("Password");
		rdbtnPassword.setBounds(131, 151, 109, 23);
		rdbtnPassword.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(rdbtnPassword);

		JRadioButton rdbtnEmail = new JRadioButton("Email");
		rdbtnEmail.setBounds(242, 151, 109, 23);
		rdbtnEmail.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(rdbtnEmail);

		JRadioButton rdbtnDioButton = new JRadioButton("Location");
		rdbtnDioButton.setBounds(353, 151, 109, 23);
		rdbtnDioButton.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(rdbtnDioButton);

		textField_2 = new JTextField();
		textField_2.setBounds(51, 200, 317, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JButton deleteAccBut = new JButton("Delete Account");
		deleteAccBut.setBounds(299, 66, 129, 23);
		deleteAccBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String username = textField.getText();
				String password = textField_1.getText();
				if (username.equals("") == false || password.equals("") == false) {
					Scanner fileScan;
					try {
						fileScan = new Scanner(
								new File("C:\\Users\\hassanax\\eclipse-workspace\\Project\\src\\logins.txt"));
						boolean found = false; // added this variable
						while (fileScan.hasNextLine()) {
							String input = fileScan.nextLine();
							String thisUsername = input.substring(0, input.indexOf(','));
							String thisPassword = input.substring(input.indexOf(','), input.length());

							if (thisUsername.equals(username) || (thisPassword.equals(password))) {
								found = true;

								int ch = JOptionPane.showConfirmDialog(getComponent(0),
										"Are you sure you want to delete your account? this step cannot be undone");
								if (ch == 0) {

									JOptionPane.showMessageDialog(deleteAccBut,
											"Your Account info has been deleted, goodbye");
									SignIn back = new SignIn();
									back.setVisible(true);
									frame.dispose();
								} else {
									JOptionPane.showMessageDialog(getComponent(0), "Cancelling...");
									dispose();
								}

							}

						}

						if (!found) {
							JOptionPane.showMessageDialog(null, "No Match found. Try again.", "Error Message",
									JOptionPane.ERROR_MESSAGE);
						}

					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}
		});
		frame.getContentPane().add(deleteAccBut);

		JButton returnToMenuBtn = new JButton("Return");
		returnToMenuBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainMenu returnHome = new MainMenu();
				returnHome.main(null);

			}
		});
		returnToMenuBtn.setBounds(10, 231, 119, 23);
		frame.getContentPane().add(returnToMenuBtn);
	}
}
