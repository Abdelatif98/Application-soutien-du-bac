package Model;

public class Traitement_chap {
	private String mat;
	private int nbre_chap;
	public Traitement_chap(String mat, int nbre_chap) {
		this.mat = mat;
		this.nbre_chap = nbre_chap;
	}
	

  public Traitement_chap() {
	
}
  public String getMat() {
	return mat;
}
  public int getNbre_chap() {
	return nbre_chap;
}
}
