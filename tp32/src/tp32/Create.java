package tp32;

import java.sql.*;

public class Create 
{  
  public static void main(String args[])
  {      
	  try{
      // enregistrement du driver
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      
      // connexion à la base
      String url = "jdbc:odbc:PostgreSQltp32";
      String nom = "";
      String mdp = "";
      Connection con = DriverManager.getConnection(url,nom,mdp);

      // execution de la requete
      Statement stmt = con.createStatement();
      stmt.executeUpdate("create table CLIENTS " +
                         "(NOM varchar(10), PRENOM varchar(10), AGE int)");


      // fermeture des espaces
      con.close();
	  }catch(Exception e){
		  e.printStackTrace();
	  }
  }
}	