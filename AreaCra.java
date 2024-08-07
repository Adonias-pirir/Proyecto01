import java.util.Scanner;
/**
 * Esta es la clase AreaCra que se encarga de calcular
 * el área de una circunferencia
 * @author Adonias Pirir
 * since 2024-07-28
 */
public class AreaCra {
	
	/**
	*Método principal de la clase AreaCra que se encarga de 
	*calcular el área de una circunferencia.
	*@param args que representan un listado de valores
	* 		al momento de ejecutar el progra.
	*@since 2024-07-28
	*/
		
		public static void main(String [] args){
			
			//Se declara la variable scan para leer datos de una linea de comandos.
			Scanner scanner = new Scanner(System.in);
			//Se declara el tipo de dato double al obtener una entrada o salida con decimal
			//Entradas
			System.out.println("Ingrese el radio");		
			double radio = scanner.nextDouble();
			double area = Math.PI*Math.pow(radio, 2);
			//Salidas
			System.out.println("El área de la circunferencia es ");
			System.out.println(area);
	}
}