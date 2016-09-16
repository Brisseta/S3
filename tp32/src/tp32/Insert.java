package tp32;
import java.sql.*;

public class Insert
{
	public static void main(String args[])
	{
		try{
			// enregitrement du driver
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			String url = "jdbc:odbc:PostgreSQltp32";
			String nom = "";
			String mdp = "";
			Connection con = DriverManager.getConnection(url,nom,mdp);

			// execution de la requ�te
			Statement stmt = con.createStatement();
			String tmp="";
			String[] tab = tabName();
			for (int i = 0; i < tab.length; i++) {
				tmp=tab[i];
				stmt.executeUpdate("insert into CLIENTS " +
						"values('"+tmp+"', 'bruno',40)" );
			}

			// fermeture des espaces
			con.close();
		}catch(Exception e){

			e.printStackTrace();
		}
	}
	public static String[] tabName(){
		String[] tab = new String[1000];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = "nom_"+i;
		}	
		return tab;
	}
}