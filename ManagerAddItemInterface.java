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

public class ManagerAddItemInterface extends JFrame {

	private JFrame frame;
	private JTextField nameText;
	private JTextField descrText;
	private JTextField priceTxt;
	private JTextField sizeText;
	private JTextField avText;
	private JTextField quantityText;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerAddItemInterface window = new ManagerAddItemInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ManagerAddItemInterface() {
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

		JLabel lblNewLabel = new JLabel("Add Item to Store");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(139, 11, 137, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel Name = new JLabel("Name");
		Name.setBounds(10, 51, 48, 14);
		frame.getContentPane().add(Name);

		JLabel description = new JLabel("Description");
		description.setBounds(10, 91, 69, 14);
		frame.getContentPane().add(description);

		JLabel Price = new JLabel("Price $");
		Price.setBounds(10, 126, 48, 14);
		frame.getContentPane().add(Price);

		JLabel Size = new JLabel("Size");
		Size.setBounds(10, 161, 48, 14);
		frame.getContentPane().add(Size);

		JLabel availability = new JLabel("Availability");
		availability.setBounds(10, 195, 69, 14);
		frame.getContentPane().add(availability);

		JLabel Quantity = new JLabel("Quantity");
		Quantity.setBounds(10, 226, 48, 14);
		frame.getContentPane().add(Quantity);

		nameText = new JTextField();
		nameText.setBounds(64, 48, 96, 20);
		frame.getContentPane().add(nameText);
		nameText.setColumns(10);

		descrText = new JTextField();
		descrText.setColumns(10);
		descrText.setBounds(64, 88, 96, 20);
		frame.getContentPane().add(descrText);

		priceTxt = new JTextField();
		priceTxt.setColumns(10);
		priceTxt.setBounds(64, 123, 96, 20);
		frame.getContentPane().add(priceTxt);

		sizeText = new JTextField();
		sizeText.setColumns(10);
		sizeText.setBounds(64, 158, 96, 20);
		frame.getContentPane().add(sizeText);

		avText = new JTextField();
		avText.setColumns(10);
		avText.setBounds(64, 189, 96, 20);
		frame.getContentPane().add(avText);

		quantityText = new JTextField();
		quantityText.setColumns(10);
		quantityText.setBounds(64, 223, 96, 20);
		frame.getContentPane().add(quantityText);

		JButton addItemBtn = new JButton("Add");
		addItemBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String itemName = nameText.getText();
				String description = descrText.getText();
				String price = priceTxt.getText();
				String size = sizeText.getText();
				String availability = avText.getText();
				String quantity = quantityText.getText();

				if (!itemName.equals("") || !description.equals("") || !price.equals("") || !size.equals("")
						|| !availability.equals("") || !quantity.equals("")) {
					int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to add this item?",
							"Select an Option...", JOptionPane.YES_NO_CANCEL_OPTION);
					if (input == JOptionPane.YES_OPTION) {
						try {
							String filename = "C:\\Users\\hassanax\\eclipse-workspace\\Project\\src\\items.txt";
							FileWriter fileWriter = new FileWriter(filename, true);
							fileWriter.write("\n" + itemName + ",'" + description + "'," + price + "," + size + ","
									+ availability + "," + quantity);
							System.out.println();
							fileWriter.close();
						} catch (IOException ioe) {
							System.err.println("IOException: " + ioe.getMessage());
						}
						JOptionPane.showMessageDialog(addItemBtn, "Item added!");
						dispose();

					}

				} else {
					JOptionPane.showMessageDialog(null, "Missing/Invalid Inputs. Please Try again.", "Error Message",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		addItemBtn.setBounds(267, 87, 89, 23);
		frame.getContentPane().add(addItemBtn);

		JButton resetBtn = new JButton("Reset");
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameText.setText(null);
				descrText.setText(null);
				priceTxt.setText(null);
				sizeText.setText(null);
				avText.setText(null);
				quantityText.setText(null);
			}
		});
		resetBtn.setBounds(267, 126, 89, 23);
		frame.getContentPane().add(resetBtn);

		JButton goBackBtn = new JButton("Go Back");
		goBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame.dispose();
				ManagerInterface MI = new ManagerInterface();
				MI.main(null);
			}
		});
		goBackBtn.setBounds(267, 172, 89, 23);
		frame.getContentPane().add(goBackBtn);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
