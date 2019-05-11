package Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connexion {
	
	public static Connection Connecter() {
		String url = "jdbc:mysql://localhost/app_peda";
		String login = "root";
		String passwd = "";
		Connection cn =null;
		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);
			System.out.println("Connexion etablie");
			return cn;
		}
		catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} 
				
			return null;
				

	

}
}
