package negocioselectronicos;


import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Charlie
 */
public class conectar {
    Connection conect = null;
	public Connection conexion()
		{
			try {
				//Cargamos el Driver MySQL
				Class.forName("com.mysql.jdbc.Driver");
				//Class.forName("org.gjt.mm.mysql.Driver");
				conect = DriverManager.getConnection("jdbc:mysql://sql9.freemysqlhosting.net/sql9240356","sql9240356","FfPD29r1vC");
				System.out.println("conexion establecida");
				//JOptionPane.showMessageDialog(null,"Conectado");
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("error de conexion");
				JOptionPane.showMessageDialog(null,"Error de conexion"+e);
			}
			return conect;
		}
    
}
