import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerInterface extends JFrame {
	// As per requirements, we know that the manager has the ability to add items,
	// remove items, modify items and modify saleList

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerInterface window = new ManagerInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ManagerInterface() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 438, 10);
		frame.getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("You're logged in as MANAGER");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setBounds(137, 11, 177, 14);
		frame.getContentPane().add(lblNewLabel);

		JButton logOutBtn = new JButton("Log Out");
		logOutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int input = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Select an Option...",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (input == JOptionPane.YES_OPTION) {

					JOptionPane.showMessageDialog(logOutBtn, "You've been logged out, good bye!");
					dispose();
					SignIn goback = new SignIn();
					frame.setVisible(false);
					goback.setVisible(true);
				}

			}
		});
		logOutBtn.setBounds(10, 231, 89, 23);
		frame.getContentPane().add(logOutBtn);

		JButton addItemBtn = new JButton("Add Item");
		addItemBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerAddItemInterface adding = new ManagerAddItemInterface();
				frame.dispose();
				adding.main(null);
			}
		});
		addItemBtn.setBounds(116, 47, 177, 23);
		frame.getContentPane().add(addItemBtn);

		JButton removetemBtn = new JButton("Remove Item");
		removetemBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerRemoveItemInterface remove = new ManagerRemoveItemInterface();
				frame.dispose();
				remove.main(null);
			}
		});
		removetemBtn.setBounds(116, 90, 177, 23);
		frame.getContentPane().add(removetemBtn);

		JButton modifyItemInterface = new JButton("Modify Item");
		modifyItemInterface.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		modifyItemInterface.setBounds(116, 136, 177, 23);
		frame.getContentPane().add(modifyItemInterface);

		JButton modifyStoreHours = new JButton("Modify Store Hours");
		modifyStoreHours.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModifyStoreHourInterface MSHI = new ModifyStoreHourInterface();
				MSHI.main(null);
				frame.dispose();

			}
		});
		modifyStoreHours.setBounds(116, 178, 177, 23);
		frame.getContentPane().add(modifyStoreHours);

	}

}
