package Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
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
}
