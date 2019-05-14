package Model;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import javafx.beans.property.IntegerProperty;
public class Passer {
	private IntegerProperty  id_eleve= new SimpleIntegerProperty();
	private IntegerProperty  id_quiz= new SimpleIntegerProperty();
	private StringProperty  etas= new SimpleStringProperty();
	private IntegerProperty  points= new SimpleIntegerProperty();
	public Passer(int id_eleve,int  id_quiz,String  etas,int  points) {
		this.id_eleve=new SimpleIntegerProperty(id_eleve);
		this.id_quiz=new SimpleIntegerProperty(id_quiz);
		this.etas=new SimpleStringProperty(etas);
		this.points=new SimpleIntegerProperty(points);
	}
	
	public IntegerProperty getId_eleve() {
		return id_eleve;
	}
	public IntegerProperty getId_quiz() {
		return id_quiz;
	}
	public StringProperty getEtas() {
		return etas;
	}
	public IntegerProperty getPoints() {
		return points;
	}
	public void quiz_passer() {
    	Connection cn = Connexion.Connecter();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = cn.createStatement();
            rs = st.executeQuery("INSERT INTO Passer VALUES(id_eleve,id_quiz,Passer.calcule_point())");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				cn.close();
				st.close();

			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	
	}
	}
