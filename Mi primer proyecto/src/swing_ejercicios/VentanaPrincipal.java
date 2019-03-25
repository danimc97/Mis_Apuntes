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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class VentanaPrincipal extends JFrame {

	
	String combo[] = new String[] {"Ciudad1","Ciudad2"};
	private static char digitosHexadecimales[] = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	
	
	public VentanaPrincipal () {
		super ("Ventana");
		
		// Tama�o por defecto, basado en los valores est�ticos de esta misma clase
		setDimensionesBasicas();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		tabbedPane.add("01", getPanelTab01());
		tabbedPane.add("02", getPanelTab02());
		
		this.setContentPane(tabbedPane);
		
	}
	
	
	private JPanel getPanelTab01 () {	
		
		
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
		
		/**
		 * 
		 */
		
		jbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String str = ("Contenido del JTexfield: "+ jtf.getText() + " y el valor del check es "+jcb.isSelected());
				JOptionPane.showMessageDialog(null, str);
				
			}
		});
		
		jcb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {				
				JOptionPane.showMessageDialog(null, "Ha cambiado el estado del checkbox a "+jcb.isSelected());				
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
		
		return panel;
	}
	
	/**
	 * 
	 * @return
	 */
	
	private JPanel getPanelTab02 () {	
		
		
		JPanel panel = new JPanel();
		//panel.setBackground(Color.RED);
		panel.setLayout(new FlowLayout());
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		
		JLabel jlb = new JLabel();
		
		jlb.setText("Usuario: ");
		
		panel.add(jlb);
		
		JTextField jtf = new JTextField();
		
		jtf.setColumns(40);
		jtf.setText("");
		
		panel.add(jtf);
		
		
		/**
		 * 
		 * 
		 * 
		 */
		
		JLabel jlbp = new JLabel();
		
		jlbp.setText("Contraseña: ");
		
		panel.add(jlbp);
		
		JPasswordField jpf = new JPasswordField();
		jpf.setColumns(40);
		panel.add(jpf);
		
		/**
		 * 
		 * 
		 */
		
		JComboBox jcb = new JComboBox (combo);
		panel.add(jcb);
		
		/**
		 * 
		 * 
		 * 
		 * 
		 */
		JList jl = new JList(combo);
		panel.add(jl);
		
		/**
		 * 
		 * 
		 * 
		 */
		
		JButton jb = new JButton("Aceptar");
		panel.add(jb);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.decode(getColorAzar()));
			}
		});
		
		jcb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "El valor ha cambiado a "+jcb.getSelectedItem());
				
			}
		});
		
		return panel;
	}
	
	
	
	
	private void setDimensionesBasicas () {
		this.setExtendedState(JFrame.NORMAL);
		this.setBounds(0, 0, 800, 600);
	}
	
	
	
	
	private static String getColorAzar () {
		StringBuffer sb = new StringBuffer ("#");
		for (int i = 0; i < 6; i++) {
			sb.append(digitosHexadecimales[Utils.obtenerNumeroAzar(0, digitosHexadecimales.length-1)]);
		}
		return sb.toString();
	}
	
}
