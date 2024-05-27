package com.sasec4;

import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 { //no apostrofes

	public static void main(String[] args) {//agregamos el main
		Scanner sc = new Scanner(System.in);//agregamos system in y cambiamos s por sc
        //cambiamos byte y douable por string
	    HashMap<String, String> capitales = new HashMap<>();//cambiamos ca por capitales

	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador","El Salvador");//agregué el dato faltante (aunque no sé cual es la capital de vdd jaja)
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   
	    String pais = "";//agregué una r a sting y cambie c por pais
	    do {
	      System.out.print("Escribe el nombre de un país y te diré su capital: ");//cambie in por out
	      pais = sc.nextDouble();
	      
	      if (!pais.equals("salir")) {//agregué una s a equal
	        if (capitales.containsValue(pais)) {
	          System.out.print("La capital de " + pais+" es " + capitales.get(pais));//cambié un get y pusimos todo en un solo system 
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + pais + "?: ");
	          String capital = sc.nextLine();
	          capitales.put(pais, capital);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    } while (!pais.equals("salir"));//agregamos parentesis y agregamos una h 
	  }

	}

}}