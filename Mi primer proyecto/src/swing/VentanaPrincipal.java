package swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

	
	JTextField tfId;
	JTextField tfCIF;
	JTextField tfNombre;
	
	public VentanaPrincipal () {
		super ("Ventana");
		
		// Tama�o por defecto, basado en los valores est�ticos de esta misma clase
		setDimensionesBasicas();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Construcci�n elementos b�sicos sobre el ContentPanel
		this.setContentPane(getPanelPrincipal());

	}
	
	
	private JPanel getPanelPrincipal () {
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel.add(getPanelId());
		panel.add(getPanelCIF());
		panel.add(getPanelNombre());
		panel.add(getPanelBotones());
		
		return panel;
	}
	
	
	
	private JPanel getPanelId() {		
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.YELLOW);
		
		JLabel jbl = new JLabel("Id:");
		panel.add(jbl);
		
		
		tfId = new JTextField();
		
		tfId.setColumns(20);
		panel.add(tfId);
		
		return panel;		
	}
	
	private JPanel getPanelCIF() {		
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.BLUE);
		
		JLabel jbl = new JLabel("CIF:");
		panel.add(jbl);
		
		
		tfCIF = new JTextField();
		
		tfCIF.setColumns(20);
		panel.add(tfCIF);
		
		return panel;		
	}
	
	private JPanel getPanelNombre() {		
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.GREEN);
		
		JLabel jbl = new JLabel("Nombre:");
		panel.add(jbl);
		
		
		tfNombre = new JTextField();
		
		tfNombre.setColumns(20);
		panel.add(tfNombre);
		
		return panel;		
	}
	
	private JPanel getPanelBotones() {		
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.GREEN);
		
		JButton jbt = new JButton("Guardar");
		
		jbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {				
				guardar();				
			}
		});
		
		panel.add(jbt);
		
		JButton jbte = new JButton("Eliminar registro");
		jbte.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				eliminar();
				
			}
		});
		
		panel.add(jbte);
		
		return panel;		
	}
	
	
	private void eliminar() {
		
		try {
			Connection conn = ConnectionManagerV2.getConexion();
			
			
			PreparedStatement ps = conn.prepareStatement("Select id from tutorialjavacoches.fabricante where "
					+ "id=?");
			
			
			ps.setInt(1, Integer.parseInt(tfId.getText()));
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				PreparedStatement pse = conn.prepareStatement("DELETE from tutorialjavacoches.fabricante where"
						+ " id=?");
				
				pse.setInt(1, Integer.parseInt(tfId.getText()));
				
				int registrosAfectados = pse.executeUpdate();
				
				if (registrosAfectados == 1) {
					
					JOptionPane.showMessageDialog(null, "Registro eliminado");
					tfId.setText("");
					tfCIF.setText("");
					tfNombre.setText("");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ImposibleConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	private void guardar() {
		
		try {
			Connection conn = ConnectionManagerV2.getConexion();
			
			
			PreparedStatement ps = conn.prepareStatement("Select id from tutorialjavacoches.fabricante where "
					+ "id=?");
			
			
			ps.setInt(1, Integer.parseInt(tfId.getText()));
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				actualizar();
			}
			else {
				insertar();
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ImposibleConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	private void actualizar() {
			
		try {
			Connection conn = ConnectionManagerV2 .getConexion();
			PreparedStatement ps = conn.prepareStatement("UPDATE tutorialjavacoches.fabricante SET cif=?,nombre=? "
					+ "where id=?");
			
			
			ps.setInt(3,Integer.parseInt(tfId.getText()));
			ps.setString(1, tfCIF.getText());
			ps.setString(2, tfNombre.getText());
			
			
			int filasAfectadas = ps.executeUpdate();
			
			if (filasAfectadas == 1) {				
				JOptionPane.showMessageDialog(null, "Registo actualizado");
			}
			
			ps.close();
			conn.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ImposibleConectarException e) {
			e.printStackTrace();
		}		
	}
	
	
	
	private void insertar() {
		
		try {
			Connection conn = ConnectionManagerV2 .getConexion();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO tutorialjavacoches.fabricante (id,cif,nombre) "
					+ "values (?,?,?)");
			
			
			ps.setInt(1,Integer.parseInt(tfId.getText()));
			ps.setString(2, tfCIF.getText());
			ps.setString(3, tfNombre.getText());
			
			
			int filasAfectadas = ps.executeUpdate();
			
			if (filasAfectadas == 1) {				
				JOptionPane.showMessageDialog(null, "Registo insertado");				
			}
			
			ps.close();
			conn.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ImposibleConectarException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	private void setDimensionesBasicas () {
		this.setExtendedState(JFrame.NORMAL);
		this.setBounds(0, 0, 800, 600);
	}
	
}
