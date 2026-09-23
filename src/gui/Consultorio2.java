package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Consultorio2 extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel lblConsultorio;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblMedicinaGeneral;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblPediatra;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Consultorio2 dialog = new Consultorio2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Consultorio2() {
		setModal(true);
		setBounds(100, 100, 1032, 410);
		getContentPane().setLayout(null);
		{
			lblConsultorio = new JLabel("PISO 2");
			lblConsultorio.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblConsultorio.setBounds(465, 11, 79, 19);
			getContentPane().add(lblConsultorio);
		}
		{
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(Consultorio2.class.getResource("/imagen/Traumatologo (1).jpg")));
			lblNewLabel.setBounds(10, 69, 234, 252);
			getContentPane().add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(Consultorio2.class.getResource("/imagen/Cardiólogo (1).jpg")));
			lblNewLabel_1.setBounds(777, 69, 234, 252);
			getContentPane().add(lblNewLabel_1);
		}
		{
			lblMedicinaGeneral = new JLabel("Traumatología");
			lblMedicinaGeneral.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblMedicinaGeneral.setBounds(10, 49, 221, 19);
			getContentPane().add(lblMedicinaGeneral);
		}
		{
			lblNewLabel_2 = new JLabel("Nombre: Diego Alejandro Fernández Vargas");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_2.setBounds(244, 130, 242, 19);
			getContentPane().add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Consultorio: B201\r\n");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_3.setBounds(244, 150, 221, 19);
			getContentPane().add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("Horario: 8 a. m. - 8 p. m.");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_4.setBounds(244, 172, 221, 19);
			getContentPane().add(lblNewLabel_4);
		}
		{
			lblNewLabel_5 = new JLabel("DNI: 45395835");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_5.setBounds(244, 194, 221, 19);
			getContentPane().add(lblNewLabel_5);
		}
		{
			lblNewLabel_6 = new JLabel("Teléfono: 953 259 989");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_6.setBounds(244, 214, 221, 19);
			getContentPane().add(lblNewLabel_6);
		}
		{
			lblPediatra = new JLabel("Cardiología");
			lblPediatra.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblPediatra.setBounds(894, 49, 221, 19);
			getContentPane().add(lblPediatra);
		}
		{
			lblNewLabel_7 = new JLabel("Nombre: Beto Luis García Mendoza\r\n");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_7.setBounds(584, 130, 234, 19);
			getContentPane().add(lblNewLabel_7);
		}
		{
			lblNewLabel_8 = new JLabel("Consultorio: B202\r\n\r\n\r\n");
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_8.setBounds(675, 150, 109, 19);
			getContentPane().add(lblNewLabel_8);
		}
		{
			lblNewLabel_9 = new JLabel("Horario: 6 a. m. - 9 p. m.");
			lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_9.setBounds(639, 172, 137, 19);
			getContentPane().add(lblNewLabel_9);
		}
		{
			lblNewLabel_10 = new JLabel("DNI: 41249538");
			lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_10.setBounds(686, 194, 89, 19);
			getContentPane().add(lblNewLabel_10);
		}
		{
			lblNewLabel_11 = new JLabel("Teléfono: 974 776 389");
			lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_11.setBounds(639, 214, 128, 19);
			getContentPane().add(lblNewLabel_11);
		}
	}
}
