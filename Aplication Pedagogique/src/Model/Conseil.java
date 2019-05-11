package Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


public class Conseil {
	private  IntegerProperty id_conseil=new SimpleIntegerProperty() ;
	private  StringProperty conseil= new SimpleStringProperty();
	private IntegerProperty id_theme=new SimpleIntegerProperty();
	
	public Conseil(int id_conseil,String conseil,int id_theme) {
		this.id_conseil=new SimpleIntegerProperty(id_conseil);
		this.conseil=new SimpleStringProperty(conseil);
		this.id_theme= new SimpleIntegerProperty(id_theme);
	}
	public StringProperty getConseil() {
		return conseil;
	}
	public void setConseil(StringProperty conseil) {
		this.conseil = conseil;
	}
	public void setId_conseil(IntegerProperty id_conseil) {
		this.id_conseil = id_conseil;
	}
	public IntegerProperty getId_conseil() {
		return id_conseil;
	}
	public void setId_theme(IntegerProperty id_theme) {
		this.id_theme = id_theme;
	}
}
