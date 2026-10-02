package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Clases.Medico;
import Clases.Pacientes;

public class Receta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtSfecha;
	private JTextArea txtShora;
	private JTextArea txtSdni;
	private JTextArea txtSedad;
	private JTextArea txtSapellidos;
	private JTextArea txtSnombres;
	private JTextArea txtSpago;
	private JTextArea txtScaso;
	private JTextArea txtSdoctor;
	private JTextArea txtRecet;
	private V1 ventana1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receta frame = new Receta(null, null, null);
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
	public Receta(V1 v1, Pacientes pacientes, Medico medico) {	
		this.ventana1 = v1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Generar Receta Médica");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(200, 54, 247, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDni.setBounds(22, 143, 27, 25);
		contentPane.add(lblDni);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellidos.setBounds(197, 141, 67, 25);
		contentPane.add(lblApellidos);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombres.setBounds(199, 171, 67, 25);
		contentPane.add(lblNombres);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEdad.setBounds(20, 173, 44, 25);
		contentPane.add(lblEdad);
		
		txtSfecha = new JTextArea();
		txtSfecha.setEditable(false);
		txtSfecha.setBounds(22, 11, 122, 22);
		contentPane.add(txtSfecha);
		
		txtShora = new JTextArea();
		txtShora.setEditable(false);
		txtShora.setBounds(494, 11, 129, 22);
		contentPane.add(txtShora);
		
		txtSdni = new JTextArea();
		txtSdni.setEditable(false);
		txtSdni.setBounds(58, 144, 129, 22);
		contentPane.add(txtSdni);
		
		txtSedad = new JTextArea();
		txtSedad.setEditable(false);
		txtSedad.setBounds(58, 172, 129, 22);
		contentPane.add(txtSedad);
		
		txtSapellidos = new JTextArea();
		txtSapellidos.setEditable(false);
		txtSapellidos.setBounds(260, 141, 353, 22);
		contentPane.add(txtSapellidos);
		
		txtSnombres = new JTextArea();
		txtSnombres.setEditable(false);
		txtSnombres.setBounds(260, 172, 353, 22);
		contentPane.add(txtSnombres);
		
		JLabel lblPago = new JLabel("Pago:");
		lblPago.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPago.setBounds(22, 210, 44, 25);
		contentPane.add(lblPago);
		
		txtSpago = new JTextArea();
		txtSpago.setEditable(false);
		txtSpago.setBounds(68, 211, 73, 22);
		contentPane.add(txtSpago);
		
		txtScaso = new JTextArea();
		txtScaso.setEditable(false);
		txtScaso.setBounds(71, 269, 542, 22);
		contentPane.add(txtScaso);
		
		JLabel lblCaso = new JLabel("Caso:");
		lblCaso.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCaso.setBounds(22, 268, 67, 25);
		contentPane.add(lblCaso);
		
		JLabel lblCentroDeSalud = new JLabel("Centro de Salud \"Breña\"");
		lblCentroDeSalud.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblCentroDeSalud.setBounds(231, 77, 194, 36);
		contentPane.add(lblCentroDeSalud);
		
		JLabel lblReceta = new JLabel("Receta:");
		lblReceta.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblReceta.setBounds(22, 302, 67, 25);
		contentPane.add(lblReceta);
		
		JLabel lblDoctor = new JLabel("Doctor:");
		lblDoctor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDoctor.setBounds(21, 413, 67, 25);
		contentPane.add(lblDoctor);
		
		txtSdoctor = new JTextArea();
		txtSdoctor.setEditable(false);
		txtSdoctor.setBounds(82, 414, 447, 22);
		contentPane.add(txtSdoctor);
		
		JLabel lblPaciente = new JLabel("Paciente:");
		lblPaciente.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPaciente.setBounds(19, 112, 122, 25);
		contentPane.add(lblPaciente);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuardarEnTxt();
				
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnGuardar.setBounds(175, 483, 89, 23);
		contentPane.add(btnGuardar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 326, 578, 84);
		contentPane.add(scrollPane);
		
		JTextArea txtRec = new JTextArea();
		scrollPane.setViewportView(txtRec);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VolverV1();
				
	        }
				
			
				
			
		});
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVolver.setBounds(310, 484, 89, 23);
		contentPane.add(btnVolver);
		
		
		
		if (pacientes !=null && medico != null) {
			
			txtSdni.setText(String.valueOf(pacientes.getDni()));
			txtSapellidos.setText(pacientes.getApell());
			txtSnombres.setText(pacientes.getNombre());
			txtSedad.setText(String.valueOf(pacientes.getEdad()));
			txtSpago.setText(String.valueOf(pacientes.getPago()));
			txtSfecha.setText(pacientes.getDía());
			txtShora.setText(pacientes.getHora());
			txtScaso.setText(pacientes.getCaso());
			txtSdoctor.setText(medico.toString());
		
		}
	}
	
	private void GuardarEnTxt() {
	    String dni = txtSdni.getText().trim();
	    String recetaTexto = txtRecet.getText().trim();

	    if (recetaTexto.isEmpty()) {
	        JOptionPane.showMessageDialog(this, "Ingresar la receta médica");
	        return;
	    }
	    
	    File carpeta = new File("recetasDatos");
	    if (!carpeta.exists()) {
	        carpeta.mkdirs();
	    }
	    
	    if (archivoRecetaActual == null) {
	        int contadorReceta = 1;
	        File[] archivosExistentes = carpeta.listFiles();
	        if (archivosExistentes != null) {
	            for (File f : archivosExistentes) {
	                if (f.getName().startsWith("Receta_" + dni + "_")) {
	                    contadorReceta++;
	                }
	            }
	        }
	        String nombreArchivo = "Receta_" + dni + "_" + contadorReceta + ".txt";
	        archivoRecetaActual = new File(carpeta, nombreArchivo);
	    }
	    try (PrintWriter writer = new PrintWriter(new FileWriter(archivoRecetaActual))) {
	        writer.println("==================================================");
	        writer.println("               RECETA MÉDICA                      ");
	        writer.println("==================================================");
	        writer.println("FECHA / HORA:  " + txtSfecha.getText() + " " + txtShora.getText());
	        writer.println("DNI:           " + dni);
	        writer.println("PACIENTE:      " + txtSnombres.getText() + " " + txtSapellidos.getText());
	        writer.println("EDAD:          " + txtSedad.getText() + " años");
	        writer.println("CASO / MOTIVO: " + txtScaso.getText());
	        writer.println("MÉDICO:        " + txtSdoctor.getText());
	        writer.println("PAGO:          S/. " + txtSpago.getText());
	        writer.println("--------------------------------------------------");
	        writer.println("INDICACIONES / MEDICAMENTOS:");
	        writer.println(recetaTexto);
	        writer.println("==================================================");

	        JOptionPane.showMessageDialog(this, 
	            "Receta guardada/actualizada con éxito en:\n" + 
	            carpeta.getName() + "/" + archivoRecetaActual.getName());
	        for (int i = 0; i < V1.aps.Tamaño(); i++) {
	        	if(V1.aps.Obtener(i).getDni()==Integer.parseInt(dni)) {
	        		V1.aps.Obtener(i).setAtendido(true);
	                break;
	            }
	        }
	        V1.instancia.Listado();
	    } catch (IOException ex) {
	        JOptionPane.showMessageDialog(this, "Error al guardar la receta: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	    }	
	    
	}
		
	
	private void VolverV1() {
		if (ventana1 != null) {
			ventana1.setVisible(true);
		}
		this.dispose(); 
	}
		
	private File archivoRecetaActual = null;
		
	
	
	
	

	
}
	
	






