package de_la_a_a_la_z;

import java.util.Scanner;

public class entrada {
	
	Scanner entrada=new Scanner(System.in);
	
	public entrada(){}
	
	public String leer(){
		String teclado = entrada.nextLine();
		return teclado;
	}
}
