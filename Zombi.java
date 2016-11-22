package Examen.Zombis;

public class Zombi {
private int X;
private int Y;
private int Vides = 2;

public Zombi (int X,int Y,int Vides){
this.X=X;
this.Y=Y;
this.Vides=Vides;
}
public void MostrarInformacioAvio(){

	System.out.println("Informació de l'avio:\t" );
	System.out.println("X:\t"+this.X);
	System.out.println("Y:\t"+this.Y);
	System.out.println("Vides:\t"+this.Vides);

}

public int getX() {
	return X;
}
public boolean setX(int X) {
	this.X = X;
	return false;
}
public int getY() {
	return Y;
}
public boolean setY(int Y) {
	this.Y = Y;
	return false;
}
public int getVides(){
	return Vides;
}
public void setVides(int Vides){
	this.Vides=Vides;
}
}