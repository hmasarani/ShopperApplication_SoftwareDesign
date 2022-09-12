import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class AdminRemoveStoreInterface extends JFrame {

	private JFrame frame;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminRemoveStoreInterface window = new AdminRemoveStoreInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AdminRemoveStoreInterface() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel removeStoreLbl = new JLabel("Remove Store by ID");
		removeStoreLbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		removeStoreLbl.setBounds(129, 11, 177, 22);
		frame.getContentPane().add(removeStoreLbl);

		JLabel lblNewLabel = new JLabel("Enter Store ID");
		lblNewLabel.setBounds(24, 107, 93, 14);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(106, 104, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton SubmitButton = new JButton("Remove Now");
		SubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String StoreID = textField.getText();
				if (StoreID.equals("") == false) {
					Scanner fileScan;
					try {
						fileScan = new Scanner(
								new File("C:\\Users\\hassanax\\eclipse-workspace\\Project\\src\\StoreList.txt"));
						boolean found = false; 
						while (fileScan.hasNextLine()) {
							String input = fileScan.nextLine();
							String thisStore = input.substring(0, input.indexOf(','));

							if (thisStore.equals(StoreID)) {
								found = true;
								JOptionPane.showMessageDialog(SubmitButton,
										"Store Removed From Database Successfully... Redirecting");
								textField.setText(null);
							}

						}
						if (!found) { 
										
							JOptionPane.showMessageDialog(null, "Item not Found. Try again.", "Error Message",
									JOptionPane.ERROR_MESSAGE);
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}

				} else {
					JOptionPane.showMessageDialog(null, "Field is Empty. Try again.", "Error Message",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		SubmitButton.setBounds(248, 103, 136, 23);
		frame.getContentPane().add(SubmitButton);

		JButton goBackBtn = new JButton("Go Back");
		goBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame.dispose();
				AdminInterface MI = new AdminInterface();
				MI.main(null);
			}
		});
		goBackBtn.setBounds(10, 232, 82, 22);
		frame.getContentPane().add(goBackBtn);
	}

}
