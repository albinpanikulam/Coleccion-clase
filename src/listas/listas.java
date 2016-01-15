package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listas {

	public static void main(String[] args) {
		//CREAMOS UNA LISTA DE CADENA (STRING)
		List<String> listaCadenas = new ArrayList<String>();
		//AÑADIMOS MEDIANTE SCANNER
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce cadena de texto (FIN APARA ACABAR)");
		String cadena = entrada.next();//lee palabra por palabra
		//while (cadena.toLowerCase() != "fin"){ //NO FUNCIONA
		while (!cadena.toLowerCase().equals("fin")){
			listaCadenas.add(cadena);
			cadena = entrada.next();
		}
		//CIERRAR EL SCANNER
		entrada.close();
		
		//CONOCEMOS EL CONTENIDO DE LA LISTA
		System.out.println(listaCadenas);
		System.out.println("¿CONTINE A PEDRO?"+listaCadenas.contains("Pedro"));
		if (listaCadenas.contains("Pedro")) {
			System.out.println("Esta lista en la posicion: "+listaCadenas.lastIndexOf("Pedro"));
			if (listaCadenas.size()>0)
			System.out.println("Primera palabra: "+listaCadenas.get(0));
			//recorremos la lista e imprimimos las palabras en una unica linea
			//FORMA 1 CLASSICA
			for (int i=0; i<listaCadenas.size(); i++){
				System.out.println(listaCadenas.get(i));
			}
			//FORMA 2 BUCLE MEJORADO
			for (String string : listaCadenas){
				System.out.println(string);
			}
			//FORMA 3 JAVA-8
			listaCadenas.forEach(System.out::println);
		}
	}

}
