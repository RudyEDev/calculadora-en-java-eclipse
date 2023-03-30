package sem1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtField1;
	private JTextField txtField2;
	private JTextField txtRespuesta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario1 frame = new Formulario1();
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
	public Formulario1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtField1 = new JTextField();
		txtField1.setBounds(94, 25, 99, 50);
		contentPane.add(txtField1);
		txtField1.setColumns(10);
		
		txtField2 = new JTextField();
		txtField2.setBounds(227, 25, 99, 50);
		contentPane.add(txtField2);
		txtField2.setColumns(10);
		
		JButton btnSuma = new JButton("Suma");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1, num2, resp;
				
				try {
				
				num1 = Integer.parseInt(txtField1.getText());
				num2 = Integer.parseInt(txtField2.getText());
				
				resp = num1 + num2;
				
				txtRespuesta.setText(Integer.toString(resp));	
				
			    } catch (Exception ex) {
			    	JOptionPane.showMessageDialog(null, "Ingrese un valor correcto");
			       
			    }
			}
		});
		btnSuma.setBounds(109, 108, 84, 31);
		contentPane.add(btnSuma);
		
		JButton btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                int num3, num4, respu;
				
				try {
				
				num3 = Integer.parseInt(txtField1.getText());
				num4 = Integer.parseInt(txtField2.getText());
				
				respu = num3 - num4;
				
				txtRespuesta.setText(Integer.toString(respu));	
				
			    } catch (Exception ex) {
			    	JOptionPane.showMessageDialog(null, "Ingrese un valor correcto");
			       
			    }
				
			}
		});
		btnResta.setBounds(227, 108, 84, 31);
		contentPane.add(btnResta);
		
		JLabel lblNewLabel = new JLabel("La respuesta es:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(31, 164, 173, 64);
		contentPane.add(lblNewLabel);
		
		txtRespuesta = new JTextField();
		txtRespuesta.setEnabled(false);
		txtRespuesta.setEditable(false);
		txtRespuesta.setBounds(191, 180, 99, 40);
		contentPane.add(txtRespuesta);
		txtRespuesta.setColumns(10);
	}
}
