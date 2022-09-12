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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("serial")
// some of the features and design are used from the example provided in eclass
public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JTextField emailField;
	private JPasswordField passwordField;
	private JPasswordField repeatPasswordField;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SignUp() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 603, 497);
		setTitle("Sign Up!");
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

		Label label_1 = new Label("Sign Up here");
		label_1.setForeground(new Color(255, 140, 0));
		label_1.setFont(new Font("Arial", Font.PLAIN, 20));
		label_1.setAlignment(Label.CENTER);
		panel_1.add(label_1);

		JLabel lblRentalSystem = new JLabel("Sign Up");
		lblRentalSystem.setForeground(new Color(255, 140, 0));
		lblRentalSystem.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_1.add(lblRentalSystem);

		JLabel signUpLabel = new JLabel("Sign Up");
		signUpLabel.setFont(new Font("Arial", Font.PLAIN, 13));

		JLabel usernameLabel = new JLabel("USERNAME");
		usernameLabel.setFont(new Font("Arial", Font.BOLD, 11));

		usernameField = new JTextField();
		usernameField.setColumns(10);

		emailField = new JTextField();
		emailField.setColumns(10);

		JLabel emailLabel = new JLabel("EMAIL");
		emailLabel.setFont(new Font("Arial", Font.BOLD, 11));

		passwordField = new JPasswordField();
		passwordField.setColumns(10);

		JLabel lblNewLabel = new JLabel("PASSWORD");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 11));

		repeatPasswordField = new JPasswordField();
		repeatPasswordField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("REPEAT PASSWORD");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));

		JButton signUpButton = new JButton("Sign Up");
		signUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 4 fields in total
				String username = usernameField.getText();
				String password = passwordField.getText();
				String email = emailField.getText();
				String repeatPassword = repeatPasswordField.getText();
				if (username.equals("") == false || password.equals("") == false || email.equals("") == false
						|| repeatPassword.equals("") == false) {
					if (password.equals(repeatPassword)) {
						try {
							String filename = "C:\\Users\\hassanax\\eclipse-workspace\\Project\\src\\logins.txt";
							FileWriter fileWriter = new FileWriter(filename, true);
							fileWriter.write(username + "," + password + "\n");
							System.out.println();
							fileWriter.close();
						} catch (IOException ioe) {
							System.err.println("IOException: " + ioe.getMessage());
						}
						JOptionPane.showMessageDialog(signUpButton, "Account created successfully, redirecting...");
						dispose();
						SignIn signin = new SignIn();
						signin.setVisible(true);

					} else {
						JOptionPane.showMessageDialog(null, "Error Occured, Passwords don't match: Try Again", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Error Occured, Please Try Again", "Error",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		signUpButton.setBackground(new Color(255, 140, 0));
		signUpButton.setForeground(Color.BLACK);

		JButton backButton = new JButton("Back to Login");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				SignIn signInPage = new SignIn();
				signInPage.setVisible(true);
			}
		});
		backButton.setBackground(new Color(255, 140, 0));
		backButton.setForeground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel
										.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
												.createSequentialGroup().addGap(131)
												.addComponent(
														signUpLabel, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
												.addContainerGap())
										.addGroup(
												gl_panel.createSequentialGroup().addGap(50)
														.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																.addComponent(usernameLabel)
																.addComponent(usernameField, GroupLayout.PREFERRED_SIZE,
																		231, GroupLayout.PREFERRED_SIZE)
																.addComponent(emailLabel)
																.addComponent(emailField, GroupLayout.PREFERRED_SIZE,
																		231, GroupLayout.PREFERRED_SIZE)
																.addComponent(lblNewLabel)
																.addComponent(passwordField, GroupLayout.PREFERRED_SIZE,
																		231, GroupLayout.PREFERRED_SIZE)
																.addComponent(lblNewLabel_1).addComponent(
																		repeatPasswordField, GroupLayout.PREFERRED_SIZE,
																		231, GroupLayout.PREFERRED_SIZE))
														.addGap(44))
										.addGroup(gl_panel.createSequentialGroup().addGap(26)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(backButton, Alignment.TRAILING,
																GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
														.addComponent(signUpButton, GroupLayout.DEFAULT_SIZE, 293,
																Short.MAX_VALUE))
												.addContainerGap()))));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup().addComponent(signUpLabel).addGap(8)
						.addComponent(usernameLabel).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(usernameField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(emailLabel).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(emailField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(lblNewLabel).addGap(18)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(lblNewLabel_1).addGap(18)
						.addComponent(repeatPasswordField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGap(37).addComponent(signUpButton).addGap(18).addComponent(backButton)
						.addContainerGap(76, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
	}
}
