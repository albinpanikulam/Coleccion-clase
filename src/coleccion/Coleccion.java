package coleccion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Coleccion {
	private double [][] vector;
	//CONSTRUCTOR
	//INICIALIZA VECTOR COMO UNA MATRIZ DE FILAS Y COLUMNAS
	public Coleccion(int filas, int columnas) {
		this.vector = new double [filas][columnas]; 
	}
	//RELLENAR EL ARRAY DE FORMA ALEATORIA
	//USAMO Math.random() y UN MULTIPLICADOR
	public void rellenarColeccion(int multiplicador){
		//SE RELLENA CON Math.random * multiplicador
		for (int i =0; i<this.vector.length; i++){
			for (int j=0; j<this.vector[i].length; j++){
				this.vector[i][j] = Math.random()*multiplicador;
			}
		}
		
	}
	@Override
	public String toString() {
		String vectorCadena = "";
		//LOGICA
		for (int i =0; i<this.vector.length; i++){
			for (int j=0; j<this.vector[i].length; j++){
				vectorCadena += this.vector[i][j]+"--";
			}
		}
		return vectorCadena.substring(0, vectorCadena.length()-1);
		
		
	}//GETTER
	public double[][] getVector() {
		return vector;
	}
	
	public void calcularValoresEstadisticos(){
		int tamano = vector.length * vector[0].length;
		double [] vectorUnidimensional = new double[tamano];
		int contador = 0;
		for (double[] ds : vector) {
			for (double d : ds) {
				vectorUnidimensional[contador] = d;
				contador++;
			}
		}
		Arrays.sort(vectorUnidimensional);
		System.out.printf("valor mas grande:%.2f y el mas pequeño %.2f %n"
				vectorUnidimensional);
		
	}
	

}

class TestColeccion{
	public static void main(String[] args) {
		Coleccion c1 = new Coleccion(10, 7);
		//SE RELLENA DE 0.0
		System.out.println(c1);
		c1.rellenarColeccion(15);
		System.out.println(c1);
		double[][] valores = c1.getVector();
		for (int i =0; i<valores.length; i++){
			for (int j=0; j<valores[i].length; j++){
				this.valores[i][j] = Math.random()*multiplicador;
				System.out.println();
			}
		}
	}
}
