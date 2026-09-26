package gui;

import java.awt.EventQueue;
import java.util.HashMap;
import java.util.Map;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import Clases.Arreglopacientes;
import Clases.Pacientes;

import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.security.auth.callback.TextOutputCallback;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
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
	public static void main(String[] args) throws IOException {
		Map<String, String> usuarios = new HashMap<>();
		usuarios.put("FelixBC", "Felix200@");
		usuarios.put("JeremyPA", "Jeremy300@");
		usuarios.put("SergioMO", "Sergio400@");
		usuarios.put("GustavoNQ", "Gustavo500@");

		int intentos = 0;
		int maxIntentos = 3;
		boolean autenticado = false;

		BufferedImage imgOriginal = ImageIO.read(V1.class.getResourceAsStream("/imagen/c.png"));
		int anchoOriginal = imgOriginal.getWidth();
		int altoOriginal = imgOriginal.getHeight();
		int anchoDeseado = 450;
		int altoDeseado = (int) (altoOriginal * ((double) anchoDeseado / anchoOriginal));
		Image imgEscalada = imgOriginal.getScaledInstance(anchoDeseado, altoDeseado, Image.SCALE_SMOOTH);
		ImageIcon icono = new ImageIcon(imgEscalada);
		JLabel lblImagen = new JLabel(icono);
		lblImagen.setHorizontalAlignment(JLabel.CENTER);

		while (intentos < maxIntentos && !autenticado) {
		    JTextField txtUsuario = new JTextField();
		    JPasswordField txtContraseña = new JPasswordField();

		    JPanel panelCampos = new JPanel(new GridLayout(2, 2, 5, 5));
		    panelCampos.add(new JLabel("Usuario:"));
		    panelCampos.add(txtUsuario);
		    panelCampos.add(new JLabel("Contraseña:"));
		    panelCampos.add(txtContraseña);

		    JPanel panel = new JPanel(new BorderLayout(5, 5));
		    panel.add(lblImagen, BorderLayout.NORTH);
		    panel.add(panelCampos, BorderLayout.CENTER);

		    int okCancel = JOptionPane.showConfirmDialog(null, panel, "Inicio de sesión",
		            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

		    if (okCancel != JOptionPane.OK_OPTION) return;

		    String usuario = txtUsuario.getText();
		    String contraseña = new String(txtContraseña.getPassword());

		    if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contraseña)) {
		        autenticado = true;
		    } else {
		        intentos++;
		        int restantes = maxIntentos - intentos;
		        if (restantes > 0) {
		            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos. Te quedan " + restantes + " intento(s).");
		        } else {
		            JOptionPane.showMessageDialog(null, "Has superado el número máximo de intentos.");
		        }
		    }
		}

		if (autenticado) {
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

		}

	/**
	 * Create the frame.
	 */
	public V1() {
		setTitle("Sistema de registro de citas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1193, 575);
		{
			menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			{
				mnNewMenu = new JMenu("Desarrolladores");
				menuBar.add(mnNewMenu);
				{
					mntmNewMenuItem = new JMenuItem("Programadores");
					mntmNewMenuItem.addActionListener(this);
					mnNewMenu.add(mntmNewMenuItem);
				}
			}
			{
				mnNewMenu_1 = new JMenu("Consultorio");
				menuBar.add(mnNewMenu_1);
				{
					mntmNewMenuItem_1 = new JMenuItem("Piso 1");
					mntmNewMenuItem_1.addActionListener(this);
					mnNewMenu_1.add(mntmNewMenuItem_1);
				}
				{
					mntmNewMenuItem_2 = new JMenuItem("Piso 2");
					mntmNewMenuItem_2.addActionListener(this);
					mnNewMenu_1.add(mntmNewMenuItem_2);
				}
				{
					mntmNewMenuItem_4 = new JMenuItem("Piso 3");
					mntmNewMenuItem_4.addActionListener(this);
					mnNewMenu_1.add(mntmNewMenuItem_4);
				}
			}
		}
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("CENTRO DE SALUD  “BREÑA”");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
			lblNewLabel.setBounds(414, 3, 403, 64);
			contentPane.add(lblNewLabel);
		}
		{
			lblNombre = new JLabel("Nombres: ");
			lblNombre.setFont(new Font("Verdana", Font.BOLD, 14));
			lblNombre.setBounds(808, 75, 90, 14);
			contentPane.add(lblNombre);
		}
		{
			lblNombre_2 = new JLabel("Caso: ");
			lblNombre_2.setFont(new Font("Verdana", Font.BOLD, 14));
			lblNombre_2.setBounds(454, 131, 82, 14);
			contentPane.add(lblNombre_2);
		}
		{
			lblEdad = new JLabel("Edad: ");
			lblEdad.setFont(new Font("Verdana", Font.BOLD, 14));
			lblEdad.setBounds(172, 131, 82, 14);
			contentPane.add(lblEdad);
		}
		{
			lblHora = new JLabel("Hora:");
			lblHora.setFont(new Font("Verdana", Font.BOLD, 14));
			lblHora.setBounds(172, 174, 82, 14);
			contentPane.add(lblHora);
		}
		{
			lblDni_1 = new JLabel("DNI:");
			lblDni_1.setFont(new Font("Verdana", Font.BOLD, 14));
			lblDni_1.setBounds(169, 78, 45, 14);
			contentPane.add(lblDni_1);
		}
		{
			lblDia = new JLabel("Día:");
			lblDia.setFont(new Font("Verdana", Font.BOLD, 14));
			lblDia.setBounds(850, 128, 82, 14);
			contentPane.add(lblDia);
		}
		{
			lblPago = new JLabel("Pago:");
			lblPago.setFont(new Font("Verdana", Font.BOLD, 14));
			lblPago.setBounds(454, 172, 51, 18);
			contentPane.add(lblPago);
		}
		{
			txtNomb = new JTextField();
			txtNomb.setBounds(896, 75, 192, 20);
			contentPane.add(txtNomb);
			txtNomb.setColumns(10);
		}
		{
			txtCaso = new JTextField();
			txtCaso.setBounds(506, 126, 256, 20);
			contentPane.add(txtCaso);
			txtCaso.setColumns(10);
		}
		{
			txtEdad = new JTextField();
			txtEdad.setBounds(227, 127, 125, 20);
			contentPane.add(txtEdad);
			txtEdad.setColumns(10);
		}
		{
			txtDni = new JTextField();
			txtDni.setColumns(10);
			txtDni.setBounds(211, 75, 141, 20);
			contentPane.add(txtDni);
		}
		{
			txtDía = new JTextField();
			txtDía.setBounds(896, 127, 192, 18);
			contentPane.add(txtDía);
			txtDía.setColumns(10);
		}
		{
			txtHora = new JTextField();
			txtHora.setBounds(227, 173, 125, 20);
			contentPane.add(txtHora);
			txtHora.setColumns(10);
		}
		{
			txtPago = new JTextField();
			txtPago.setBounds(506, 173, 112, 20);
			contentPane.add(txtPago);
			txtPago.setColumns(10);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(27, 256, 1126, 247);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnReportar = new JButton("Reportar");
			btnReportar.addActionListener(this);
			btnReportar.setBackground(new Color(255, 255, 255));
			btnReportar.setForeground(Color.BLACK);
			btnReportar.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnReportar.setBounds(142, 211, 99, 23);
			contentPane.add(btnReportar);
		}
		{
			btnAñadir = new JButton("Añadir");
			btnAñadir.addActionListener(this);
			btnAñadir.setForeground(Color.BLACK);
			btnAñadir.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnAñadir.setBackground(new Color(255, 255, 255));
			btnAñadir.setBounds(325, 211, 99, 23);
			contentPane.add(btnAñadir);
		}
		{
			btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(this);
			btnBuscar.setForeground(Color.BLACK);
			btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnBuscar.setBackground(new Color(255, 255, 255));
			btnBuscar.setBounds(502, 211, 99, 23);
			contentPane.add(btnBuscar);
		}
		{
			btnEliminar = new JButton("Eliminar");
			btnEliminar.addActionListener(this);
			btnEliminar.setForeground(Color.BLACK);
			btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnEliminar.setBackground(new Color(255, 255, 255));
			btnEliminar.setBounds(680, 211, 99, 23);
			contentPane.add(btnEliminar);
		}
		{
			lblApellidos = new JLabel("Apellidos:");
			lblApellidos.setFont(new Font("Verdana", Font.BOLD, 14));
			lblApellidos.setBounds(424, 78, 91, 17);
			contentPane.add(lblApellidos);
		}
		{
			txtApell = new JTextField();
			txtApell.setColumns(10);
			txtApell.setBounds(503, 75, 259, 20);
			contentPane.add(txtApell);
		}
         Listado();
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmNewMenuItem_4) {
			do_mntmNewMenuItem_4_actionPerformed(e);
		}
		if (e.getSource() == mntmNewMenuItem_2) {
			do_mntmNewMenuItem_2_actionPerformed(e);
		}
		if (e.getSource() == mntmNewMenuItem_1) {
			do_mntmNewMenuItem_1_actionPerformed(e);
		}
		if (e.getSource() == mntmNewMenuItem) {
			do_mntmNewMenuItem_actionPerformed(e);
		}
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
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem;
	private JLabel lblApellidos;
	private JTextField txtApell;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_4;
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
		if (nomb.isEmpty()) {
		    JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.");
		    return;
		}
		if (!nomb.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
		    JOptionPane.showMessageDialog(this, "El nombre solo debe contener letras.");
		    return;
		}
		nomb = nomb.substring(0, 1).toUpperCase() + nomb.substring(1).toLowerCase();
		
		String apell = txtApell.getText().trim();
		if (apell.isEmpty()) {
			JOptionPane.showMessageDialog(this, "El apellido no puede estar vacío.");
		    return;
		}
		if (!apell.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
		    JOptionPane.showMessageDialog(this, "El apellido solo debe contener letras.");
		    return;
		}
		apell = apell.substring(0, 1).toUpperCase() + apell.substring(1).toLowerCase();
		
		String caso = txtCaso.getText().trim();
		if (caso.isEmpty()) {
			JOptionPane.showMessageDialog(this, "El caso no puede estar vacío.");
		    return;
		}
		if (!caso.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
		    JOptionPane.showMessageDialog(this, "El caso solo debe contener letras.");
		    return;
		}
		caso = caso.substring(0, 1).toUpperCase() + caso.substring(1).toLowerCase();
		
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
		
		
		Pacientes pac = new Pacientes(nomb, apell, edad, dni, caso, dia, hora, pago);
		
		aps.Adicionar(pac);
		Listado();
		
		txtNomb.setText("");
		txtApell.setText("");
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
		Imprimir("================================================================================================================================================================================");
		Imprimir(String.format("%-5s %-30s %-30s %-42s %-6s %-12s %-12s %-8s %-8s","N°","Nombres","Apellidos","Caso","Edad","DNI","Día","Hora","Pago"));
		Imprimir("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i =0;i<aps.Tamaño();i++) {
			Pacientes x=aps.Obtener(i);
			String orden=aps.Registro(i);
			Imprimir(String.format("%-5s %-30s %-30s %-42s %-6d %-12d %-12s %-8s S/%.2f", orden, x.getNombre(),x.getApell(), x.getCaso(), x.getEdad(), x.getDni(), x.getDía(), x.getHora(), x.getPago()));
			
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
			Imprimir("Nombres:\t" + p.getNombre());
			Imprimir("Apellidos:\t"+p.getApell());
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
	protected void do_mntmNewMenuItem_actionPerformed(ActionEvent e) {
	Programadores pro= new Programadores();
	pro.setVisible(true);

		
	}
	protected void do_mntmNewMenuItem_1_actionPerformed(ActionEvent e) {
	Consultorio cons= new Consultorio();
	cons.setVisible(true);
		
		
		
		
	}
	protected void do_mntmNewMenuItem_2_actionPerformed(ActionEvent e) {
	Consultorio2 cons2= new Consultorio2();
	cons2.setVisible(true);
		
		
		
	}
	protected void do_mntmNewMenuItem_4_actionPerformed(ActionEvent e) {
	Consultorio3 cons3= new Consultorio3();
	cons3.setVisible(true);
		
	}
}
