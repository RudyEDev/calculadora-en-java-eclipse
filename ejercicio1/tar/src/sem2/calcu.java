package sem2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class calcu extends JFrame {

	private JPanel contentPane;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcu frame = new calcu();
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
	public calcu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}
	
	
	 Clase  pública Calculadora  extiende  JFrame {

		 panel de contenido JPanel  privado ;
		 JTextField  privado txtPantalla ;
		
		// VARIABLES
		doble  numero1 ;
		doble  numero2 ;
		 resultado doble ;
		 Operación de cadena ;
		
		public  static  void  main ( String [] args ) {
			Cola de eventos . invocarLater ( nuevo  ejecutable () {
				 ejecución de vacío  público () {
					prueba {
						Calculadora  frame = new  Calculadora ();
						marco _ setVisible ( verdadero );
					} captura ( Excepción  e ) {
						mi . imprimirStackTrace ();
					}
				}
			});
		}

		/**
		 * Crear el marco.
		 */
		 Calculadora pública () {
			
			setTitle ( "Calculadora" );
			setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
			establecerLímites ( 100 , 100 , 251 , 360 );
			contentPane = new  JPanel ();
			panel de contenido . setBackground ( nuevo  color ( 224 , 255 , 255 ));
			panel de contenido . setBorder ( new  EmptyBorder ( 5 , 5 , 5 , 5 ));
			setContentPane ( panel de contenido );
			panel de contenido . setLayout ( nulo );
			
			
			
			txtPantalla = nuevo  JTextField ();
			txtPantalla . setHorizontalAlignment ( Constantes de Oscilación . DERECHA );
			txtPantalla . setFont ( nueva  Fuente ( "Arial" , Fuente . BOLD , 18 ));
			txtPantalla . establecerLímites ( 10 , 11 , 208 , 42 );
			panel de contenido . add ( txtPantalla );
			txtPantalla . establecerColumnas ( 10 );
			
			
			JButton  btnLimpiar = new  JButton ( "C" );
			btnLimpiar . addActionListener ( nuevo  ActionListener () {
				public  void  actionPerformed ( ActionEvent  e ) {
					txtPantalla . establecerTexto ( "" );
				}
			});
			btnLimpiar . setForeground ( nuevo  color ( 255 , 0 , 0 ));
			btnLimpiar . setFont ( nueva  Fuente ( "Arial" , Fuente . BOLD , 17 ));
			btnLimpiar . establecerLímites ( 163 , 64 , 57 , 42 );
			panel de contenido . agregar ( btnLimpiar );
			
			JButton  btn3 = nuevo  JButton ( "3" );
			btn3 . addActionListener ( nuevo  ActionListener () {
				public  void  actionPerformed ( ActionEvent  e ) {
					//NUMERO 3
					Cadena  IngreseNumero = txtPantalla . obtenerTexto () + btn3 . obtenerTexto ();
					txtPantalla . establecerTexto ( IngreseNumero );
				}
			});
			btn3 . setFont ( nueva  Fuente ( "Arial" , Fuente . BOLD , 18 ));
			btn3 . establecerLímites ( 120 , 117 , 45 , 36 );
			panel de contenido . añadir ( btn3 );
			
			JButton  btn2 = nuevo  JButton ( "2" );
			btn2 _ addActionListener ( nuevo  ActionListener () {
				public  void  actionPerformed ( ActionEvent  e ) {
					//NUMERO 2
					
					Cadena  IngreseNumero = txtPantalla . obtenerTexto () + btn2 . obtenerTexto ();
					txtPantalla . establecerTexto ( IngreseNumero );
				}
			});
			btn2 _ setFont ( nueva  Fuente ( "Arial" , Fuente . BOLD , 18 ));
			btn2 _ establecerLímites ( 65 , 117 , 45 , 36 );
			panel de contenido . añadir ( btn2 );
			
			JButton btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//NUMERO 1
					String IngreseNumero = txtPantalla.getText() + btn1.getText();
					txtPantalla.setText(IngreseNumero);
					
				}
			});
			btn1.setFont(new Font("Arial", Font.BOLD, 18));
			btn1.setBounds(10, 117, 45, 36);
			contentPane.add(btn1);
			
			JButton btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//NUMERO 6
					String IngreseNumero = txtPantalla.getText() + btn6.getText();
					txtPantalla.setText(IngreseNumero);
				}
			});
			btn6.setFont(new Font("Arial", Font.BOLD, 18));
			btn6.setBounds(120, 164, 45, 36);
			contentPane.add(btn6);
			
			JButton btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//NUMERO 5
					String IngreseNumero = txtPantalla.getText() + btn5.getText();
					txtPantalla.setText(IngreseNumero);
				}
			});
			btn5.setFont(new Font("Arial", Font.BOLD, 18));
			btn5.setBounds(65, 164, 45, 36);
			contentPane.add(btn5);
			
			JButton btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//NUMERO 4
					String IngreseNumero = txtPantalla.getText() + btn4.getText();
					txtPantalla.setText(IngreseNumero);
				}
			});
			btn4.setFont(new Font("Arial", Font.BOLD, 18));
			btn4.setBounds(10, 164, 45, 36);
			contentPane.add(btn4);
			
			JButton btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//NUMERO 9
					String IngreseNumero = txtPantalla.getText() + btn9.getText();
					txtPantalla.setText(IngreseNumero);
				}
			});
			btn9.setFont(new Font("Arial", Font.BOLD, 18));
			btn9.setBounds(120, 211, 45, 36);
			contentPane.add(btn9);
			
			JButton btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//NUMERO 8
					String IngreseNumero = txtPantalla.getText() + btn8.getText();
					txtPantalla.setText(IngreseNumero);
				}
			});
			btn8.setFont(new Font("Arial", Font.BOLD, 18));
			btn8.setBounds(65, 211, 45, 36);
			contentPane.add(btn8);
			
			JButton btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//NUMERO 7
					String IngreseNumero = txtPantalla.getText() + btn7.getText();
					txtPantalla.setText(IngreseNumero);
				}
			});
			btn7.setFont(new Font("Arial", Font.BOLD, 18));
			btn7.setBounds(10, 211, 45, 36);
			contentPane.add(btn7);
			
			JButton btnCero = new JButton("0");
			btnCero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//CERO
					String IngreseNumero = txtPantalla.getText() + btnCero.getText();
					txtPantalla.setText(IngreseNumero);
				}
			});
			btnCero.setFont(new Font("Arial", Font.BOLD, 18));
			btnCero.setBounds(63, 258, 45, 36);
			contentPane.add(btnCero);
			
			JButton btnPunto = new JButton(".");
			btnPunto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//PUNTO
					String IngreseNumero = txtPantalla.getText() + btnPunto.getText();
					txtPantalla.setText(IngreseNumero);
				}
			});
			btnPunto.setForeground(new Color(255, 0, 0));
			btnPunto.setFont(new Font("Arial", Font.BOLD, 23));
			btnPunto.setBounds(8, 258, 45, 36);
			contentPane.add(btnPunto);
			
			
			
			JButton btnSuma = new JButton("+");
			btnSuma.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//SUMA
					numero1 = Double.parseDouble(txtPantalla.getText());
					txtPantalla.setText("");;
					operacion ="+";
				}
			});
			btnSuma.setForeground(Color.RED);
			btnSuma.setFont(new Font("Arial", Font.BOLD, 18));
			btnSuma.setBounds(173, 117, 45, 36);
			contentPane.add(btnSuma);
			
			JButton btnResta = new JButton("-");
			btnResta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//RESTA
					numero1 = Double.parseDouble(txtPantalla.getText());
					txtPantalla.setText("");;
					operacion ="-";
				}
			});
			btnResta.setForeground(Color.RED);
			btnResta.setFont(new Font("Arial", Font.BOLD, 18));
			btnResta.setBounds(175, 164, 45, 36);
			contentPane.add(btnResta);
			
			JButton btnMulti = new JButton("x");
			btnMulti.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//MULTIPLICACIÓN
					numero1 = Double.parseDouble(txtPantalla.getText());
					txtPantalla.setText("");;
					operacion ="*";
				}
			});
			btnMulti.setForeground(Color.RED);
			btnMulti.setFont(new Font("Arial", Font.BOLD, 18));
			btnMulti.setBounds(173, 211, 45, 36);
			contentPane.add(btnMulti);
			
			JButton btnDivi = new JButton("/");
			btnDivi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//DIVICIÓN
					numero1 = Double.parseDouble(txtPantalla.getText());
					txtPantalla.setText("");;
					operacion ="/";
				}
			});
			btnDivi.setForeground(Color.RED);
			btnDivi.setFont(new Font("Arial", Font.BOLD, 18));
			btnDivi.setBounds(173, 258, 45, 36);
			contentPane.add(btnDivi);
			
			JButton btnIgual = new JButton("=");
			btnIgual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String seleccionar;
					numero2 = Double.parseDouble(txtPantalla.getText());
					
					if(operacion == "+") {
						resultado = numero1+numero2;
						seleccionar = String.format("%.0f",resultado);
						txtPantalla.setText(seleccionar);
					}
					
					else if(operacion == "-") {
						resultado = numero1-numero2;
						seleccionar = String.format("%.0f",resultado);
						txtPantalla.setText(seleccionar);
					}
					
					else if(operacion == "*") {
						resultado = numero1*numero2;
						seleccionar = String.format("%.0f",resultado);
						txtPantalla.setText(seleccionar);
					}
					
					else if(operacion == "/") {
						resultado = numero1/numero2;
						seleccionar = String.format("%.2f",resultado);
						txtPantalla.setText(seleccionar);
					}
				}
			});
			btnIgual.setForeground(Color.RED);
			btnIgual.setFont(new Font("Arial", Font.BOLD, 18));
			btnIgual . establecerLímites ( 120 , 258 , 45 , 36 );
			panel de contenido . agregar ( btnIgual );
			
			
		}
	}

}
