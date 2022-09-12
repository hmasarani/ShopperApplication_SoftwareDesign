import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

// store attributes are as follows: 
/**
 * 
 * @author hassanax int storeNo; boolean availibility; double openingHour;
 *         double closingHour; String storeManager;
 *
 */

public class AdminAddStoreInterface extends JFrame {

	private JFrame frame;
	private JTextField nameText;
	private JTextField descrText;
	private JTextField priceTxt;
	private JTextField sizeText;
	private JTextField avText;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAddStoreInterface window = new AdminAddStoreInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AdminAddStoreInterface() {
		initialize();
	}

	// each item has the following attributes
	/**
	 * String name; String description; double price; double size; boolean
	 * availability; int quantity;
	 * 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().setLayout(null);

		JLabel addStore = new JLabel("Add Store");
		addStore.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addStore.setBounds(182, 11, 137, 14);
		frame.getContentPane().add(addStore);

		JLabel storeID = new JLabel("Store ID");
		storeID.setBounds(10, 51, 48, 14);
		frame.getContentPane().add(storeID);

		JLabel opening = new JLabel("Opening");
		opening.setBounds(10, 101, 69, 14);
		frame.getContentPane().add(opening);

		JLabel Closing = new JLabel("Closing");
		Closing.setBounds(228, 101, 48, 14);
		frame.getContentPane().add(Closing);

		JLabel Manager = new JLabel("Manager");
		Manager.setBounds(10, 141, 48, 14);
		frame.getContentPane().add(Manager);

		JLabel availability = new JLabel("Availability");
		availability.setBounds(216, 141, 56, 14);
		frame.getContentPane().add(availability);

		nameText = new JTextField();
		nameText.setBounds(64, 48, 96, 20);
		frame.getContentPane().add(nameText);
		nameText.setColumns(10);

		descrText = new JTextField();
		descrText.setColumns(10);
		descrText.setBounds(64, 98, 96, 20);
		frame.getContentPane().add(descrText);

		priceTxt = new JTextField();
		priceTxt.setColumns(10);
		priceTxt.setBounds(275, 98, 96, 20);
		frame.getContentPane().add(priceTxt);

		sizeText = new JTextField();
		sizeText.setColumns(10);
		sizeText.setBounds(64, 138, 96, 20);
		frame.getContentPane().add(sizeText);

		avText = new JTextField();
		avText.setColumns(10);
		avText.setBounds(275, 138, 96, 20);
		frame.getContentPane().add(avText);

		JButton addItemBtn = new JButton("Add");
		addItemBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String storeID = nameText.getText();
				String opening = descrText.getText();
				String closing = priceTxt.getText();
				String manager = sizeText.getText();
				String availability = avText.getText();

				if (storeID.equals("") == false || opening.equals("") == false || closing.equals("") == false
						|| manager.equals("") == false || availability.equals("") == false) {
					int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to add this new Store?",
							"Select an Option...", JOptionPane.YES_NO_CANCEL_OPTION);
					if (input == JOptionPane.YES_OPTION) {
						try {
							String filename = "C:\\Users\\hassanax\\eclipse-workspace\\Project\\src\\StoreList.txt";
							FileWriter fileWriter = new FileWriter(filename, true);
							fileWriter.write("\n" + storeID + "," + opening + "," + closing + "," + manager + ","
									+ availability);
							fileWriter.close();
						} catch (IOException ioe) {
							System.err.println("IOException: " + ioe.getMessage());
						}
						JOptionPane.showMessageDialog(addItemBtn, "Store added!");
						frame.dispose();
						AdminInterface AI = new AdminInterface();
						AI.main(null);
					}

				} else {
					JOptionPane.showMessageDialog(null, "Invalid Inputs. Please Try again.", "Error Message",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		addItemBtn.setBounds(290, 218, 89, 23);
		frame.getContentPane().add(addItemBtn);

		JButton resetBtn = new JButton("Reset");
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameText.setText(null);
				descrText.setText(null);
				priceTxt.setText(null);
				sizeText.setText(null);
				avText.setText(null);
			}
		});
		resetBtn.setBounds(21, 218, 89, 23);
		frame.getContentPane().add(resetBtn);

		JButton goBackBtn = new JButton("Go Back");
		goBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame.dispose();
				AdminInterface MI = new AdminInterface();
				MI.main(null);
			}
		});
		goBackBtn.setBounds(160, 218, 89, 23);
		frame.getContentPane().add(goBackBtn);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
