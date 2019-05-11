package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Eleve {
	private  IntegerProperty id_eleve=new SimpleIntegerProperty() ;
	private  StringProperty nom= new SimpleStringProperty();
	private  StringProperty prenom= new SimpleStringProperty();
	private  StringProperty pseudo= new SimpleStringProperty();
	private  StringProperty mot_de_passe= new SimpleStringProperty();
	
	public Eleve(int id_eleve,String nom,String prenom,String pseudo,String mot_de_passe) {
		this.id_eleve=new SimpleIntegerProperty(id_eleve);
		this.nom=new SimpleStringProperty(nom);
		this.prenom=new SimpleStringProperty(prenom);
		this.pseudo=new SimpleStringProperty(pseudo);
		this.mot_de_passe=new SimpleStringProperty(mot_de_passe);
		
	}
	public IntegerProperty getId_eleve() {
		return id_eleve;
	}
	public void setId_eleve(IntegerProperty id_eleve) {
		this.id_eleve = id_eleve;
	}
	public StringProperty getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(StringProperty mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	public StringProperty getNom() {
		return nom;
	}
	public void setNom(StringProperty nom) {
		this.nom = nom;
	}
	public StringProperty getPrenom() {
		return prenom;
	}
	public void setPrenom(StringProperty prenom) {
		this.prenom = prenom;
	}
	public StringProperty getPseudo() {
		return pseudo;
	}
	public void setPseudo(StringProperty pseudo) {
		this.pseudo = pseudo;
	}
	public void inscrire_eleve(String nom,String prenom,String pseudo,String mot_de_passe){
		Connection cn=Connexion.Connecter();
		Statement st=null;
		ResultSet rs=null;
		try {
			st=cn.createStatement();
			String sql1="select * from Eleve where pseudo="+pseudo;
			rs=st.executeQuery(sql1);
			if(rs.next()==false) {
			String sql2="insert into Eleve values(nom,prenom,pseudo,mot_de_passe)";
			st.executeUpdate(sql2);
			}
		}
			
			catch(SQLException e){
				e.printStackTrace();
			}
			
		finally {
			try {
				cn.close();
				st.close();
				
			}
			catch (Exception e) {
				e.printStackTrace();
				
			}
				// TODO: handle exception
			}
		
	}
	public boolean verify_login(String pseudo,String mot_de_passe){
		Connection cn=Connexion.Connecter();
		Statement st=null;
		ResultSet rs=null;
		boolean bool;
		try {
			st=cn.createStatement();
			String sql="select * from Eleve where pseudo="+pseudo;
			rs=st.executeQuery(sql);
			if(rs.next()) {
				if(rs.getString("mot_de_passe")==mot_de_passe) bool=true;
				else bool=false;
			}
			else bool=false;
			return bool;
		}
			
			catch(SQLException e){
				e.printStackTrace();
			}
			
		finally {
			try {
				cn.close();
				st.close();
				
			}
			catch (Exception e) {
				e.printStackTrace();
				
			}
				// TODO: handle exception
			}
		
		return false;
	}
	
}
