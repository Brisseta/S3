package tp32;

import java.io.File;
import java.io.FileReader;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Properties;

public class Lister {
	public static void main(String[]  srcTable) throws Exception {
		Properties prop = new Properties();
		prop.load(new FileReader(new File("psql")));
		String driver,url,login,mdp;
		driver = prop.getProperty("driver");
		url = prop.getProperty("url");
		login = prop.getProperty("login");
		mdp = prop.getProperty("mdp");
		//prop
		
		try {
			if(srcTable[0] == null)
				Class.forName(driver);
		}catch(Exception e){
			System.out.println("Aucun arguments");
			System.exit(1);
		}
		
		Connection con = DriverManager.getConnection(url,login,mdp);
		Statement state = con.createStatement();
		String query="Select * "
				+ "From  "+srcTable[0];
		System.err.println(query);
		ResultSet rs = state.executeQuery(query);
		ResultSetMetaData rsmd = rs.getMetaData();
		String toprint ="";
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			toprint +="\t"+rsmd.getColumnName(i)+"     ";
		}
		toprint+="\n**************************************************";
		int cpt;
		while (rs.next()) {
			toprint+="\n";
			for (cpt =1; cpt <= rsmd.getColumnCount(); cpt++) {
				toprint += "\t"+rs.getString(cpt)+" | ";
			}
		}
		System.out.println(toprint);
	}
}