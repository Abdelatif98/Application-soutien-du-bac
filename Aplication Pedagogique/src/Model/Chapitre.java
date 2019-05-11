package Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Chapitre {
	private  IntegerProperty identifiant=new SimpleIntegerProperty() ;
	private  StringProperty libelle= new SimpleStringProperty();
	private IntegerProperty code_mat=new SimpleIntegerProperty();
	
	public Chapitre(int id,String libelle,int id_mat) {
		this.identifiant=new SimpleIntegerProperty(id);
		this.libelle=new SimpleStringProperty(libelle);
		this.code_mat= new SimpleIntegerProperty(id_mat);
	}
	public IntegerProperty getCode_mat() {
		return code_mat;
	}
	public void setCode_mat(IntegerProperty code_mat) {
		this.code_mat = code_mat;
	}
	public IntegerProperty getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(IntegerProperty identifiant) {
		this.identifiant = identifiant;
	}
	public StringProperty getLibelle() {
		return libelle;
	}
	public void setLibelle(StringProperty libelle) {
		this.libelle = libelle;
	}
}


