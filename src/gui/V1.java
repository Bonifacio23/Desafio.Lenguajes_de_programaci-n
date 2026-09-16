package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Arreglopacientes;
import Clases.Pacientes;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.security.auth.callback.TextOutputCallback;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNombre;
	private JLabel lblNombre_2;
	private JLabel lblEdad;
	private JLabel lblHora;	
	private JLabel lblDni_1;
	private JLabel lblDia;
	private JLabel lblPago;
	private JTextField txtNomb;
	private JTextField txtCaso;
	private JTextField txtEdad;
	private JTextField txtDni;
	private JTextField txtDía;
	private JTextField txtHora;
	private JTextField txtPago;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnReportar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("CENTRO DE SALUD  “BREÑA”");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
			lblNewLabel.setBounds(159, 0, 403, 64);
			contentPane.add(lblNewLabel);
		}
		{
			lblNombre = new JLabel("Nombre: ");
			lblNombre.setFont(new Font("Verdana", Font.BOLD, 14));
			lblNombre.setBounds(27, 79, 74, 14);
			contentPane.add(lblNombre);
		}
		{
			lblNombre_2 = new JLabel("Caso: ");
			lblNombre_2.setFont(new Font("Verdana", Font.BOLD, 14));
			lblNombre_2.setBounds(252, 79, 82, 14);
			contentPane.add(lblNombre_2);
		}
		{
			lblEdad = new JLabel("Edad: ");
			lblEdad.setFont(new Font("Verdana", Font.BOLD, 14));
			lblEdad.setBounds(468, 79, 82, 14);
			contentPane.add(lblEdad);
		}
		{
			lblHora = new JLabel("Hora:");
			lblHora.setFont(new Font("Verdana", Font.BOLD, 14));
			lblHora.setBounds(468, 124, 82, 14);
			contentPane.add(lblHora);
		}
		{
			lblDni_1 = new JLabel("DNI:");
			lblDni_1.setFont(new Font("Verdana", Font.BOLD, 14));
			lblDni_1.setBounds(39, 124, 45, 14);
			contentPane.add(lblDni_1);
		}
		{
			lblDia = new JLabel("Día:");
			lblDia.setFont(new Font("Verdana", Font.BOLD, 14));
			lblDia.setBounds(252, 124, 82, 14);
			contentPane.add(lblDia);
		}
		{
			lblPago = new JLabel("Pago:");
			lblPago.setFont(new Font("Verdana", Font.BOLD, 14));
			lblPago.setBounds(37, 166, 51, 18);
			contentPane.add(lblPago);
		}
		{
			txtNomb = new JTextField();
			txtNomb.setBounds(102, 79, 140, 20);
			contentPane.add(txtNomb);
			txtNomb.setColumns(10);
		}
		{
			txtCaso = new JTextField();
			txtCaso.setBounds(297, 78, 161, 20);
			contentPane.add(txtCaso);
			txtCaso.setColumns(10);
		}
		{
			txtEdad = new JTextField();
			txtEdad.setBounds(523, 75, 86, 20);
			contentPane.add(txtEdad);
			txtEdad.setColumns(10);
		}
		{
			txtDni = new JTextField();
			txtDni.setColumns(10);
			txtDni.setBounds(101, 124, 141, 20);
			contentPane.add(txtDni);
		}
		{
			txtDía = new JTextField();
			txtDía.setBounds(297, 123, 161, 20);
			contentPane.add(txtDía);
			txtDía.setColumns(10);
		}
		{
			txtHora = new JTextField();
			txtHora.setBounds(523, 123, 86, 20);
			contentPane.add(txtHora);
			txtHora.setColumns(10);
		}
		{
			txtPago = new JTextField();
			txtPago.setBounds(102, 168, 112, 20);
			contentPane.add(txtPago);
			txtPago.setColumns(10);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(27, 256, 668, 171);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnReportar = new JButton("Reportar");
			btnReportar.addActionListener(this);
			btnReportar.setBackground(Color.YELLOW);
			btnReportar.setForeground(Color.BLACK);
			btnReportar.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnReportar.setBounds(39, 209, 99, 23);
			contentPane.add(btnReportar);
		}
		{
			btnAñadir = new JButton("Añadir");
			btnAñadir.addActionListener(this);
			btnAñadir.setForeground(Color.BLACK);
			btnAñadir.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnAñadir.setBackground(Color.GREEN);
			btnAñadir.setBounds(222, 209, 99, 23);
			contentPane.add(btnAñadir);
		}
		{
			btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(this);
			btnBuscar.setForeground(Color.BLACK);
			btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnBuscar.setBackground(Color.CYAN);
			btnBuscar.setBounds(399, 209, 99, 23);
			contentPane.add(btnBuscar);
		}
		{
			btnEliminar = new JButton("Eliminar");
			btnEliminar.addActionListener(this);
			btnEliminar.setForeground(Color.BLACK);
			btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnEliminar.setBackground(Color.RED);
			btnEliminar.setBounds(577, 209, 99, 23);
			contentPane.add(btnEliminar);
		}
         Listado();
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
		if (e.getSource() == btnAñadir) {
			do_btnAñadir_actionPerformed(e);
		}
		if (e.getSource() == btnReportar) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	Arreglopacientes aps=new Arreglopacientes();
	private JButton btnAñadir;
	private JButton btnBuscar;
	private JButton btnEliminar;
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Listado();
		Imprimir("Cantidad de Pacientes: "+aps.Tamaño());
		Imprimir("El promedio de Edades es:"+aps.PromedioEdad());
		Imprimir("El Ingreso total es: "+aps.IngresosTotales());
	
		

		

		
	}
	protected void do_btnAñadir_actionPerformed(ActionEvent e) {
		String dniTexto = txtDni.getText().trim();
		if (!dniTexto.matches("\\d{8}")) {
		    JOptionPane.showMessageDialog(this, "El DNI debe tener exactamente 8 dígitos.");
		    return;
		}
		int dni = Integer.parseInt(dniTexto);

		if (aps.Buscar(dni) != null) {
		    JOptionPane.showMessageDialog(this, "El DNI " + dni + " ya está registrado. Ingrese otro.");
		    return;
		}

		String nomb = txtNomb.getText().trim();
		if (!nomb.isEmpty()) {
		    nomb = nomb.substring(0, 1).toUpperCase() + nomb.substring(1).toLowerCase();
		}
		String caso = txtCaso.getText().trim();
		if (!caso.isEmpty()) {
		    caso = caso.substring(0, 1).toUpperCase() + caso.substring(1).toLowerCase();
		}
		String edadTexto = txtEdad.getText().trim();

		if (!edadTexto.matches("\\d{1,3}")) {
		    JOptionPane.showMessageDialog(this, "La edad debe ser un número válido.");
		    return;
		}

		int edad = Integer.parseInt(edadTexto);

		if (edad < 0 || edad > 120) {
		    JOptionPane.showMessageDialog(this, "La edad debe estar entre 0 y 120 años.");
		    return;
		}

		String diaTexto = txtDía.getText().trim();
		if (!diaTexto.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {
		    JOptionPane.showMessageDialog(this, "El día debe tener el formato dd/mm/aaaa, ejemplo: 12/12/2026.");
		    return;
		}
		String dia = diaTexto;

		String horaTexto = txtHora.getText().trim();
		if (!horaTexto.matches("([01]\\d|2[0-3]):[0-5]\\d")){
			JOptionPane.showMessageDialog(this,"La hora debe tener el formato HH:MM, ejemplo: 12:20." );
			return;
		}
		String hora = horaTexto;

		String pagoTexto = txtPago.getText().trim().replace("S/", "").replace("S/.", "").trim();
		if (!pagoTexto.matches("\\d+(\\.\\d+)?")) {
		    JOptionPane.showMessageDialog(this, "El pago debe ser un número válido (ejemplo: 15.5).");
		    return;
		}
		double pago = Double.parseDouble(pagoTexto);
		
		Pacientes pac= new Pacientes(nomb, caso, edad, dni, hora, dia, pago);
		
		aps.Adicionar(pac);
		Listado();
		
		txtNomb.setText("");
		txtCaso.setText("");
		txtEdad.setText("");
		txtDni.setText("");
		txtDía.setText("");
		txtHora.setText("");
		txtPago.setText("");
		txtNomb.requestFocus();
	
		
	}
	
	void Listado() {
		txtS.setText("");
		Imprimir("================================================================================================");
		Imprimir("N°\tNombre\tCaso\tEdad\tDNI\tDía\tHora\tPago");
		Imprimir("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i =0;i<aps.Tamaño();i++) {
			Pacientes x=aps.Obtener(i);
			String orden=aps.Registro(i);
			Imprimir(orden+"\t"+x.getNombre()+"\t"+x.getCaso()+"\t"+x.getEdad()+"\t"+x.getDni()+"\t"+x.getDía()+"\t"+x.getHora()+"\tS/"+ x.getPago());
		}
	}

	void Imprimir(String s) {
		txtS.append(s + "\n");
	}

	
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		String dniTexto = txtDni.getText().trim();

		if (!dniTexto.matches("\\d{8}")) {
		    JOptionPane.showMessageDialog(this, "El DNI debe tener exactamente 8 dígitos numéricos.");
		    return;
		}
		int dni =Integer.parseInt(txtDni.getText());
		
		Pacientes p =aps.Buscar(dni);
		
		if (p != null) {
			txtS.setText("");
			Imprimir("================================================================================================");
			Imprimir("\t <-DATOS DEL PACIENTE SELECCIONADO->");
			Imprimir("Nombre:\t" + p.getNombre());
			Imprimir("Caso:\t" + p.getCaso());
			Imprimir("Edad:\t" + p.getEdad());
			Imprimir("DNI:\t" + p.getDni());
			Imprimir("Día:\t" + p.getDía());
			Imprimir("Hora:\t" + p.getHora());
			Imprimir("Pago:\tS/." + p.getPago());	
	}
	else {
			JOptionPane.showMessageDialog(this, "El paciente que usted busca"+"("+dni+")" +"no se ha encontrado");
			
		}
		
		
		
		
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		String dniTexto = txtDni.getText().trim();

		if (!dniTexto.matches("\\d{8}")) {
		    JOptionPane.showMessageDialog(this, "El DNI debe tener exactamente 8 dígitos numéricos.");
		    return;
		}
		int dni = Integer.parseInt(txtDni.getText());
		Pacientes p = aps.Buscar(dni);
		
		if (p != null) {
			aps.Eliminar(p);
			Listado();
			txtDni.setText("");
		} 
	  else {
			JOptionPane.showMessageDialog(this, "El paciente que usted busca"+"("+dni+")" +"no se ha encontrado");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
