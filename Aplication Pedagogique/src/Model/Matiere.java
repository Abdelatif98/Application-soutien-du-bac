package Model;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Matiere {
	private  IntegerProperty identifiant=new SimpleIntegerProperty();
	private  StringProperty libelle= new SimpleStringProperty();
	
public Matiere(int id,String lib) {
	this.identifiant=new SimpleIntegerProperty(id);
	this.libelle=new SimpleStringProperty(lib);
	
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
