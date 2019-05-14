package Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;


public class Lire {
	private  IntegerProperty id_eleve=new SimpleIntegerProperty() ;
	private  IntegerProperty id_res=new SimpleIntegerProperty() ;
	private  BooleanProperty lu= new SimpleBooleanProperty();
	private  StringProperty notes= new SimpleStringProperty();
	
	
	public Lire( int id_eleve,int id_res,boolean lu, String notes) {
		this.id_eleve=new SimpleIntegerProperty(id_eleve);
		this.id_res=new SimpleIntegerProperty(id_res);
		this.lu=new SimpleBooleanProperty(lu);
		this.notes=new SimpleStringProperty(notes);
		
		
	}

	
	public IntegerProperty getId_eleve() {
		return id_eleve;
	}
	
	public IntegerProperty getId_res() {
		return id_res;
	}
	public BooleanProperty getLu() {
		return lu;
	}
	public StringProperty getNotes() {
		return notes;
	}
	public void setId_eleve(IntegerProperty id_eleve) {
		this.id_eleve = id_eleve;
	}
	public void setId_res(IntegerProperty id_res) {
		this.id_res = id_res;
	}
	public void setLu(BooleanProperty lu) {
		this.lu = lu;
	}
	public void setNotes(StringProperty notes) {
		this.notes = notes;
	}
	public String  consulter(int code) {
		Connection cn=Connexion.Connecter();
		Statement st=null;
		ResultSet rs=null;
		try {
			st=cn.createStatement();
			String sql="select notes from Lire where id_res="+code;
			rs=st.executeQuery(sql);
			if(rs.next()) {
				return rs.getString("notes");
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
		return null;
		}
	
	public void sauvegarder(String texte,int code){
		Connection cn=Connexion.Connecter();
		Statement st=null;
		//ResultSet rs=null;
		try {
			st=cn.createStatement();
			String sql="update Lire set notes =texte  where id_res="+code;
			st.executeUpdate(sql);
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
	
public void supprimer(int code) {
	Connection cn=Connexion.Connecter();
	Statement st=null;
	//ResultSet rs=null;
	try {
		st=cn.createStatement();
		String sql="DELETE from Lire where id_res="+code;
		st.executeUpdate(sql);
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
}
