package Model;
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
public void setReponse(StringProperty reponse) {
	this.reponse = reponse;
}
}
