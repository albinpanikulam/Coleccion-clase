package arrays;

public class ArrayMultidimensionales {
	static int [][] arrayBidimensionalEnteros;//ACCESIBLE A TODOS LOS METODOS
	public static void main(String[] args) {
		final int NUMERO_FILAS = 3;//CONSTANTES
		final int NUMERO_COLUMNAS = 4;//CONSTANTES
		arrayBidimensionalEnteros = new int [NUMERO_FILAS][NUMERO_COLUMNAS];
		System.out.printf("Nº filas: %d, nº columnas %d, nº elemento %d%n",
				arrayBidimensionalEnteros.length,
				arrayBidimensionalEnteros[0].length,
				arrayBidimensionalEnteros.length*arrayBidimensionalEnteros[0].length);
		rellenarArray(2, -2);
		mostrarArray();
		

	}
	public static void rellenarArray(int numeroInicial, int numeroMultiplicador){
		int numeroAlmacenar = numeroInicial;
		for (int i = 0; i<arrayBidimensionalEnteros.length; i++){
			for (int j = 0; j<arrayBidimensionalEnteros[0].length; j++){
				arrayBidimensionalEnteros[i][j] = numeroAlmacenar;
				numeroAlmacenar *= numeroMultiplicador;
			}
			
		}
		System.out.println();
	}
	public static void mostrarArray(){
		for (int i=0; i<arrayBidimensionalEnteros.length; i++){
			for (int j=0; j<arrayBidimensionalEnteros[0].length; j++){
				System.out.printf("%10d", arrayBidimensionalEnteros[i][j]);
				
			}
			System.out.println();
			
		}
	}

}
