package tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.ControladorBBDDConcesionario;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.ControladorBBDDFabricante;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.entidades.Concesionario;
import tutorialJava.capitulo8_AWT_SWING.ejercicios.ejercicio03_GestionEntidadCoche.modelo.entidades.Fabricante;
import tutorialJava.capitulo8_AWT_SWING.utils.CacheImagenes;

public class PanelGestionConcesionario extends JPanel {



	JTextField jtfId = new JTextField();
	JTextField jtfNombre= new JTextField();
	JTextField jtfCIF= new JTextField();
	JTextField jtfLocalidad= new JTextField();
	JButton jbtNavPrimero = new JButton();
	JButton jbtNavUltimo = new JButton();
	JButton jbtNavAnterior = new JButton();
	JButton jbtNavSiguiente = new JButton();
	JButton jbtGuardar = new JButton();
	JButton jbtNuevo = new JButton();
	JButton jbtEliminar = new JButton();
	GridBagConstraints gridBagConstraints = new GridBagConstraints();
	
	Concesionario concesionario = new Concesionario();

	
	
	public PanelGestionConcesionario () {
		
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
		this.add(new JLabel("CIF:"), gridBagConstraints);
		
		colocaComponente(1, 2, GridBagConstraints.EAST, pesoCol2, 0, GridBagConstraints.HORIZONTAL);
		this.add(jtfCIF, gridBagConstraints);
		
		colocaComponente(0, 3, GridBagConstraints.EAST, pesoCol1, 0, GridBagConstraints.NONE);
		this.add(new JLabel("Localidad:"), gridBagConstraints);
		
		colocaComponente(1, 3, GridBagConstraints.EAST, pesoCol2, 0, GridBagConstraints.HORIZONTAL);
		this.add(jtfLocalidad, gridBagConstraints);
		
		
		// Incorporamos fila botones
		colocaComponente(0, 5, GridBagConstraints.NORTH, 1, 1, GridBagConstraints.BOTH);
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
		this.concesionario = new Concesionario();
		this.concesionario.setId(-1);
		this.jtfId.setText("" + -1);
		this.jtfNombre.setText("");
		this.jtfCIF.setText("");
		this.jtfLocalidad.setText("");

		// Actualizo la botonera
		this.actualizaEstadoBotonera();
	}
	
	private void actualizaEstadoBotonera () {
		if (ControladorBBDDConcesionario.getAnteriorConcesionario(this.concesionario) == null) {
			jbtNavPrimero.setEnabled(false);
			jbtNavAnterior.setEnabled(false);
		}
		else {
			jbtNavPrimero.setEnabled(true);
			jbtNavAnterior.setEnabled(true);
		}
		if (ControladorBBDDConcesionario.getSiguienteConcesionario(this.concesionario) == null) {
			jbtNavSiguiente.setEnabled(false);
			jbtNavUltimo.setEnabled(false);
		}
		else {
			jbtNavSiguiente.setEnabled(true);
			jbtNavUltimo.setEnabled(true);
		}
		if (this.concesionario.getId() != -1) {
			jbtEliminar.setEnabled(true);
		}
		else {
			jbtEliminar.setEnabled(false);
		}
	}
	
	private void navegaAPrimero () {
		concesionario = ControladorBBDDConcesionario.getPrimerConcesionario();
		cargaConcesionarioEnComponentesVisuales();
		actualizaEstadoBotonera();
	}
	
	private void navegaAUltimo () {
		concesionario = ControladorBBDDConcesionario.getUltimoConcesionario();
		cargaConcesionarioEnComponentesVisuales();
		actualizaEstadoBotonera();
	}
	
	private void navegaAAnterior () {
		concesionario = ControladorBBDDConcesionario.getAnteriorConcesionario(this.concesionario);
		cargaConcesionarioEnComponentesVisuales();
		actualizaEstadoBotonera();
	}
	
	private void navegaASiguiente () {
		concesionario = ControladorBBDDConcesionario.getSiguienteConcesionario(this.concesionario);
		cargaConcesionarioEnComponentesVisuales();
		actualizaEstadoBotonera();
	}
	
	private void cargaConcesionarioEnComponentesVisuales () {
		this.jtfId.setText("" + concesionario.getId());
		this.jtfNombre.setText(concesionario.getNombre());
		this.jtfCIF.setText(concesionario.getCif());
		this.jtfLocalidad.setText(concesionario.getLocalidad());
				
	}
	
	private void eliminar() {
		// Por regla general, siempre que eliminemos un coche navegaremos al siguiente
		// registro
		Concesionario concesionarioAEliminar = this.concesionario;
		
		// Compruebo si el coche actual es el �ltimo coche
		if (ControladorBBDDConcesionario.getUltimoConcesionario().getId() == this.concesionario.getId()) {
			navegaAAnterior();
		}
		else {
			navegaASiguiente();
		}
		
		// Finalmente elimino el coche
		ControladorBBDDConcesionario.eliminarConcesionario(concesionarioAEliminar);
		
		// Actualizo la botonera
		this.actualizaEstadoBotonera();
	}
	
	private void guardar() {
		// Es un alta nueva o una modificaci�n
		cargaConcesionarioDesdeComponentesVisuales();
		if (this.concesionario.getId() == -1) { // Alta
			ControladorBBDDConcesionario.guardarNuevoConcesionario(this.concesionario);
			this.navegaAUltimo();
		}
		else { // Modificaci�n
			ControladorBBDDConcesionario.modificarConcesionario(this.concesionario);
		}

		// Actualizo la botonera
		this.actualizaEstadoBotonera();
	}
	
	private void cargaConcesionarioDesdeComponentesVisuales () {
		this.concesionario.setCif(this.jtfCIF.getText());
		this.concesionario.setNombre(this.jtfNombre.getText());
		this.concesionario.setLocalidad(this.jtfLocalidad.getText());
	}
	

	
}
