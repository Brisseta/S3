package tp32;
import java.sql.*;

public class Select
{
  public static void main(String args[]) throws Exception
  {
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
          
      System.out.println("Liste des clients:");
      while (rs.next()) 
      {
              String n = rs.getString(1); // nom
              String p = rs.getString(2); // prenom
              int a = rs.getInt(3);       // age
              System.out.println(n + " " + p + " " + a);
      }
      con.close();
  } 
}
