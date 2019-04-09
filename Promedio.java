import java.util.Scanner; //Para poder activar el modulo de scan por teclado
public class Promedio     //Este nombre comienza con mayuscula y lleva e3l mismo nombre del progrma
{ 
	public static void main(String args[])
	{
	String nombre;     //Declaracion de variables
	int matematicas;
	int biologia;
	int quimica;
	int promedio;
	Scanner teclado = new Scanner(System.in); //Manera de activar la tomar de datos por teclado.

	System.out.print("Introduzca Nombre del Alummno: ");
	nombre = teclado.nextLine(); //Manera de intorucir "texto" por teclado


	System.out.print("Introduzca nota de matematica: ");
	matematicas = teclado.nextInt();//Manera de introucir "numeros" por teclado


	System.out.print("Introduzca nota de biologia: "); //Manera de imprimir  texto en pantalla
	biologia = teclado.nextInt();
        
	System.out.print("Introduzca nota de quimica: "); //Manera de imprimir  texto en pantalla
	quimica = teclado.nextInt();

        //Manera de hacer el calculo del Promedio de notas.
	promedio = (matematicas + biologia + quimica) / 3;

	if (promedio >= 10)
	{System.out.println("El alummno aprobo su promedio es " + promedio);} //Imprimir  texto en pantalla
	else 
	{System.out.println("El alummno reprobo su promedio es " + promedio);}	//Imprimir  texto en pantalla

    }	
}	

