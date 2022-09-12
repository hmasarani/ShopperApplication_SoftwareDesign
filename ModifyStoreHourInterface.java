import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class ModifyStoreHourInterface extends JFrame {

	private JFrame frame;
	private JTextField openingText;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyStoreHourInterface window = new ModifyStoreHourInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public ModifyStoreHourInterface() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.getContentPane().setForeground(new Color(173, 216, 230));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modify Store Hours");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(132, 11, 152, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel openinglbl = new JLabel("New Opening");
		openinglbl.setBounds(10, 52, 79, 14);
		frame.getContentPane().add(openinglbl);
		
		JLabel ClosingText = new JLabel("New Closing");
		ClosingText.setBounds(10, 116, 70, 14);
		frame.getContentPane().add(ClosingText);
		
		openingText = new JTextField();
		openingText.setBounds(93, 49, 96, 20);
		frame.getContentPane().add(openingText);
		openingText.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(93, 113, 96, 20);
		frame.getContentPane().add(textField_1);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String opening = openingText.getText();
				String closing = textField_1.getText();
				if(opening.equals("") == false && closing.equals("") == false) {
					PrintWriter writer;
					try {
						writer = new PrintWriter("C:\\Users\\hassanax\\eclipse-workspace\\Project\\src\\Store.txt");
						writer.print("");
						writer.close();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try
					{
					    String filename= "C:\\Users\\hassanax\\eclipse-workspace\\Project\\src\\Store.txt";
					    FileWriter fw = new FileWriter(filename,true); 
					    fw.write(opening + "," + closing);
					    System.out.println();
					    fw.close();
					}
					catch(IOException ioe)
					{
					    System.err.println("IOException: " + ioe.getMessage());
					}
					JOptionPane.showMessageDialog(submitButton, "Store Hour Successfully modified!");
					dispose(); 
					openingText.setText(null);
					textField_1.setText(null);

					
				}
				else {
					 JOptionPane.showMessageDialog(null,
						      "Missing input. Try again.",
						      "Error Message",
						      JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		submitButton.setBounds(238, 72, 89, 23);
		frame.getContentPane().add(submitButton);
		
		JButton goBackBtn = new JButton("Go Back");
		goBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame.dispose();
				ManagerInterface AI = new ManagerInterface(); 
				AI.main(null);
			}
		});
		goBackBtn.setBounds(10, 231, 89, 23);
		frame.getContentPane().add(goBackBtn);
	}
}
