package Model;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Resume {
	private  IntegerProperty identifiant=new SimpleIntegerProperty();
	private  StringProperty titre= new SimpleStringProperty();
	private  StringProperty contenu= new SimpleStringProperty();
	private IntegerProperty code_chap=new SimpleIntegerProperty();
	
	
	public Resume(int identifiant,String titre,String contenu,int code_chap) {
		this.identifiant=new SimpleIntegerProperty(identifiant);
		this.titre=new SimpleStringProperty(titre);
		this.contenu=new SimpleStringProperty(contenu);
		this.code_chap=new SimpleIntegerProperty(code_chap);
	}
	
	public IntegerProperty getIdentifiant() {
		return identifiant;
	}
	
	public void setIdentifiant(IntegerProperty identifiant) {
		this.identifiant = identifiant;
	}
	
	public StringProperty getContenu() {
		return contenu;
	}
	public void setContenu(StringProperty contenu) {
	this.contenu = contenu;
}
	public StringProperty getTitre() {
	return titre;
}

	public void setTitre(StringProperty titre) {
	this.titre = titre;
}

	public IntegerProperty getCode_chap(){
	return code_chap;
}
	public void setCode_chap(IntegerProperty code_chap) {
	this.code_chap = code_chap;
}
	public static String  affiche_resume(int code_res) {
	Connection cn=Connexion.Connecter();
	Statement st=null;
	ResultSet rs=null;
	try {
		st=cn.createStatement();
		String sql="select contenu from Resumes where id_res="+code_res;
		rs=st.executeQuery(sql);
		if(rs.next()) {
			return rs.getString("contenu");
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
