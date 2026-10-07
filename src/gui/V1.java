	package gui;
	
	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import Clases.Arreglopacientes;
import Clases.GestorMedicos;
import Clases.Medico;
import Clases.Pacientes;
	public class V1 extends JFrame implements ActionListener {
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JLabel lblNewLabel;
		private JLabel lblNombre;
		private JLabel lblNombre_2;
		private JLabel lblEdad;
		private JLabel lblDni_1;
		private JLabel lblPago;
		private JTextField txtNomb;
		private JTextField txtCaso;
		private JTextField txtEdad;
		private JTextField txtDni;
		private JTextField txtDía;
		private JDateChooser dateChooser;
		private JTextField txtPago;
		private JScrollPane scrollPane;
		private JTextArea txtS;
		private JButton btnReportar;
		public static V1 instancia;
		private JTable tabla;
		private DefaultTableModel modelo;
		
	
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
			instancia = this;
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
				lblNewLabel.setBounds(415, -18, 435, 86);
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
				lblEdad.setBounds(84, 131, 82, 14);
				contentPane.add(lblEdad);
			}
			{
				lblDni_1 = new JLabel("DNI:");
				lblDni_1.setFont(new Font("Verdana", Font.BOLD, 14));
				lblDni_1.setBounds(81, 78, 45, 14);
				contentPane.add(lblDni_1);
			}
			{
				dateChooser = new JDateChooser();
				dateChooser.setBounds(896, 127, 192, 20);
				dateChooser.setDateFormatString("dd/MM/yyyy");
				dateChooser.setMinSelectableDate(new java.util.Date());
				contentPane.add(dateChooser);
			}
			{
				lblPago = new JLabel("Pago:");
				lblPago.setFont(new Font("Verdana", Font.BOLD, 14));
				lblPago.setBounds(84, 173, 51, 18);
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
				txtEdad.setBounds(139, 127, 125, 20);
				contentPane.add(txtEdad);
				txtEdad.setColumns(10);
			}
			{
				txtDni = new JTextField();
				txtDni.setColumns(10);
				txtDni.setBounds(123, 75, 141, 20);
				contentPane.add(txtDni);
			}
			{
				txtDía = new JTextField();
				txtDía.setBounds(896, 127, 192, 20);
				contentPane.add(txtDía);
				txtDía.setColumns(10);
			}
			{
				txtPago = new JTextField();
				txtPago.setBounds(136, 174, 112, 20);
				contentPane.add(txtPago);
				txtPago.setColumns(10);
			}
			{
				scrollPane = new JScrollPane();
				scrollPane.setBounds(27, 256, 1126, 247);
				contentPane.add(scrollPane);

				modelo = new DefaultTableModel(
				    new String[] {"N°", "DNI", "Nombres", "Apellidos", "Caso", "Médico", "Especialidad", "Consultorio", "Edad", "Día", "Hora", "Pago"}, 0) {
				    @Override
				    public boolean isCellEditable(int fila, int columna) {
				        return false;
				    }
				};

				tabla = new JTable(modelo) {
				    @Override
				    public boolean getScrollableTracksViewportWidth() {
				        return getPreferredSize().width < getParent().getWidth();
				    }
				};
				tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				tabla.getTableHeader().setReorderingAllowed(false);
				scrollPane.setViewportView(tabla);
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
				txtApell.setBounds(506, 77, 259, 20);
				contentPane.add(txtApell);
			}
			{
				lblNewLabel_1 = new JLabel("Médico:");
				lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 14));
				lblNewLabel_1.setBounds(439, 179, 66, 16);
				contentPane.add(lblNewLabel_1);
			}
			{
				ComMed = new JComboBox<Medico>();
				ComMed.setBounds(515, 173, 227, 25);
				contentPane.add(ComMed);
				{
					lblNewLabel_2 = new JLabel("Día");
					lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 14));
					lblNewLabel_2.setBounds(842, 128, 44, 20);
					contentPane.add(lblNewLabel_2);
				}
				{
					btnReceta = new JButton("Receta");
					btnReceta.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							if (e.getSource() == btnReceta) {
							 GenerarReceta(e); 
							}
							if (e.getSource() == mntmNewMenuItem_4) {
								do_mntmNewMenuItem_4_actionPerformed(e);
							}
							
							
							
							
							
						}
					});
					btnReceta.setForeground(Color.BLACK);
					btnReceta.setFont(new Font("Tahoma", Font.BOLD, 13));
					btnReceta.setBackground(Color.WHITE);
					btnReceta.setBounds(1015, 212, 99, 23);
					contentPane.add(btnReceta);
				}
				{
					
					lblEstadoDni = new JLabel("");
				    lblEstadoDni.setFont(new Font("Tahoma", Font.BOLD, 11));
				    lblEstadoDni.setBounds(274, 78, 180, 20);
				    contentPane.add(lblEstadoDni);
				    {
				    	btnModificar = new JButton("Modificar");
				    	btnModificar.addActionListener(new ActionListener() {
				    		public void actionPerformed(ActionEvent e) {
				    		ModificarDatos(e);
				    			
				    		}
				    	});
				    	btnModificar.setForeground(Color.BLACK);
				    	btnModificar.setFont(new Font("Tahoma", Font.BOLD, 13));
				    	btnModificar.setBackground(Color.WHITE);
				    	btnModificar.setBounds(842, 212, 99, 23);
				    	contentPane.add(btnModificar);
				    }
				    txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
				        @Override
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            evaluarDniAutomatico();
				        
				        }
				    });
				}

				ComMed.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Medico elegido = (Medico) ComMed.getSelectedItem();
						if (elegido != null) {
						System.out.println(elegido.getNombre() + " - " + elegido.getEspec() + " - " + elegido.getConsul());
						
					}
					}
				});
				cargarMedicos();
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
		static public Arreglopacientes aps=new Arreglopacientes();
		private String numOrdenEnEdicion = null;
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
		private JLabel lblNewLabel_1;
		private JComboBox<Medico>ComMed;
		private JLabel lblNewLabel_2;
		private JButton btnReceta;
		private JLabel lblEstadoDni;
		private JButton btnModificar;
		protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		    Listado();
		    JOptionPane.showMessageDialog(
		        this,
		        "Cantidad de Pacientes: " + aps.Tamaño() + "\n" +
		        "El promedio de Edades es: " + String.format("%.2f", aps.PromedioEdad()) + "\n" +
		        "El Ingreso total es: S/" + String.format("%.2f", aps.IngresosTotales()),
		        "Reporte",
		        JOptionPane.INFORMATION_MESSAGE
		    );
		}
		protected void do_btnAñadir_actionPerformed(ActionEvent e) {
			String dniTexto = txtDni.getText().trim();
		    if (!dniTexto.matches("\\d{8}")) {
		        JOptionPane.showMessageDialog(this, "El DNI debe tener exactamente 8 dígitos.");
		        return;
		    }
		    int dni = Integer.parseInt(dniTexto);
		    
		    String nomb = txtNomb.getText().trim();
		    if (nomb.isEmpty() || !nomb.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
		        JOptionPane.showMessageDialog(this, "El nombre debe contener solo letras.");
		        return;
		    }
		    nomb = nomb.substring(0, 1).toUpperCase() + nomb.substring(1).toLowerCase();
		    
		    String apell = txtApell.getText().trim();
		    if (apell.isEmpty() || !apell.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
		        JOptionPane.showMessageDialog(this, "El apellido debe contener solo letras.");
		        return;
		    }
		    apell = apell.substring(0, 1).toUpperCase() + apell.substring(1).toLowerCase();
		    
		    String caso = txtCaso.getText().trim();
		    if (caso.isEmpty() || !caso.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
		        JOptionPane.showMessageDialog(this, "El caso debe contener solo letras.");
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

		    if (dateChooser.getDate() == null) {
		        JOptionPane.showMessageDialog(this, "Debe seleccionar el día de la cita.");
		        return;
		    }
		        java.util.Calendar calHoy = java.util.Calendar.getInstance();
		        calHoy.set(java.util.Calendar.HOUR_OF_DAY, 0);
		        calHoy.set(java.util.Calendar.MINUTE, 0);
		        calHoy.set(java.util.Calendar.SECOND, 0);
		        calHoy.set(java.util.Calendar.MILLISECOND, 0);

		        if (dateChooser.getDate().before(calHoy.getTime())) {
		            JOptionPane.showMessageDialog(this, "No puede seleccionar una fecha anterior al día de hoy.");
		            return;
		        
		        
		    }
		    String dia = new java.text.SimpleDateFormat("dd/MM/yyyy").format(dateChooser.getDate());
		    String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));

		    String pagoTexto = txtPago.getText().trim().replace("S/", "").replace("S/.", "").trim();
		    if (!pagoTexto.matches("\\d+(\\.\\d+)?")) {
		        JOptionPane.showMessageDialog(this, "El pago debe ser un número válido (ejemplo: 15.5).");
		        return;
		    }
		    double pago = Double.parseDouble(pagoTexto);
		    
		    Medico medicoElegido = (Medico) ComMed.getSelectedItem();
		    if (medicoElegido == null) {
		        JOptionPane.showMessageDialog(this, "Debe seleccionar un médico.");
		        return;
		    }
		    
		    if (this.numOrdenEnEdicion != null) {
		        Pacientes pacienteEditado = null;
		        int dniAnterior = -1;
		        for (int i = 0; i < aps.Tamaño(); i++) {
		            if (aps.Registro(i).equalsIgnoreCase(this.numOrdenEnEdicion)) {
		                pacienteEditado = aps.Obtener(i);
		                dniAnterior = pacienteEditado.getDni();
		                break;
		            }
		        }

		        if (pacienteEditado != null) {
		            pacienteEditado.setDni(dni);
		            pacienteEditado.setNombre(nomb);
		            pacienteEditado.setApell(apell);
		            pacienteEditado.setEdad(edad);
		            pacienteEditado.setCaso(caso);
		            pacienteEditado.setDía(dia);
		            pacienteEditado.setPago(pago);
		            pacienteEditado.setMedico(medicoElegido.getNombre() + " " + medicoElegido.getApell());
		            pacienteEditado.setEspec(medicoElegido.getEspec());
		            pacienteEditado.setConsul(medicoElegido.getConsul());
		            for (int i = 0; i < aps.Tamaño(); i++) {
		                Pacientes p = aps.Obtener(i);
		                
		                if (p.getDni() == dni || p.getDni() == dniAnterior) {
		                    p.setDni(dni);
		                    p.setNombre(nomb);
		                    p.setApell(apell);
		                    p.setEdad(edad);
		                }
		            }

		            JOptionPane.showMessageDialog(this, 
		                "La cita N° " + this.numOrdenEnEdicion + " fue actualizada correctamente.\n" +
		                "Se sincronizaron los datos personales (Nombre/Apellido/Edad) en todas las citas del DNI " + dni + ".");
		            
		            this.numOrdenEnEdicion = null; 
		        }
		    } else {
		        for (int i = 0; i < aps.Tamaño(); i++) {
		            Pacientes existente = aps.Obtener(i);
		            if (existente.getDni() == dni) {
		            	
		                nomb = existente.getNombre();
		                apell = existente.getApell();
		                edad = existente.getEdad();
		                break;
		            }
		        }

		        Pacientes pac = new Pacientes(nomb, apell, edad, dni, caso, dia, hora, pago,
		                medicoElegido.getNombre() + " " + medicoElegido.getApell(),
		                medicoElegido.getEspec(),
		                medicoElegido.getConsul());
		        aps.Adicionar(pac);
		    }
		    
		    Listado();
		    
		    txtNomb.setText("");
		    txtApell.setText("");
		    txtCaso.setText("");
		    txtEdad.setText("");
		    txtDni.setText("");
		    txtDía.setText("");
		    txtPago.setText("");
		    lblEstadoDni.setText("");
		    txtNomb.setEditable(true);
		    txtApell.setEditable(true);
		    txtEdad.setEditable(true);
		    txtDni.setEditable(true);
		    txtNomb.requestFocus();
		}
		private void cargarMedicos() {
			for (Medico m : GestorMedicos.medicos) {
			ComMed.addItem(m);
			}
			}
		
		void Listado() {
		    modelo.setRowCount(0);
		    for (int i = 0; i < aps.Tamaño(); i++) {
		        Pacientes x = aps.Obtener(i);
		        modelo.addRow(new Object[] {
		            aps.Registro(i),
		            x.getDni(),
		            x.getNombre(),
		            x.getApell(),
		            x.getCaso(),
		            x.getMedico(),
		            x.getEspec(),
		            x.getConsul(),
		            x.getEdad(),
		            x.getDía(),
		            x.getHora(),
		            String.format("S/%.2f", x.getPago())
		        });
		    }
		    AjustarColumnas();
		}
		void AjustarColumnas() {
		    for (int c = 0; c < tabla.getColumnCount(); c++) {
		        TableColumn col = tabla.getColumnModel().getColumn(c);
		        Component comp = tabla.getTableHeader().getDefaultRenderer().getTableCellRendererComponent(tabla, col.getHeaderValue(), false, false, -1, c);
		        int ancho = comp.getPreferredSize().width;
		        for (int f = 0; f < tabla.getRowCount(); f++) {
		            comp = tabla.prepareRenderer(tabla.getCellRenderer(f, c), f, c);
		            ancho = Math.max(ancho, comp.getPreferredSize().width);
		        }
		        col.setPreferredWidth(ancho + 16);
		        col.setWidth(ancho + 16);
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

		    int dni = Integer.parseInt(dniTexto);
		    boolean encontrado = false;

		    modelo.setRowCount(0);
		    for (int i = 0; i < aps.Tamaño(); i++) {
		        Pacientes p = aps.Obtener(i);
		        if (p.getDni() == dni) {
		            encontrado = true;
		            modelo.addRow(new Object[] {
		                aps.Registro(i),
		                p.getDni(),
		                p.getNombre(),
		                p.getApell(),
		                p.getCaso(),
		                p.getMedico(),
		                p.getEspec(),
		                p.getConsul(),
		                p.getEdad(),
		                p.getDía(),
		                p.getHora(),
		                String.format("S/%.2f", p.getPago())
		            });
		        }
		    }

		    if (!encontrado) {
		        Listado();
		        JOptionPane.showMessageDialog(this, "El paciente con DNI (" + dni + ") no tiene citas registradas.");
		    } else {
		        AjustarColumnas();
		    }
		}
		protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		    String numOrden = JOptionPane.showInputDialog(
		        this,
		        "Ingrese el N° de Orden de la cita que desea eliminar (Ejemplo: 0001, 0002):","Eliminar Cita",JOptionPane.QUESTION_MESSAGE
		    );

		    if (numOrden == null || numOrden.trim().isEmpty()) {
		        return;
		    }

		    numOrden = numOrden.trim();
		    Pacientes pacienteEncontrado = null;
		    for (int i = 0; i < aps.Tamaño(); i++) {
		        if (aps.Registro(i).equalsIgnoreCase(numOrden)) {
		            pacienteEncontrado = aps.Obtener(i);
		            break;
		        }
		    }

		    if (pacienteEncontrado != null) {
		        int confirmacion = JOptionPane.showConfirmDialog(
		            this,
		            "¿Está seguro de eliminar la cita N° " + numOrden + " de " + 
		            pacienteEncontrado.getNombre() + " " + pacienteEncontrado.getApell() + "?",
		            "Confirmar eliminación",
		            JOptionPane.YES_NO_OPTION,
		            JOptionPane.WARNING_MESSAGE
		        );

		        if (confirmacion == JOptionPane.YES_OPTION) {
		            aps.Eliminar(pacienteEncontrado); 
		            Listado();
		            JOptionPane.showMessageDialog(this, "La cita N° " + numOrden + " fue eliminada correctamente.");
		        }
		    } else {
		        JOptionPane.showMessageDialog(
		            this,
		            "No se encontró ninguna cita registrada con el N° de Orden: " + numOrden,
		            "Cita no encontrada",
		            JOptionPane.WARNING_MESSAGE
		        );
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
		
		protected void GenerarReceta(ActionEvent e) {
			String numOrden = JOptionPane.showInputDialog(
			        this,"Ingrese el N° de Orden de la cita (Ejm : 0001, 0002):", "Generar Receta Médica", JOptionPane.QUESTION_MESSAGE
			    );
			
			    if (numOrden == null || numOrden.trim().isEmpty()) {
			        return;
			    }
			    numOrden = numOrden.trim();
			    Pacientes pacienteEncontrado = null;
			    for (int i = 0; i < aps.Tamaño(); i++) {
			        if (aps.Registro(i).equalsIgnoreCase(numOrden)) {
			            pacienteEncontrado = aps.Obtener(i);
			            break;
			        }
			    }
			    if (pacienteEncontrado == null) {
			        JOptionPane.showMessageDialog(
			            this,
			            "No se encontró ninguna cita registrada con el N° de Orden: " + numOrden,
			            "Cita no encontrada",
			            JOptionPane.WARNING_MESSAGE
			        );
			        return;
			    }
			    
			    Medico medicoSeleccionado = (Medico) ComMed.getSelectedItem();
			    if (medicoSeleccionado == null) {
			        JOptionPane.showMessageDialog(this, "Debe seleccionar un médico del desplegable.");
			        return;
			    }
			    
			    this.setVisible(false);
			    Receta ventanaReceta = new Receta(this, pacienteEncontrado, medicoSeleccionado,numOrden);
			    ventanaReceta.setVisible(true);
		}
		
		private void evaluarDniAutomatico() {
		    String dniTexto = txtDni.getText().trim();
		    
		    if (dniTexto.matches("\\d{8}")) {
		        int dni =Integer.parseInt(dniTexto);
		        Pacientes p = aps.Buscar(dni);

		        if (p != null) {
		   
		            lblEstadoDni.setForeground(new java.awt.Color(0, 128, 0));
		            lblEstadoDni.setText("✓ DNI ya registrado");
		            
		            txtNomb.setText(p.getNombre());
		            txtApell.setText(p.getApell());
		            txtEdad.setText(String.valueOf(p.getEdad()));

		            txtNomb.setEditable(false);
		            txtApell.setEditable(false);
		            txtEdad.setEditable(false);
		            txtPago.setEditable(true);
			        txtCaso.setEditable(true);
			        dateChooser.setEnabled(true);
		            

		        } else {
		
		            lblEstadoDni.setForeground(new java.awt.Color(0, 102, 204));
		            lblEstadoDni.setText("DNI nuevo");
		            txtNomb.setText("");
		            txtApell.setText("");
		            txtEdad.setText("");
		            txtNomb.setEditable(true);
		            txtApell.setEditable(true);
		            txtEdad.setEditable(true);
		            txtPago.setEditable(true);
			        txtCaso.setEditable(true);
			        dateChooser.setEnabled(true);
		        }
		    }
		    else if(dniTexto instanceof String) {
		    	lblEstadoDni.setForeground(new java.awt.Color(200, 0, 0));
	            lblEstadoDni.setText("DNI inválido");
	            txtNomb.setText("");
	            txtApell.setText("");
	            txtEdad.setText("");
		        lblEstadoDni.setText("");
		        txtPago.setEditable(false);
		        txtCaso.setEditable(false);
		        dateChooser.setEnabled(false);
		        dateChooser.setDate(null);
		        txtNomb.setEditable(false);
		        txtApell.setEditable(false);
		        txtEdad.setEditable(false);
		    }
		    else {
		    	txtNomb.setText("");
	            txtApell.setText("");
	            txtEdad.setText("");
		        lblEstadoDni.setText("");
		        txtNomb.setEditable(true);
		        txtApell.setEditable(true);
		        txtEdad.setEditable(true);
		    }
		}
		
		protected void ModificarDatos(ActionEvent e) {
			String numOrden = JOptionPane.showInputDialog(
			        this,
			        "Ingrese el N° de Orden de la cita que desea modificar (Ejm: 0001, 0002):",
			        "Modificar Cita",
			        JOptionPane.QUESTION_MESSAGE
			    );

			    if (numOrden == null || numOrden.trim().isEmpty()) {
			        return;
			    }

			    numOrden = numOrden.trim();
			    Pacientes pacienteEncontrado = null;
			    for (int i = 0; i < aps.Tamaño(); i++) {
			        if (aps.Registro(i).equalsIgnoreCase(numOrden)) {
			            pacienteEncontrado = aps.Obtener(i);
			            break;
			        }
			    }

			    if (pacienteEncontrado == null) {
			        JOptionPane.showMessageDialog(
			            this,
			            "No se encontró ninguna cita registrada con el N° de Orden: " + numOrden,
			            "Cita no encontrada",
			            JOptionPane.WARNING_MESSAGE
			        );
			        return;
			    }

			    txtDni.setText(String.valueOf(pacienteEncontrado.getDni()));
			    txtNomb.setText(pacienteEncontrado.getNombre());
			    txtApell.setText(pacienteEncontrado.getApell());
			    txtEdad.setText(String.valueOf(pacienteEncontrado.getEdad()));
			    txtCaso.setText(pacienteEncontrado.getCaso());
			    txtPago.setText(String.format("%.2f", pacienteEncontrado.getPago()));
			    txtNomb.setEditable(true);
			    txtApell.setEditable(true);
			    txtEdad.setEditable(true);
			    txtDni.setEditable(true);
			    this.numOrdenEnEdicion = numOrden;

			    JOptionPane.showMessageDialog(
			        this,
			        "Datos cargados para la cita N° " + numOrden + ".\nRealice los cambios en el formulario y presione 'Añadir' para guardar.",
			        "Modo Edición Activado",
			        JOptionPane.INFORMATION_MESSAGE
			    );
			}
	}
