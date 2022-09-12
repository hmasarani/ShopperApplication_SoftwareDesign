import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class AdminRemoveItemInterface extends JFrame {

	private JFrame frame;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminRemoveItemInterface window = new AdminRemoveItemInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AdminRemoveItemInterface() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Remove Item from Store");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(118, 11, 196, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel item = new JLabel("Enter Item Name: ");
		item.setBounds(159, 35, 144, 14);
		frame.getContentPane().add(item);

		textField = new JTextField();
		textField.setBounds(159, 60, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		// Remove Algorithm searches for the item name in the items text file and
		// deletes it.
		JButton Remove = new JButton("Remove");
		Remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String itemField = textField.getText();
				if (itemField.equals("") == false) {
					Scanner fileScan;
					try {
						fileScan = new Scanner(
								new File("C:\\Users\\hassanax\\eclipse-workspace\\Project\\src\\Items.txt"));
						boolean found = false;
						while (fileScan.hasNextLine()) {
							String input = fileScan.nextLine();
							String thisItem = input.substring(0, input.indexOf(','));

							if (thisItem.equals(itemField)) {
								found = true;
								File myFile = new File(
										"C:\\Users\\hassanax\\eclipse-workspace\\Project\\src\\Items.txt");
								File tempRandom = new File(
										"C:\\Users\\hassanax\\eclipse-workspace\\Project\\src\\Random.txt");
								BufferedReader read = new BufferedReader(new FileReader(myFile));
								BufferedWriter write = new BufferedWriter(new FileWriter(tempRandom));
								String removethis = thisItem;
								String thisLine;
								while ((thisLine = read.readLine()) != null) {
									String trimmedLine = thisLine.trim();
									if (trimmedLine.equals(removethis))
										continue;
									write.write(thisLine + System.getProperty("\n"));
								}
								read.close();
								write.close();
								boolean successful = tempRandom.renameTo(myFile);
								JOptionPane.showMessageDialog(Remove,
										"Item Removed From Database Successfully... Redirecting");
								textField.setText(null);

							}

						}
						if (!found) {

							JOptionPane.showMessageDialog(null, "Item not Found. Try again.", "Error Message",
									JOptionPane.ERROR_MESSAGE);
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}
		});
		Remove.setBounds(260, 104, 89, 23);
		frame.getContentPane().add(Remove);

		JButton Reset = new JButton("Reset");
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		Reset.setBounds(159, 104, 89, 23);
		frame.getContentPane().add(Reset);

		JButton goBack = new JButton("Go Back");
		goBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame.dispose();
				AdminInterface AI = new AdminInterface();
				AI.main(null);
			}
		});
		goBack.setBounds(57, 104, 89, 23);
		frame.getContentPane().add(goBack);
	}

}
