package formulario_windowbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class DATOS_DE_DEPARTAMENTOS {

	private JFrame frmEjercicio;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DATOS_DE_DEPARTAMENTOS window = new DATOS_DE_DEPARTAMENTOS();
					window.frmEjercicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DATOS_DE_DEPARTAMENTOS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjercicio = new JFrame();
		frmEjercicio.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getStyle() | Font.BOLD, lblNewLabel.getFont().getSize() + 10f));
		lblNewLabel.setBounds(0, 11, 691, 49);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmEjercicio.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 153));
		panel.setBounds(54, 109, 575, 225);
		frmEjercicio.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo Departamento:");
		lblNewLabel_1.setFont(lblNewLabel_1.getFont().deriveFont(lblNewLabel_1.getFont().getStyle() | Font.BOLD, lblNewLabel_1.getFont().getSize() + 6f));
		lblNewLabel_1.setBounds(71, 35, 214, 44);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre Departamento:");
		lblNewLabel_1_1.setFont(lblNewLabel_1_1.getFont().deriveFont(lblNewLabel_1_1.getFont().getStyle() | Font.BOLD, lblNewLabel_1_1.getFont().getSize() + 6f));
		lblNewLabel_1_1.setBounds(71, 90, 214, 44);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Localidad Departamento:");
		lblNewLabel_1_2.setFont(lblNewLabel_1_2.getFont().deriveFont(lblNewLabel_1_2.getFont().getStyle() | Font.BOLD, lblNewLabel_1_2.getFont().getSize() + 6f));
		lblNewLabel_1_2.setBounds(71, 145, 237, 44);
		panel.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(255, 153, 255));
		textField.setBounds(305, 44, 86, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(305, 102, 214, 32);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(305, 157, 214, 32);
		panel.add(textField_2);
		
		JButton btnNewButton = new JButton("Insertar Datos");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(btnNewButton.getFont().deriveFont(btnNewButton.getFont().getStyle() | Font.BOLD, btnNewButton.getFont().getSize() + 6f));
		btnNewButton.setBounds(116, 366, 190, 35);
		frmEjercicio.getContentPane().add(btnNewButton);
		
		JButton btnLimpiarDatos = new JButton("Limpiar Datos");
		btnLimpiarDatos.setBackground(new Color(255, 255, 255));
		btnLimpiarDatos.setFont(btnLimpiarDatos.getFont().deriveFont(btnLimpiarDatos.getFont().getStyle() | Font.BOLD, btnLimpiarDatos.getFont().getSize() + 6f));
		btnLimpiarDatos.setBounds(382, 366, 190, 35);
		frmEjercicio.getContentPane().add(btnLimpiarDatos);
	}
}
