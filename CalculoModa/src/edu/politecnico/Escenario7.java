package edu.politecnico;

import java.util.Scanner;
/**
 * @author Monica Arboleda, Ingrid Gutiérrez, Flor Moreno y Jireth Rodríguez
 */

public class Escenario7 {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		
		//Declaración de variables
		
		//Cantidad de datos para calcular la moda
		int respuesta1;
		//Arreglo donde se alojará los números que el usuario ingrese
		double [] respuestaArreglo;
		
		//Matriz para calcular la cantidad de repeticiones de cada número
		double [] [] matArreglo;
		
		//Variable que guardará la posición de la fila de la matriz anterior que contendrá la mayor cantidad de repeticiones
		int mayor = 0;
		
		
		System.out.println("Hola, mediante este programa podré calcular la moda de un listado de números!!!\r\n");
		System.out.println("Por favor ingresa la cantidad de datos a validar:\r\n");
		//Usuario podrá digitar respuesta a pregunta 
		respuesta1 = entrada.nextInt();
		
		//Se intancia el arreglo y la matriz con la cantidad de datos que el usuario ingresa en respuesta1
		respuestaArreglo = new double [respuesta1];
		matArreglo = new double [respuesta1] [2];
		
		//Solicita al usuario ingreso del dato n veces - Para este caso es tipo double. Adicional en la matriz columna (1) se pobla con 0 cada dato
			for (int i = 0; i < respuesta1; i++) {
				System.out.println("Por favor ingrese el dato " + (i+1) + ":\r\n");
				respuestaArreglo [i] = entrada.nextDouble();
				matArreglo [i][0] = respuestaArreglo [i];
				matArreglo [i] [1] = 0;
			}
			
			//Realiza  conteo de cada dato del arreglo y pobla la matriz columna 1 usando a=a+1 y asi hallar las repeticiones de cada dato en el arreglo
				for (int i = 0; i< respuestaArreglo.length;i++ ) {
				//System.out.println("El arreglo es: " + respuestaArreglo [i]);
				for (int r = i; r<respuestaArreglo.length;r++ ) {
					if (respuestaArreglo [i] == respuestaArreglo [r]) {
						matArreglo [i] [1] = matArreglo [i] [1] + 1;
					}
				}
			}
			
			
			//Encuentra el numero mayor en la columna 1 de la matriz, que indica la catidad de repeticiones de los datos en el arreglo 
			for (int i = 0; i<respuestaArreglo.length;i++) {
				//System.out.println(respuestaArreglo [i] + " : " + matArreglo[i][1]);
				if (matArreglo [i] [1] > matArreglo[mayor] [1]) {
					mayor = i;
				}
			}
		
			// Escribe el dato que mas se repite y cuantas veces se repite 
			System.out.println( "La moda es: " + respuestaArreglo [mayor] + " Porque se repite " + matArreglo [mayor][1] + " veces.\r\n");
				
	}

		
	}
	

