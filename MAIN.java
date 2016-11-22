package Examen.Zombis;

import java.util.Scanner;

public class MAIN {
static Scanner sc;
static EspaiZombi e1;
public static void main(String[] args) {
	sc = new Scanner(System.in);
	e1= new EspaiZombi(100);
	int i=0;
	do{
		//manu 1 
		System.out.println("Entra una opció de les següents:");
		System.out.println("1.-Generar 100 zombis dis de la ciutat");
		System.out.println("2-Disparar 1 missil a la ciutat.");
		System.out.println("3-Mostrar quants zombis queden i en quin estat.");
		System.out.println("4.-Sortir");
		i = sc.nextInt();
		// si nos clicla otro valor que no sea el menu syso erroneo
		if (i>4 ||i<1){
			System.out.println("Valor erroneo! \n");
		}	
		switch (i)
		{
		// metemos los metodos para cada case correspondiente
	case 1:e1.generarZombi();break;
	case 2:dispararMisil();break;
	case 3:Mostrarinfo();break;
	}
if (i==4){
	//si clica 5 sale de la consola
	System.out.println("Has sortit.\n");
	break; 
}

}while(i!=5);	
}
private static void Mostrarinfo() {
	// TODO Auto-generated method stub
	
}
private static void dispararMisil() {
	int X = 0,Y = 0;
	X=XCoordenada(X);
	Y=YCoordenada(Y);
	e1.ControlMisil(X,Y);
	
}
private static int YCoordenada(int y) {
	try{
		System.out.println("Entra la posicio inicial (Y) de del Misil:");
		y=sc.nextInt();
		sc.nextLine();
		if (y>200 || y<0){
			System.out.println("FUERA DE RANGO");
			System.out.println("Entra la posicio inicial (Y) de del Misil:");
			y=sc.nextInt();
			sc.nextLine();
		}
	}catch(Exception e){
		System.out.println("Coordenada Y incorrecta.Introduce un número: \n");
		sc.nextLine();
		y=sc.nextInt();
	}
	return y;
}
private static int XCoordenada(int x) {
	try{
		System.out.println("Entra la posicio inicial (X) del Misil:");
		x=sc.nextInt();
		sc.nextLine();
		if (x>200 ||x<0){
				System.out.println("FUERA DE RANGO");
				System.out.println("Entra la posicio inicial (X) de del Misil:");
				x=sc.nextInt();
				sc.nextLine();
			
		}
	}catch(Exception e){
		System.out.println("Coordenada X incorrecta.Introduce un número: \n");
		sc.nextLine();
		x=sc.nextInt();
	}
	return x;
}
	


}

