package Model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;




public class Quiz {
	private  IntegerProperty numero=new SimpleIntegerProperty();
	private  StringProperty question= new SimpleStringProperty();
	private  StringProperty reponse= new SimpleStringProperty();
	private  IntegerProperty code_res=new SimpleIntegerProperty();
	
	
	public Quiz(int numero, String question, String reponse, int code_res) {
		this.numero=new SimpleIntegerProperty(numero);
		this.question=new SimpleStringProperty(question);
		this.reponse=new SimpleStringProperty(reponse);
		this.code_res=new SimpleIntegerProperty(code_res);
	}
	
public IntegerProperty getCode_res() {
	return code_res;
}
public void setCode_res(IntegerProperty code_res) {
	this.code_res = code_res;
}
public IntegerProperty getNumero() {
	return numero;
}
public void setNumero(IntegerProperty numero) {
	this.numero = numero;
}
public StringProperty getQuestion() {
	return question;
}
public void setQuestion(StringProperty question) {
	this.question = question;
}
public StringProperty getReponse() {
	return reponse;
}
public void setReponse(StringProperty reponse,String question) {
	this.reponse = reponse;
}
public String[] verifier_reponse(String[] rep_ent){
	String[] rep_juste=new String[4];
	String[] rep_verifie=new String[4];
	Connection cn=Connexion.Connecter();
	Statement st=null;
	ResultSet rs=null;
	try {
		st=cn.createStatement();
		String sql="select reponse from quiz where question="+question;
		rs=st.executeQuery(sql);
		if(rs.next()) {
			String str=rs.getString("reponse");
			for(int i=0;i<str.length();i++) {
				rep_juste[i]=str.substring(i,i+1);
			}	
			for(int i=0;i<4;i++) {
			if(rep_ent[i]==rep_juste[i]) {
				rep_verifie[i]="1";
			}
			else rep_verifie[i]="0";
			}
		}
		
		return rep_verifie;
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


