package Model;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;

public class Theme {
	private IntegerProperty  id_theme= new SimpleIntegerProperty();
	private StringProperty libelle = new SimpleStringProperty();
	public Theme(int id, String lib) {
		this.id_theme= new SimpleIntegerProperty(id);
		this.libelle= new SimpleStringProperty(lib);	
	}
	
public IntegerProperty getId_theme() {
	return id_theme;
}
public StringProperty getLibelle() {
	return libelle;
}
}