package sem1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtResultado;
	double num1;
	double num2;
	double resultado;
	String operacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	public calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 298, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtResultado = new JTextField();
		txtResultado.setDisabledTextColor(new Color(0, 0, 0));
		txtResultado.setEnabled(false);
		txtResultado.setEditable(false);
		txtResultado.setBounds(10, 11, 260, 44);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		
		
		JButton btnBorrar = new JButton("←");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String serie;
				serie = txtResultado.getText();
				
				if (serie.length() > 0) {
					serie = serie.substring(0, serie.length()-1);
					txtResultado.setText(serie);
				}
			}
		});
		btnBorrar.setBounds(10, 66, 67, 52);
		contentPane.add(btnBorrar);
		
		
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("");				
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnC.setBounds(73, 66, 67, 52);
		contentPane.add(btnC);		

		
		
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == btn0) {
					if(txtResultado.getText() == "") {
						txtResultado.setText("0");
					}
					else {
						txtResultado.setText(txtResultado.getText() + "0");
					}
				}
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn0.setBounds(10, 265, 67, 52);
		contentPane.add(btn0);
		
		
		
		final JButton btn00 = new JButton("00");
		btn00.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == btn00) {
					if(txtResultado.getText() == "") {
						txtResultado.setText("00");
					}
					else {
						txtResultado.setText(txtResultado.getText() + "00");
					}
				}				
								
			}
		});
		btn00.setBounds(137, 66, 67, 52);
		contentPane.add(btn00);
		
		
			
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == btn1) {
					if(txtResultado.getText() == "") {
						txtResultado.setText("1");
					}
					else {
						txtResultado.setText(txtResultado.getText() + "1");
					}
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn1.setBounds(10, 215, 67, 52);
		contentPane.add(btn1);
		
		
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == btn2) {
					if(txtResultado.getText() == "") {
						txtResultado.setText("2");
					}
					else {
						txtResultado.setText(txtResultado.getText() + "2");
					}
				}
			}
		});		
		
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn2.setBounds(73, 215, 67, 52);
		contentPane.add(btn2);
		
		
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == btn3) {
					if(txtResultado.getText() == "") {
						txtResultado.setText("3");
					}
					else {
						txtResultado.setText(txtResultado.getText() + "3");
					}
				}
			}
		});		
		
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn3.setBounds(137, 215, 67, 52);
		contentPane.add(btn3);
		
		
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == btn4) {
					if(txtResultado.getText() == "") {
						txtResultado.setText("4");
					}
					else {
						txtResultado.setText(txtResultado.getText() + "4");
					}
				}
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn4.setBounds(10, 165, 67, 52);
		contentPane.add(btn4);
		
		
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == btn5) {
					if(txtResultado.getText() == "") {
						txtResultado.setText("5");
					}
					else {
						txtResultado.setText(txtResultado.getText() + "5");
					}
				}
			}
		});
		btn5.setBounds(73, 165, 67, 52);
		contentPane.add(btn5);
		
		
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == btn6) {
					if(txtResultado.getText() == "") {
						txtResultado.setText("6");
					}
					else {
						txtResultado.setText(txtResultado.getText() + "6");
					}
				}
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn6.setBounds(137, 165, 67, 52);
		contentPane.add(btn6);
		
		
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == btn7) {
					if(txtResultado.getText() == "") {
						txtResultado.setText("7");
					}
					else {
						txtResultado.setText(txtResultado.getText() + "7");
					}
				}
			}
		});
		
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn7.setBounds(10, 116, 67, 52);
		contentPane.add(btn7);
		
		
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource() == btn8) {
					if(txtResultado.getText() == "") {
						txtResultado.setText("8");
					}
					else {
						txtResultado.setText(txtResultado.getText() + "8");
					}
				}
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn8.setBounds(73, 116, 67, 52);
		contentPane.add(btn8);
		
		
		
		final JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == btn9) {
					if(txtResultado.getText() == "") {
						txtResultado.setText("9");
					}
					else {
						txtResultado.setText(txtResultado.getText() + "9");
					}
				}
				
			}
		});
		btn9.setBounds(137, 116, 67, 52);
		contentPane.add(btn9);
		
		
		
		JButton btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			
		  @Override
		  public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
			  if(e.getSource() == btnPunto) {
					if(txtResultado.getText() == "") {
						txtResultado.setText(".");
					}
					else {
						txtResultado.setText(txtResultado.getText() + ".");
					}
				}				
				
			}
		});
		btnPunto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPunto.setBounds(73, 265, 67, 52);
		contentPane.add(btnPunto);
		
		 
		
		
		
		final JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

				
				num1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");;
				operacion ="+";			                  
				

				
			}		
		});
		btnSuma.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSuma.setBounds(203, 66, 67, 52);
		contentPane.add(btnSuma);
		
		
		
		final JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				num1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");;
				operacion ="-";	
				

				
			}
		});

		btnResta.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnResta.setBounds(203, 116, 67, 52);
		contentPane.add(btnResta);
		
		
		
		JButton btnMultiplicación = new JButton("*");
		btnMultiplicación.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				num1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");;
				operacion ="*";	

				
			}
		});
		btnMultiplicación.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnMultiplicación.setBounds(203, 165, 67, 52);
		contentPane.add(btnMultiplicación);
			
		
		
		JButton btnDivisión = new JButton("/");
		btnDivisión.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				num1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");;
				operacion ="/";					
				
			}
		});
		btnDivisión.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDivisión.setBounds(203, 215, 67, 52);
		contentPane.add(btnDivisión);
		
		
		
		JButton btnPorcentaje = new JButton("%");
		btnPorcentaje.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				num1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");;
				operacion ="%";	

			}
		});
		btnPorcentaje.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPorcentaje.setBounds(203, 265, 67, 52);
		contentPane.add(btnPorcentaje);
		
		
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String seleccionar;
				num2 = Double.parseDouble(txtResultado.getText());
				

					
				if(operacion == "+") {
					resultado = num1+num2;
					seleccionar = String.format("%.0f",resultado);
					txtResultado.setText(seleccionar);
				    }
					
				else if(operacion == "-") {
					resultado = num1-num2;
					seleccionar = String.format("%.0f",resultado);
					txtResultado.setText(seleccionar);
				    }
				
				else if(operacion == "*") {
					resultado = num1*num2;
					seleccionar = String.format("%.0f",resultado);
					txtResultado.setText(seleccionar);
				    }
				
				else if(operacion == "/") {
					resultado = num1/num2;
					seleccionar = String.format("%.0f",resultado);
					txtResultado.setText(seleccionar);
				    }
				
				else if(operacion == "%") {
					resultado = num1*num2/100;
					seleccionar = String.format("%.0f",resultado);
					txtResultado.setText(seleccionar);
				    }
			    }	
			    
			    	
			    			
			
		});
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnIgual.setBounds(137, 265, 67, 52);
		contentPane.add(btnIgual);
		
		

				

	}
}
