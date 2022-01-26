package com.calculadora_imc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import com.calculadora_imc.control.ImcController;

public class MainViewer {

	private JFrame AppFrame;
	private JTextField pesotextField;
	private JTextField AlturatextField;
	private JTextPane Resultpane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainViewer window = new MainViewer();
					window.AppFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainViewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AppFrame = new JFrame();
		AppFrame.setTitle("IMC APP");
		AppFrame.setBounds(100, 100, 300, 400);
		AppFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AppFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora IMC");
		lblNewLabel.setFont(new Font("Lucida Sans", Font.PLAIN, 30));
		lblNewLabel.setBounds(16, 10, 253, 25);
		AppFrame.getContentPane().add(lblNewLabel);
		
		JLabel pesoLabel_1 = new JLabel("Peso");
		pesoLabel_1.setBounds(31, 87, 61, 16);
		AppFrame.getContentPane().add(pesoLabel_1);
		
		pesotextField = new JTextField();
		pesotextField.setHorizontalAlignment(SwingConstants.CENTER);
		pesotextField.setText("0.0");
		pesotextField.setBounds(139, 82, 130, 50);
		AppFrame.getContentPane().add(pesotextField);
		pesotextField.setColumns(10);
		
		JLabel AlturaLabel_1_1 = new JLabel("Altura");
		AlturaLabel_1_1.setBounds(31, 147, 61, 16);
		AppFrame.getContentPane().add(AlturaLabel_1_1);
		
		AlturatextField = new JTextField();
		AlturatextField.setText("0.0");
		AlturatextField.setHorizontalAlignment(SwingConstants.CENTER);
		AlturatextField.setColumns(10);
		AlturatextField.setBounds(139, 142, 130, 50);
		AppFrame.getContentPane().add(AlturatextField);
		
		JButton calcularbotao = new JButton("Calcular");
		calcularbotao.setFont(new Font("Lucida Console", Font.PLAIN, 13));
		calcularbotao.setBounds(31, 205, 238, 34);
		calcularbotao.addActionListener(new ImcController(this));
		AppFrame.getContentPane().add(calcularbotao);
		
		Resultpane = new JTextPane();
		Resultpane.setBorder(new EmptyBorder(8, 8, 8, 8));
		Resultpane.setText("Result");
		Resultpane.setBounds(31, 263, 238, 50);
		AppFrame.getContentPane().add(Resultpane);

}

	public JFrame getAppFrame() {
		return AppFrame;
	}

	public void setAppFrame(JFrame appFrame) {
		AppFrame = appFrame;
	}

	public JTextField getPesotextField() {
		return pesotextField;
	}

	public void setPesotextField(JTextField pesotextField) {
		this.pesotextField = pesotextField;
	}

	public JTextField getAlturatextField() {
		return AlturatextField;
	}

	public void setAlturatextField(JTextField alturatextField) {
		AlturatextField = alturatextField;
	}

	public JTextPane getResultpane() {
		return Resultpane;
	}

	public void setResultpane(JTextPane resultpane) {
		Resultpane = resultpane;
	}
	
}
