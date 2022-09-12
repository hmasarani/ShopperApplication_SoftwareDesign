import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Label;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

//some of the features and design are used from the example provided in eclass
@SuppressWarnings("serial")
public class SignIn extends JFrame {
	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SignIn() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 603, 497);
		setTitle("Welcome to SmartShopper App, Customer!");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);

		JLabel label = new JLabel("");
		panel_2.add(label);

		Label label_1 = new Label("Log In");
		label_1.setForeground(new Color(255, 140, 0));
		label_1.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_1.add(label_1);

		JLabel usernameLabel = new JLabel("USERNAME");
		usernameLabel.setFont(new Font("Arial", Font.BOLD, 11));

		usernameField = new JTextField();
		usernameField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setColumns(10);

		JLabel lblNewLabel = new JLabel("PASSWORD");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 11));

		JButton signInButton = new JButton("Sign In");
		signInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = usernameField.getText();
				@SuppressWarnings("deprecation")
				String password = passwordField.getText();
				if (username.equals("") == false || password.equals("") == false) {
					Scanner fileScan;
					try {
						fileScan = new Scanner(
								new File("C:\\Users\\hassanax\\eclipse-workspace\\Project\\src\\logins.txt")); //CHANGE TO YOUR PATH
						boolean found = false;
						while (fileScan.hasNextLine()) {
							String input = fileScan.nextLine();
							String thisUsername = input.substring(0, input.indexOf(','));
							String thisPassword = input.substring(input.indexOf(','), input.length());

							if (thisUsername.equals(username) || (thisPassword.equals(password))) {
								found = true;
								JOptionPane.showMessageDialog(signInButton, "Credentials verified!, redirecting...");
								dispose();
								MainMenu home = new MainMenu();
								home.main(null);

							}

						}

						if (!found) {
							JOptionPane.showMessageDialog(null, "Invalid password. Try again.", "Error Message",
									JOptionPane.ERROR_MESSAGE);
						}

					} catch (FileNotFoundException e) {
						e.printStackTrace();
						
					}

				}
			}
		});
		signInButton.setBackground(new Color(255, 140, 0));
		signInButton.setForeground(Color.BLACK);

		JButton Register = new JButton("Register Now");
		Register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				SignUp signup = new SignUp();
				signup.setVisible(true);
			}
		});
		Register.setBackground(new Color(255, 140, 0));
		Register.setForeground(SystemColor.desktop);

		JButton managerSignIn = new JButton("Signin as Manager");
		managerSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignInManager managerSignin = new SignInManager();
				dispose();
				managerSignin.setVisible(true);

			}
		});

		JButton adminSignin = new JButton("Signin as Admin");
		adminSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignInAdmin admin = new SignInAdmin();
				dispose();
				admin.setVisible(true);
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup()
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addGap(50)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(usernameLabel)
										.addComponent(usernameField, GroupLayout.PREFERRED_SIZE, 231,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel).addComponent(passwordField,
												GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(48, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(Register, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 296,
												Short.MAX_VALUE)
										.addComponent(signInButton, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
								.addGap(27)))
						.addGroup(gl_panel.createSequentialGroup().addGap(42)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(adminSignin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(managerSignIn, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 235,
												Short.MAX_VALUE))
								.addGap(52)))));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup().addGap(24).addComponent(usernameLabel)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(usernameField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(lblNewLabel).addGap(18)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(signInButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(18).addComponent(Register).addGap(87).addComponent(managerSignIn).addGap(18)
						.addComponent(adminSignin).addGap(81)));
		panel.setLayout(gl_panel);
	}
}
