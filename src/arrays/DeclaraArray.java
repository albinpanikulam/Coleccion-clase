package arrays;

public class DeclaraArray {

	public static void main(String[] args) {
		//DECLARAMOS PRIMER ARRAY
		//CREAMOS LAS REFERENCIAS
		int [] referenciaEnteros;
		//CREAMOS EL ARRAY
		referenciaEnteros = new int [3];
		//INICIALIZAMOS LOS VALORES
		referenciaEnteros [0] = 12;
		referenciaEnteros [1] = 13;
		referenciaEnteros [2] = 14;
		for (int i=0; i<referenciaEnteros.length; i++){
		System.out.println("Valor "+i+": "+referenciaEnteros[i]);
		}
		
		//DECLARAMOS Y CREAMOS LA REFERNCIA
		double [] referenciaDoubles = new double [3];
		//INICIALIZAMOS LOS VALORES
		referenciaDoubles [0] = 12.1;
		referenciaDoubles [1] = 12.2;
		referenciaDoubles [2] = 12.3;
		//RECORREMOS EL ARRRAY
		for (int i=0; i<referenciaDoubles.length; i++){
			System.out.printf("Valor %d: %.2f%n", i, referenciaDoubles[i]);
		}
		
		//DECLARAMOS, CREAMOS E INICIALIZAMOS EL ARRAY
		String[] referenciaCadenas = {"Hola"," ","Mundo"};
		//RECORREMOS EL ARRAY
		for (int i=0; i<referenciaCadenas.length; i++){
			System.out.print(referenciaCadenas[i]);
		}
		System.out.println();
		
		//CREAMOS, INICIALIZAMOS ARRAY BOOLEAN
		boolean [] referenciaBoolean = {true, false, true, true};
		//RECORREMOS EL ARRAY DE FORMA CLASICA
		for (int i=0; i<referenciaBoolean.length; i++){
			System.out.printf("%b ", referenciaBoolean[i]);
		}
		System.out.println();
		
		//RECORREMOS ARRAYS CON UN BUCLE MEJORADO
		for (String cadena: referenciaCadenas){
			System.out.print(cadena);
		}
		System.out.println();
		for (boolean b: referenciaBoolean){
			System.out.printf("%b ", b);
		}
		

	}

}
