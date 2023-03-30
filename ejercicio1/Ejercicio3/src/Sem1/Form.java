package Sem1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JTextField;

public class Form extends JFrame {
	
	private JPanel contentPane1;
	private JButton btnNewbutton;
	private JLabel lblNewLabel;	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane1 = new JPanel();
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		
		JButton btnNewButton = new JButton("Hola!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Bienvenido a Java");
					

				
			}
		});
		btnNewButton.setBounds(88, 65, 108, 35);
		contentPane1.add(btnNewButton);
		
		
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(88, 147, 124, 35);
		contentPane1.add(lblNewLabel);
		

	}
}
