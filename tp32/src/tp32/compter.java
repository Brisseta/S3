package tp32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class compter {
	public static void main(String[] args) {
	
		try{
	Connection con=null;
	Statement stmt;

	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

	String url = "jdbc:odbc:PostgreSQltp32";
	String nom = "";
	String mdp = "";
	con = DriverManager.getConnection(url,nom,mdp);
	stmt = con.createStatement();
	String query = "select COUNT(*) as c from CLIENTS";
	ResultSet rs = stmt.executeQuery(query);
	rs.next();
	System.out.println("nombre lignes : "+rs.getString("c"));
	con.close();
	stmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
