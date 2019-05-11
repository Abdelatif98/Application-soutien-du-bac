package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Site {
	private  IntegerProperty id_site=new SimpleIntegerProperty() ;
	private  StringProperty lien= new SimpleStringProperty();
	private  IntegerProperty id_mat=new SimpleIntegerProperty();
	
	public Site(int id_site,String lien,int id_mat){
		this.id_site=new SimpleIntegerProperty(id_site);
		this.lien=new SimpleStringProperty(lien);
		this.id_mat= new SimpleIntegerProperty(id_mat);
	}
	public IntegerProperty getId_mat() {
		return id_mat;
	}
	public void setId_mat(IntegerProperty id_mat) {
		this.id_mat = id_mat;
	}
	public IntegerProperty getId_site() {
		return id_site;
	}
	public void setId_site(IntegerProperty id_site) {
		this.id_site = id_site;
	}
	public StringProperty getLien() {
		return lien;
	}
	public void setLien(StringProperty lien) {
		this.lien = lien;
	}
	public static String  affiche_site(int code_site) {
		Connection cn=Connexion.Connecter();
		Statement st=null;
		ResultSet rs=null;
		try {
			st=cn.createStatement();
			String sql="select lien from Site where id_res="+code_site;
			rs=st.executeQuery(sql);
			if(rs.next()) {
				return rs.getString("lien");
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
	
	
}
