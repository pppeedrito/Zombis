package Examen.Zombis;

import java.util.Scanner;

import AVION.Aeronau;

public class EspaiZombi {
	static Scanner sc;
	public static final int Yfila = 20;
	public static final int Xcolumna = 20;		
	private int numZombis=0;
	private int Capacitat=0;
	private Zombi ListadeZombis[];
	private int posicion =0;
	private static char Mapa[][]=new char [Yfila][Xcolumna];
	
	
	public EspaiZombi(int Capacitat) {
	this.Capacitat = Capacitat;
	ListadeZombis=new Zombi [this.Capacitat];
	}

	public void generarZombi() {
		// no entiendo por que da error 
			while (numZombis<Capacitat ){
			int	X= (int) (Math.random()*19+1);
			int Y=(int) (Math.random()*19+1);
			int Vides=2;
				if (ControlZombi(X, Y)){
					System.out.println("Posicion Ocupada por Otro Zombi");
				}else{
					Zombi TempZombi=new Zombi (X,Y,Vides);
					ListadeZombis[numZombis]=TempZombi;
					numZombis++;
					Mapa[X][Y]='Z';
					
				}
				
				 
				
				}
			PrintTable();
			System.out.println("Se a llenado la ciudad de Zombis ! \n");
		}

	//busco la posicion X, Y para ver si estan pilladas !  
	public boolean ControlZombi(int X, int Y) {
		boolean trobat= false;
		int index=0;
		//mientras que trobat sea falso y los aviones sean menores de 5 
		while(!(trobat) && index<this.Capacitat){
			if (ListadeZombis[index]!=null){
				//pilla la matricula y la compara con la matricula introducida
				if (ListadeZombis[index].setX(Y)){
					if(ListadeZombis[index].setY(X)){
						trobat=true;
						posicion=index;
					}else{
						index++;
					}
						
				}else {
					index++;
				}
					


				}else {
					index++;
				}
				
		}
		return trobat;	
		}

	public void ControlMisil(int X,int Y) {
		int vides= 2;
		int dañoAreaX;
		int dañoAreaY;
		//si la posicion coincide con la introducida ! 
		if (ListadeZombis[posicion].getX()== X){
			if(ListadeZombis[posicion].getY()== Y){
				//bajamos la vida 
				if (ListadeZombis[posicion].getVides()>1){
					vides=ListadeZombis[posicion].getVides()-1;
					System.out.println("La vida a bajado.");
				}else if(ListadeZombis[posicion].getVides()==1){
					vides=ListadeZombis[posicion].getVides()-1;
					System.out.println("Zombi muerto.! ");
				}else{
					System.out.println("No has tocado a ninguno");
				}
				
			}
		}
		
	}	

	public static void PrintTable(){
		for (int i=0; i<Yfila; i++){		//visualitzem la taula
			for(int j=0; j<Xcolumna; j++){
				System.out.print(Mapa[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
	


