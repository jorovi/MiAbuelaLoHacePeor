import java.util.Scanner;
/*
 * En este ejercicio tienes un men� donde se hacen potencias y ra�ces. 
 * 
 * Vivimos en un mundo donde no existe la manera r�pida de calcular potencias y ra�ces y por tanto se calculan mediante bucles, pero
 * un duendecillo malvado ha reprogramado el c�digo y ahora no dan bien... nada b�sicamente.
 * 
 * Usando tus dotes matem�ticas y de programaci�n, debes arreglar estos bucles para que los ciudadanos de Villapatata puedan calcular sus problemas.
 * 
 */
public class PotenciaRaiz {
	public static void main(String[] args) {
		menu();
		raiz();
		potencia();
		
	}

	public static void menu(){
		int opcion=0;
		do{
		Scanner sc= new Scanner(System.in);
		System.out.println("--------------------");
		System.out.println("1 para calcular una potecia");
		System.out.println("2 para calcular una ra�z cuadrada");
		System.out.println("3 para salir");
		opcion= sc.nextInt();
		switch(opcion){
		case 1:potencia(); break;
		case 2:raiz();break;
		}
		}while(opcion<3&&opcion>0);
	}
	
	//Bucle para calcular potencias de n�meros
	public static void potencia(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribeme un n�mero");
		int base=sc.nextInt();
		Scanner pot=new Scanner(System.in);
		System.out.println("Escribeme el n�mero al que lo quieres elevar");
		int potencia=sc.nextInt();
		int i=0;
		int result;
		do{
			result=base*base;
			i++;	
		}while(i<potencia);
		System.out.println(base+" elevado a "+potencia+" es igual a "+result);
	}
	//Bucle para calcular raices de n�meros.
	public static void raiz(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribeme un n�mero");
		int num=sc.nextInt();
		int i=1;
		int raiz;
		do{
			raiz=i*i;
			i++;
		}while(i<num);
		if(i==num){
			System.out.println("La ra�z cuadrada de "+num+" es "+raiz);
		}
			else{
			System.out.println("Tu n�mero no tiene ra�z cuadrada");
		}
		}
	}