import java.util.Scanner; //Para poder activar el modulo de scan por teclado
public class Vacacional     //Este nombre comienza con mayuscula y lleva e3l mismo nombre del progrma
{
	public static void main(String args[])
        {
		String nombre = "";
		int clave = 0, antiguedad = 0;

		Scanner teclado = new Scanner(System.in); //Manera de activar la tomar de datos por teclado.
		System.out.println("*********************************************************");
		System.out.println("*BIENVENIDO AL SISTEMA VACACIONAL DE COCA COLA COMPANY*");
		System.out.println("*********************************************************");
		System.out.println("");
		System.out.println("");

	        System.out.print("Introduzca Nombre del Trabajador: ");
       		nombre = teclado.nextLine(); //Manera de introducir "texto" por teclado 
		System.out.println("");

		System.out.print("Cuantos años de Servicio tiene el Trabajador: ");
		antiguedad = teclado.nextInt();
		System.out.println("");


		System.out.print("Cual es la Clave de su Departamento: ");
		clave = teclado.nextInt();
		System.out.println("");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		if (clave == 1) {
			if ( antiguedad == 1) {
	        System.out.println(" El trabajador tiene derecho a 6 dias y se llama "  + nombre  ); 
			
			}  

		 	 else  if (antiguedad >= 2 && antiguedad <= 6) {
				 
		 System.out.println(" El trabajador tiene derecho a 14 dias y se llama "  + nombre  );
			 
			 } 
				  else 	if (antiguedad >= 7) {
					  
		 System.out.println(" El trabajador tiene derecho a 20 dias y se llama "  + nombre  );

		}	else
	       
		{
		 System.out.println(" El trabajador aun no tiene derecho a vacaciones y se llama "  + nombre  );
		} 
		}	
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//clave 2

	if (clave == 2){ 
			if (antiguedad == 1){
	System.out.println(" El trabajador tiene derecho a 7 dias y se llama "  + nombre  ); //Imprimir texto 
		}	else 
				if (antiguedad >= 2 && antiguedad <= 6) {

        System.out.println(" El trabajador tiene derecho a 15 dias y se llama "  + nombre  );
				
				} 
				  else
				if (antiguedad >= 7) 

        {
		System.out.println(" El trabajador tiene derecho a 22 dias y se llama "  + nombre  ); //Imprimir texto

		}	else 

        {
		System.out.println(" El trabajador aun no tiene derecho a vacaciones y se llama "  + nombre  );} //Imprimir texto
	}

///////////////////////////////////////////////// CLAVE 3 ///////////////////////////////////////////////////////

if (clave == 3) { 
			if (antiguedad == 1) {
	System.out.println(" El trabajador tiene derecho a 10 dias y se llama "  + nombre  ); //Imprimir texto 
			}
			else 
				if (antiguedad >= 2 && antiguedad <= 6)
				{
        System.out.println(" El trabajador tiene derecho a 20 dias y se llama "  + nombre  ); //Imprimir texto
				} else
				if (antiguedad >= 7)
				{
        
	System.out.println(" El trabajador tiene derecho a 30 dias y se llama "  + nombre  ); //Imprimir texto

				}	else 

        {                         
	System.out.println(" El trabajador aun no tiene derecho a vacaciones y se llama "  + nombre  );
	
	} 
}

	}
}

   
	

