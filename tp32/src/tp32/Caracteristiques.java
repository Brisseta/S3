package tp32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Caracteristiques  {
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
			String query = "select NOM,PRENOM,AGE from CLIENTS";
			ResultSet rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cpt=0;
			System.out.println(rsmd.getColumnName(1)+" "+rsmd.getColumnName(2)+" "+rsmd.getColumnName(3));
			while (rs.next()) {
				cpt++;

				String name = rs.getString("NOM");
				String  prenom = rs.getString("PRENOM");
				String  age = rs.getString("AGE");
				System.out.println("Ligne N°: "+cpt+" Nom : "+name+" Prenom : "+prenom+" Age : "+age);
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
