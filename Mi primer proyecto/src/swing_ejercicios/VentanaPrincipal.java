package swing_ejercicios;

import java.awt.Color;import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

	
	public VentanaPrincipal () {
		super ("Ventana");
		
		// Tama�o por defecto, basado en los valores est�ticos de esta misma clase
		setDimensionesBasicas();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Construcci�n elementos b�sicos sobre el ContentPanel
		this.setContentPane(getPanelPrincipal());
		
	}
	
	
	private JTabbedPane getPanelPrincipal () {
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		
		JPanel panel = new JPanel();
		//panel.setBackground(Color.RED);
		panel.setLayout(new FlowLayout());
		
		JLabel jlb = new JLabel();
		
		jlb.setText("Hola");
		
		panel.add(jlb);
		
		JTextField jtf = new JTextField();
		
		jtf.setColumns(40);
		jtf.setText("");
		
		panel.add(jtf);
		
		JButton jbt = new JButton("Aceptar");
		
		JCheckBox jcb = new JCheckBox("Soy un checkbox");
		
		jbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String str = ("Contenido del JTexfield: "+ jtf.getText() + " y el valor del check es "+jcb.isSelected());
				JOptionPane.showMessageDialog(null, str);
				
			}
		});
		
				
		/**
		 * 
		 */
		
		panel.add(jcb);
		
		panel.add(jbt);
		
		/**
		 * 
		 */
		
		tabbedPane.add("01", panel);
		
		return tabbedPane;
	}
	
	
	
	
	private void setDimensionesBasicas () {
		this.setExtendedState(JFrame.NORMAL);
		this.setBounds(0, 0, 800, 600);
	}
	
}
