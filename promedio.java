import java.util.Scanner;
/**
 * Esta es la clase Promedio que se encarga de calcular
 * el promedio de 4 exámenes.
 * @author Adonias Pirir
 * since 2024-08-01
 */
public class promedio {
	
	/**
    *Realizando cambios
    * Actualización 1 - 2:08 pm
    * 
	*Método principal de la clase Promedio que se encarga de 
	*calcular el promedio de 4 exámenes.
	*@param args que representan un listado de valores
	* 		al momento de ejecutar el progra.
	*@since 2024-07-28
	*/
		public static void main(String [] args){
			
			//Se declara la variable scan para leer datos de una linea de comandos.
            Scanner scanner = new Scanner(System.in);
                //Se declara el tipo de dato float al obtener una entrada o salida con número decimal
                //Entradas
                System.out.println("Ingrese calificacion 1");		
                float A = scanner.nextFloat();
                System.out.println("Ingrese calificacion 2");		
                float B = scanner.nextFloat();
                System.out.println("Ingrese calificacion 3");		
                float C = scanner.nextFloat();
                System.out.println("Ingrese calificacion 4");		
                float D = scanner.nextInt();
                //Cálculos
                float Total = A+B+C+D;
                float Prom = Total / 4;
                //Salida
System.out.println("El promedio es: ");
System.out.println(Prom);
            }
	}