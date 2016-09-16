package tp32;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Connect {
	/**
	 *  Classe de connection odbc
	 */
	
	private String connection;
	private String url,user,password;
	private Connection con ;
	private java.sql.Statement state;
	private ResultSet rs;
	private ResultSetMetaData rsmd;


/**
 * 
 * @throws SQLException
 */

	public Connect() throws SQLException {
		String[] choix= new String[]{"psql","access","exel"};
		this.connection =(String)JOptionPane.showInputDialog(null, 
				"veuillez indiquer votre choix",
				"Connection",
				JOptionPane.QUESTION_MESSAGE,
				null,
				choix,
				choix);
		switch (connection) {
		case "psql": url="jdbc:odbc:PostgreSQltp32"; user="brisseta"; password ="moi";

		//a ajouter pour exel et access
		}
	}
	/**
	 * 
	 * @throws SQLException
	 */
	public void  connection() throws SQLException {
		con	= DriverManager.getConnection(url, user, password);
	}
	/**
	 * 
	 * @param table
	 * @throws SQLException
	 */
	public void lister(String table) throws SQLException{
		state= con.createStatement();
		String query="Select * from "+table;
		rs=state.executeQuery(query);
		rsmd =rs.getMetaData();
		while (rs.next()) {
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.print(rs.getString(i)+" |\t");
			}
			System.out.println();
		}
	}
	/**
	 * 
	 * @param table
	 * @return
	 * @throws SQLException
	 */
	public int compter(String table) throws SQLException{
		state= con.createStatement();
		int compteur=0;
		String query="Select * from "+table;
		rs=state.executeQuery(query);
		while (rs.next()) {
			compteur++;
		}
		return compteur;
	}
	/**
	 * 
	 * @param table
	 * @throws SQLException
	 */
	public void decrire(String table) throws SQLException{
		state= con.createStatement();
		String query="Select * from "+table;
		rs = state.executeQuery(query);
		rsmd = rs.getMetaData();
		System.out.println("Nom de table : "+rsmd.getTableName(0));
		System.err.println("Nombre de colonnes : " + rsmd.getColumnCount());
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.println("Nom de colonne "+i+" : "+rsmd.getColumnName(i)
					+ " Type : "+rsmd.getColumnType(i));
		}
	}
	/**
	 * 
	 * @throws SQLException
	 */
	public void fermer() throws SQLException{
		con.close();
		state.close();
		rs.close();
	}
	/**
	 * 
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		//new Connect();
	}
}
