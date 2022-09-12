import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class MainMenu extends JFrame {

	private static final long serialVersionUID = 8162721888757789509L;
	private JFrame frame;
	private JTextField textField;
	public static List<String> myCart = new ArrayList<String>();


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MainMenu() {
		initialize();
	}

	
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(null);

		JButton AddBTN = new JButton("Add");
		AddBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddingInterface adding = new AddingInterface();
				adding.setVisible(true);
				myCart.add("Roasted Chicken, $10.99, 1000 Grams, Yes");
			}
		});
		AddBTN.setBackground(Color.YELLOW);
		AddBTN.setBounds(10, 64, 69, 23);
		frame.getContentPane().add(AddBTN);

		JButton AddBTN_1 = new JButton("Add");
		AddBTN_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddingInterface adding = new AddingInterface();
				adding.setVisible(true);
				myCart.add("Turkey Breast, $10.99, 300 Grams, Yes");

			}
		});
		AddBTN_1.setBackground(Color.YELLOW);
		AddBTN_1.setBounds(116, 64, 69, 23);
		frame.getContentPane().add(AddBTN_1);

		JButton AddBTN_2 = new JButton("Add");
		AddBTN_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddingInterface adding = new AddingInterface();
				adding.setVisible(true);
				myCart.add("Apple, $10.99, 500 Grams, Yes");

			}
		});
		AddBTN_2.setBackground(Color.YELLOW);
		AddBTN_2.setBounds(235, 64, 69, 23);
		frame.getContentPane().add(AddBTN_2);

		JButton AddBTN_2_1 = new JButton("Add");
		AddBTN_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddingInterface adding = new AddingInterface();
				adding.setVisible(true);
				myCart.add("White Toast, $10.99, 300 Grams, Yes");

			}
		});
		AddBTN_2_1.setBackground(Color.YELLOW);
		AddBTN_2_1.setBounds(359, 64, 69, 23);
		frame.getContentPane().add(AddBTN_2_1);

		JButton AddBTN_3 = new JButton("Add");
		AddBTN_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddingInterface adding = new AddingInterface();
				adding.setVisible(true);
				myCart.add("Batteries, $10.99, 250 Grams, Yes");

			}
		});
		AddBTN_3.setBackground(Color.YELLOW);
		AddBTN_3.setBounds(235, 160, 69, 23);
		frame.getContentPane().add(AddBTN_3);

		JButton AddBTN_3_1 = new JButton("Add");
		AddBTN_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddingInterface adding = new AddingInterface();
				adding.setVisible(true);
				myCart.add("Dishwasher Soap, $10.99, 1000 Grams, Yes");

			}
		});
		AddBTN_3_1.setBackground(Color.YELLOW);
		AddBTN_3_1.setBounds(116, 160, 69, 23);
		frame.getContentPane().add(AddBTN_3_1);

		JButton AddBTN_3_2 = new JButton("Add");
		AddBTN_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddingInterface adding = new AddingInterface();
				adding.setVisible(true);
				myCart.add("Ground Cinnamon, $10.99, 250 Grams, Yes");

			}
		});
		AddBTN_3_2.setBackground(Color.YELLOW);
		AddBTN_3_2.setBounds(10, 160, 69, 23);
		frame.getContentPane().add(AddBTN_3_2);

		JButton AddBTN_3_3 = new JButton("Add");
		AddBTN_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddingInterface adding = new AddingInterface();
				adding.setVisible(true);
				myCart.add("Plates, $10.99, 100 Grams, Yes");

			}
		});
		AddBTN_3_3.setBackground(Color.YELLOW);
		AddBTN_3_3.setBounds(359, 160, 69, 23);
		frame.getContentPane().add(AddBTN_3_3);

		JLabel item1 = new JLabel("Roasted Chicken");
		item1.setBounds(10, 39, 82, 14);
		frame.getContentPane().add(item1);

		JLabel item2 = new JLabel("Turkey Breast");
		item2.setBounds(116, 39, 69, 14);
		frame.getContentPane().add(item2);

		JLabel item3 = new JLabel("Apple");
		item3.setHorizontalAlignment(SwingConstants.TRAILING);
		item3.setBounds(235, 39, 48, 14);
		frame.getContentPane().add(item3);

		JLabel item4 = new JLabel("White Toast");
		item4.setBounds(369, 39, 69, 14);
		frame.getContentPane().add(item4);

		JLabel item5 = new JLabel("Ground Cinnamon");
		item5.setBounds(10, 135, 87, 14);
		frame.getContentPane().add(item5);

		JLabel item6 = new JLabel("Dishwasher Soap");
		item6.setBounds(116, 135, 105, 14);
		frame.getContentPane().add(item6);

		JLabel item7 = new JLabel("Batteries");
		item7.setBounds(246, 135, 48, 14);
		frame.getContentPane().add(item7);

		JLabel item8 = new JLabel("Plates");
		item8.setBounds(369, 135, 48, 14);
		frame.getContentPane().add(item8);

		JButton btnCartView = new JButton("View Cart");
		btnCartView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Cart myCart = new Cart();
				myCart.setVisible(true);
				myCart.main(null);
			}
		});
		btnCartView.setBounds(339, 220, 89, 23);
		frame.getContentPane().add(btnCartView);

		JButton PreferencesButton = new JButton("Change Preferences");
		PreferencesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PreferencesInterface pref = new PreferencesInterface();
				pref.setVisible(true);
				frame.dispose();
			}
		});
		PreferencesButton.setBounds(273, 7, 155, 23);
		frame.getContentPane().add(PreferencesButton);

		JButton btnNewButton = new JButton("Sign Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Select an Option...",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (input == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(btnNewButton, "You've been logged out, good bye!");
					dispose();
					SignIn goback = new SignIn();
					goback.setVisible(true);
				}

			}

		});
		btnNewButton.setBounds(25, 220, 127, 23);
		frame.getContentPane().add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(10, 8, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// read each word in file items.txt and return true if the item is there...
				String item = textField.getText();

				if (item.equals("")) {
					Scanner fileScan;
					try {
						fileScan = new Scanner(
								new File("C:\\Users\\hassanax\\eclipse-workspace\\Project\\src\\items.txt"));
						boolean found = false; // added this variable
						while (fileScan.hasNextLine()) {
							String input = fileScan.nextLine();
							String thisItem = input.substring(0, input.indexOf(','));

							if (thisItem.equalsIgnoreCase(item)) {
								found = true;
								JOptionPane.showMessageDialog(btnNewButton_1, "Item Found!");
								MainMenu home = new MainMenu();
								home.main(null);
								textField.setText(null);

							}

						}

						if (!found) {
							JOptionPane.showMessageDialog(null, "Item Not Found. Try again.", "Error Message",
									JOptionPane.ERROR_MESSAGE);
							textField.setText(null);

						}

					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				} else {
					JOptionPane.showMessageDialog(null, "item not found. Try again.", "Error Message",
							JOptionPane.ERROR_MESSAGE);
					textField.setText(null);

				}
			}
		});
		btnNewButton_1.setBounds(108, 7, 96, 23);
		frame.getContentPane().add(btnNewButton_1);

	}

}
