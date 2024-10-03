//Este código sirve para, dada una lista de 20 numeros random, segun la opción que eligas resalte con [] los multiplos de 5 o 7

import java.util.Scanner; //Se importa la libreria para poder hacer uso correcto del código

public class Codigo6 {
	  public static void main(String[] args) { //Se crea el método main 
		    int[] n = new int[20]; //se agrego el new para crear bien el arreglo 

		    for (int i = 0; i < 20; i++) {//Se agrega el i++ 
		      n[i] = (int)(Math.random() * 381) + 20;
		      System.out.print(n[i] + " ");//se completa la función con .out
		    }
		
		    System.out.println("\n¿Qué números quiere resaltar? "); //Se completa el println 
		    System.out.print("(1 – los múltiplos de 5 \n 2 – los múltiplos de 7): "); //Se mejora la sintaxis del print
		    Scanner in = new Scanner(System.in);
		    int opcion = in.nextInt() ; //Se sustituye por el método Scanner para que pueda funcionar correctamente el código y pueda leer la opción 

		    int multiplo = (opcion == 1)? 5 : 7; //Tenia los operadores al revés primero va el ? 

		    for (int e : n) { //el arreglo es de enteros, no de letras y se edita el nombre de foreach a for
		      if (e % multiplo == 0) { //Se edita la condición
		        System.out.print("[" + e + "] ");
		      }else { //Se cierra bien el if/else
		        System.out.print(e + " "); //Se corrige el out del system
		      }
		}//foreach
	  }//main
	}//class Codigo6
