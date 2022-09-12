import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddingInterface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField QuantityField;

	public AddingInterface() {

		setTitle("Add Item to Cart");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAddCurrentAccount = new JLabel("Add");
		lblAddCurrentAccount.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddCurrentAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddCurrentAccount.setBounds(10, 11, 414, 34);
		contentPane.add(lblAddCurrentAccount);

		JLabel lblBalance = new JLabel("Selling price: $10.99");
		lblBalance.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblBalance.setBounds(174, 66, 110, 43);
		contentPane.add(lblBalance);

		JLabel quantity = new JLabel("Enter Quntity:");
		quantity.setFont(new Font("Tahoma", Font.PLAIN, 11));
		quantity.setBounds(10, 163, 73, 14);
		contentPane.add(quantity);

		QuantityField = new JTextField();
		QuantityField.setColumns(10);
		QuantityField.setBounds(86, 160, 254, 20);
		contentPane.add(QuantityField);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int ch = JOptionPane.showConfirmDialog(getComponent(0), "Are you sure you want to add this item?");
				if (ch == 0) {

					JOptionPane.showMessageDialog(getComponent(0), "Added!");
					dispose();
				} else {
					JOptionPane.showMessageDialog(getComponent(0), "Cancelling...");
					QuantityField.setText(null);
					dispose();
				}
				QuantityField.setText(null);

			}

		});
		btnAdd.setBounds(86, 209, 89, 23);
		contentPane.add(btnAdd);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuantityField.setText(null);

			}
		});
		btnReset.setBounds(309, 209, 89, 23);
		contentPane.add(btnReset);
	}
}
