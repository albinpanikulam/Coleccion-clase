package coleccion;

public class TestColeccion {

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


	}

}
