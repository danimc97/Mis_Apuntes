package tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.ConnectionManagerV2;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.ControladorBBDDClientes;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.ControladorBBDDCoche;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.ControladorBBDDFabricante;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.ImposibleConectarException;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.entidades.Cliente;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.entidades.Coche;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.entidades.Fabricante;
import tutorialJava.capitulo8_AWT_SWING.utils.CacheImagenes;

public class PanelGestionCliente extends JPanel {

	JTextField jtfId = new JTextField();
	JTextField jtfNombre= new JTextField();
	JTextField jtfApellidos= new JTextField();
	JTextField jtfLocalidad= new JTextField();
	JTextField jtfDniNie= new JTextField();
	JTextField jtfFechaNac= new JTextField();
	JButton jbtNavPrimero = new JButton();
	JButton jbtNavUltimo = new JButton();
	JButton jbtNavAnterior = new JButton();
	JButton jbtNavSiguiente = new JButton();
	JButton jbtGuardar = new JButton();
	JButton jbtNuevo = new JButton();
	JButton jbtEliminar = new JButton();
	GridBagConstraints gridBagConstraints = new GridBagConstraints();
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
	Date fechaParseada = null;
	
	
	
	Cliente cliente = new Cliente();

	
	
	public PanelGestionCliente () {
		
		this.maquetarVentana();
		
		navegaAPrimero();
		
	}
	
	private void maquetarVentana() {
		double pesoCol1 = 0.15, pesoCol2 = 1;
		
		this.setLayout(new GridBagLayout());

		gridBagConstraints.insets = new Insets(5, 5, 5, 5);

		// Incorporamos los components del Id
		colocaComponente(0, 0, GridBagConstraints.EAST, pesoCol1, 0, GridBagConstraints.NONE);
		this.add(new JLabel("Id:"), gridBagConstraints);
		
		colocaComponente(1, 0, GridBagConstraints.EAST, pesoCol2, 0, GridBagConstraints.HORIZONTAL);
		this.add(jtfId, gridBagConstraints);
		
		colocaComponente(0, 1, GridBagConstraints.EAST, pesoCol1, 0, GridBagConstraints.NONE);
		this.add(new JLabel("Nombre:"), gridBagConstraints);
		
		colocaComponente(1, 1, GridBagConstraints.EAST, pesoCol2, 0, GridBagConstraints.HORIZONTAL);
		this.add(jtfNombre, gridBagConstraints);
		
		colocaComponente(0, 2, GridBagConstraints.EAST, pesoCol1, 0, GridBagConstraints.NONE);
		this.add(new JLabel("Apellidos:"), gridBagConstraints);
		
		colocaComponente(1, 2, GridBagConstraints.EAST, pesoCol2, 0, GridBagConstraints.HORIZONTAL);
		this.add(jtfApellidos, gridBagConstraints);
		
		colocaComponente(0, 3, GridBagConstraints.EAST, pesoCol1, 0, GridBagConstraints.NONE);
		this.add(new JLabel("Localidad:"), gridBagConstraints);
		
		colocaComponente(1, 3, GridBagConstraints.EAST, pesoCol2, 0, GridBagConstraints.HORIZONTAL);
		this.add(jtfLocalidad, gridBagConstraints);
		
		colocaComponente(0, 4, GridBagConstraints.EAST, pesoCol1, 0, GridBagConstraints.NONE);
		this.add(new JLabel("DNI:"), gridBagConstraints);
		
		colocaComponente(1, 4, GridBagConstraints.EAST, pesoCol2, 0, GridBagConstraints.HORIZONTAL);
		this.add(jtfDniNie, gridBagConstraints);
		
		colocaComponente(0, 5, GridBagConstraints.EAST, pesoCol1, 0, GridBagConstraints.NONE);
		this.add(new JLabel("Fecha de Nacimiento:"), gridBagConstraints);
		
		colocaComponente(1, 5, GridBagConstraints.EAST, pesoCol2, 0, GridBagConstraints.HORIZONTAL);
		this.add(jtfFechaNac, gridBagConstraints);
		
		
		// Incorporamos fila botones
		colocaComponente(0, 6, GridBagConstraints.NORTH, 1, 1, GridBagConstraints.BOTH);
		gridBagConstraints.gridwidth = 2;
		this.add(getBotonera(), gridBagConstraints);		
	}
	
	
	private void colocaComponente (int gridX, int gridY, int anchor, double pesoColumna, double pesoFila, int fill) {
		gridBagConstraints.gridx = gridX;
		gridBagConstraints.gridy = gridY;
		gridBagConstraints.anchor = anchor;
		gridBagConstraints.weightx = pesoColumna;
		gridBagConstraints.weighty = pesoFila;
		gridBagConstraints.fill = fill;
		
	}

	
	private JPanel getBotonera() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		panel.setBackground(Color.yellow);
		
		// Configuramos los botones
				configuraBoton(jbtNavPrimero, "gotostart.png", new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						navegaAPrimero();
					}
				});
				configuraBoton(jbtNavAnterior, "previous.png", new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						navegaAAnterior();
					}
				});
				configuraBoton(jbtNavSiguiente, "next.png", new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						navegaASiguiente();
					}
				});
				configuraBoton(jbtNavUltimo, "gotoend.png", new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						navegaAUltimo();
					}
				});
				configuraBoton(jbtGuardar, "guardar.png", new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						guardar();
					}
				});
				configuraBoton(jbtNuevo, "nuevo.png", new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						nuevo();
					}
				});
				configuraBoton(jbtEliminar, "eliminar.png", new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						eliminar();
					}
				});
		
		//Inclu�mos los botones
		panel.add(jbtNavPrimero);
		panel.add(jbtNavAnterior);
		panel.add(jbtNavSiguiente);
		panel.add(jbtNavUltimo);
		panel.add(jbtGuardar);
		panel.add(jbtNuevo);
		panel.add(jbtEliminar);
		
		return panel;
	}
	
	private void configuraBoton (JButton jbt, String icono, ActionListener actionListener) {
		jbt.setIcon(CacheImagenes.getCacheImagenes().getIcono(icono));
		jbt.addActionListener(actionListener);
	}
	
	private void nuevo () {
		this.cliente = new Cliente();
		this.cliente.setId(-1);
		this.jtfId.setText("" + -1);
		this.jtfNombre.setText("");
		this.jtfApellidos.setText("");
		this.jtfLocalidad.setText("");
		this.jtfDniNie.setText("");
		this.jtfFechaNac.setText("");

		// Actualizo la botonera
		this.actualizaEstadoBotonera();
	}
	
	private void actualizaEstadoBotonera () {
		if (ControladorBBDDClientes.getAnteriorCliente(this.cliente) == null) {
			jbtNavPrimero.setEnabled(false);
			jbtNavAnterior.setEnabled(false);
		}
		else {
			jbtNavPrimero.setEnabled(true);
			jbtNavAnterior.setEnabled(true);
		}
		if (ControladorBBDDClientes.getSiguienteCliente(this.cliente) == null) {
			jbtNavSiguiente.setEnabled(false);
			jbtNavUltimo.setEnabled(false);
		}
		else {
			jbtNavSiguiente.setEnabled(true);
			jbtNavUltimo.setEnabled(true);
		}
		if (this.cliente.getId() != -1) {
			jbtEliminar.setEnabled(true);
		}
		else {
			jbtEliminar.setEnabled(false);
		}
	}
	
	private void navegaAPrimero () {
		cliente = ControladorBBDDClientes.getPrimerCliente();
		cargaClienteEnComponentesVisuales();
		actualizaEstadoBotonera();
	}
	
	private void navegaAUltimo () {
		cliente = ControladorBBDDClientes.getUltimoCliente();
		cargaClienteEnComponentesVisuales();
		actualizaEstadoBotonera();
	}
	
	private void navegaAAnterior () {
		cliente = ControladorBBDDClientes.getAnteriorCliente(this.cliente);
		cargaClienteEnComponentesVisuales();
		actualizaEstadoBotonera();
	}
	
	private void navegaASiguiente () {
		cliente = ControladorBBDDClientes.getSiguienteCliente(this.cliente);
		cargaClienteEnComponentesVisuales();
		actualizaEstadoBotonera();
	}
	
	private void cargaClienteEnComponentesVisuales () {
		this.jtfId.setText("" + cliente.getId());
		this.jtfNombre.setText(cliente.getNombre());
		this.jtfApellidos.setText(cliente.getApellidos());
		this.jtfLocalidad.setText(cliente.getLocalidad());
		this.jtfDniNie.setText(cliente.getDniNie());
		this.jtfFechaNac.setText(sdf.format(cliente.getFechaNac()));
				
	}
	
	private void eliminar() {
		// Por regla general, siempre que eliminemos un coche navegaremos al siguiente
		// registro
		Cliente clienteAEliminar = this.cliente;
		
		// Compruebo si el coche actual es el �ltimo coche
		if (ControladorBBDDClientes.getUltimoCliente().getId() == this.cliente.getId()) {
			navegaAAnterior();
		}
		else {
			navegaASiguiente();
		}
		
		// Finalmente elimino el coche
		ControladorBBDDClientes.eliminarCliente(clienteAEliminar);
		
		// Actualizo la botonera
		this.actualizaEstadoBotonera();
	}
	
	private void guardar() {
		// Es un alta nueva o una modificaci�n
		cargaClienteDesdeComponentesVisuales();
		if (this.cliente.getId() == -1) { // Alta
			ControladorBBDDClientes.guardarNuevoCliente(this.cliente);
			this.navegaAUltimo();
		}
		else { // Modificaci�n
			ControladorBBDDClientes.modificarCliente(this.cliente);
		}

		// Actualizo la botonera
		this.actualizaEstadoBotonera();
	}
	
	private void cargaClienteDesdeComponentesVisuales () {
		
		
		try {
			fechaParseada = sdf.parse(this.jtfFechaNac.getText());
		} catch (ParseException e) {
			System.out.println ("Error en el parseo de la fecha");
			e.printStackTrace();
		}
		
		
		
		this.cliente.setNombre(this.jtfNombre.getText());
		this.cliente.setApellidos(this.jtfApellidos.getText());
		this.cliente.setLocalidad(this.jtfLocalidad.getText());
		this.cliente.setDniNie(this.jtfDniNie.getText());
		this.cliente.setFechaNac(fechaParseada);
	}
	
}
