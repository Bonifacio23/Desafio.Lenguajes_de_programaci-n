package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Programadores extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Programadores dialog = new Programadores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Programadores() {
		setModal(true);
		setBounds(100, 100, 828, 626);
		getContentPane().setLayout(null);
		{
			lblNewLabel = new JLabel("DESARROLLADORES DEL PROGRAMA");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel.setBounds(222, 23, 390, 19);
			getContentPane().add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Félix Jesús Bonifacio Cotrina (N00559691)");
			lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD, 13));
			lblNewLabel_1.setBounds(21, 73, 247, 19);
			getContentPane().add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Jeremy Miguel Pacheco Aparco (N00533213) ");
			lblNewLabel_2.setFont(new Font("Sylfaen", Font.BOLD, 13));
			lblNewLabel_2.setBounds(497, 73, 269, 19);
			getContentPane().add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Sergio Joaquín Marcoz Otárola (N00542504)");
			lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 13));
			lblNewLabel_3.setBounds(21, 324, 274, 19);
			getContentPane().add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("Gustavo Vladimir Nolazco Quisuruco (N00556126)");
			lblNewLabel_4.setFont(new Font("Sylfaen", Font.BOLD, 13));
			lblNewLabel_4.setBounds(486, 324, 299, 19);
			getContentPane().add(lblNewLabel_4);
		}
		{
			lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setIcon(new ImageIcon(Programadores.class.getResource("/imagen/Compañero trabajo 1 (1).jpg")));
			lblNewLabel_5.setBounds(497, 341, 299, 235);
			getContentPane().add(lblNewLabel_5);
		}
		{
			lblNewLabel_6 = new JLabel("");
			lblNewLabel_6.setIcon(new ImageIcon(Programadores.class.getResource("/imagen/Foto mia trabajo 1.jpg")));
			lblNewLabel_6.setBounds(10, 353, 301, 223);
			getContentPane().add(lblNewLabel_6);
		}
		{
			lblNewLabel_7 = new JLabel("");
			lblNewLabel_7.setIcon(new ImageIcon(Programadores.class.getResource("/imagen/Compañero trabajo 2 (1).jpg")));
			lblNewLabel_7.setBounds(475, 89, 321, 224);
			getContentPane().add(lblNewLabel_7);
		}
		{
			lblNewLabel_8 = new JLabel("");
			lblNewLabel_8.setIcon(new ImageIcon(Programadores.class.getResource("/imagen/Compañero trabajo 3.jpg")));
			lblNewLabel_8.setBounds(20, 89, 291, 229);
			getContentPane().add(lblNewLabel_8);
		}
	}
}
