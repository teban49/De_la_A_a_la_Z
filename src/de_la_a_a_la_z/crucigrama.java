package de_la_a_a_la_z;

import java.awt.EventQueue;

public class crucigrama {
	
	private int level;
	private int lives;
	public entrada tec=new entrada();
	private String respuesta;
	graficos frame = new graficos();
	
	public crucigrama(){}
	
	public void iniciarJuego(){
		level=0;
		lives=5;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {		
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		primeraPregunta();
	}
	
	public void nextLevel(){
		if(level==1){
			segundaPregunta();
		}else if(level==2){
			terceraPregunta();
		}else if(level==3){
			cuartaPregunta();
		}else{
			ganaste();
		}
	}
	
	public void ganaste(){
		System.out.println("  1        ");
		System.out.println("  s        ");
		System.out.println("2pentagono");
		System.out.println("  s    4  ");
		System.out.println(" 3escaleno");
		System.out.println("  n    v  ");
		System.out.println("  t    e  ");
		System.out.println("  a    r  ");
		System.out.println("       e  ");
		System.out.println("       s  ");
		System.out.println("       t  ");
		System.out.println("/n");
		System.out.println("Ganaste!!!");
		System.exit(0);
	}
	
	public void perdiste(){
		System.out.println("Perdiste, suerte para la proxima");
		System.exit(0);
	}
	
	public void primeraPregunta(){
		do{
			System.out.println("Tienes "+lives+" vidas");
			System.out.println("  1        ");
			System.out.println("  ⧠        ");
			System.out.println("2⧠⧠⧠⧠⧠⧠⧠⧠⧠");
			System.out.println("  ⧠     4  ");
			System.out.println(" 3⧠⧠⧠⧠⧠⧠⧠⧠");
			System.out.println("  ⧠     ⧠  ");
			System.out.println("  ⧠     ⧠  ");
			System.out.println("  ⧠     ⧠  ");
			System.out.println("        ⧠  ");
			System.out.println("        ⧠  ");
			System.out.println("        ⧠  ");
			System.out.println("1. Cuantos minutos tiene una hora?");
			respuesta=tec.leer();
			if(respuesta.equals("sesenta")){
				level++;
				nextLevel();
			}else{
				lives--;
			}
		}while(lives!=0);
		perdiste();
	}
	
	public void segundaPregunta(){
		do{
			System.out.println("Tienes "+lives+" vidas");
			System.out.println("  1        ");
			System.out.println("  s        ");
			System.out.println("2⧠e⧠⧠⧠⧠⧠⧠⧠");
			System.out.println("  s     4  ");
			System.out.println(" 3e⧠⧠⧠⧠⧠⧠⧠");
			System.out.println("  n     ⧠  ");
			System.out.println("  t     ⧠  ");
			System.out.println("  a     ⧠  ");
			System.out.println("        ⧠  ");
			System.out.println("        ⧠  ");
			System.out.println("        ⧠  ");
			frame.segundaImagen();
			System.out.println("2. Que poligono tiene cinco lados?");
			respuesta=tec.leer();
			if(respuesta.equals("pentagono")){
				level++;
				nextLevel();
			}else{
				lives--;
			}
		}while(lives!=0);
		perdiste();
	}
	
	public void terceraPregunta(){
		do{
			System.out.println("Tienes "+lives+" vidas");
			System.out.println("  1        ");
			System.out.println("  s        ");
			System.out.println("2pentagono");
			System.out.println("  s     4  ");
			System.out.println(" 3e⧠⧠⧠⧠⧠⧠⧠");
			System.out.println("  n     ⧠  ");
			System.out.println("  t     ⧠  ");
			System.out.println("  a     ⧠  ");
			System.out.println("        ⧠  ");
			System.out.println("        ⧠  ");
			System.out.println("        ⧠  ");
			System.out.println("3. Cual es el triangulo de tres lados desiguales?");
			respuesta=tec.leer();
			if(respuesta.equals("escaleno")){
				level++;
				nextLevel();
			}else{
				lives--;
			}
		}while(lives!=0);
		perdiste();
	}
	
	public void cuartaPregunta(){
		do{
			System.out.println("Tienes "+lives+" vidas");
			System.out.println("  1        ");
			System.out.println("  s        ");
			System.out.println("2pentagono");
			System.out.println("  s    4  ");
			System.out.println(" 3escaleno");
			System.out.println("  n    ⧠  ");
			System.out.println("  t    ⧠  ");
			System.out.println("  a    ⧠  ");
			System.out.println("       ⧠  ");
			System.out.println("       ⧠  ");
			System.out.println("       ⧠  ");
			System.out.println("4. Cual es el monte mas alto del mundo?");
			respuesta=tec.leer();
			if(respuesta.equals("everest")){
				level++;
				nextLevel();
			}else{
				lives--;
			}
		}while(lives!=0);
		perdiste();
	}
	/*System.out.println("  1       ");
	System.out.println("  s       ");
	System.out.println("2pentagono");
	System.out.println("  s    4  ");
	System.out.println(" 3escaleno");
	System.out.println("  n    v  ");
	System.out.println("  t    e  ");
	System.out.println("  a    r  ");
	System.out.println("       e  ");
	System.out.println("       s  ");
	System.out.println("       t  ");*/
}
