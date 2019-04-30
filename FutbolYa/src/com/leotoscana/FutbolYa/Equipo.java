package com.leotoscana.FutbolYa;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Equipo {
	
	private String nombre;
	private int[][] ataque = new int[4][4];
	private int[][] defensa= new int[4][4];
	private int[][] gestacion= new int[4][4];
	private int[][] recuperacion= new int[4][4];
	private ArrayList<Jugador> misJugadores;

	
	public Equipo(){
		}
	
	public Equipo(String nombre,int[][] ataque,int[][] defensa,int[][] gestacion,int[][] recuperacion) {
		this.nombre=nombre;
		this.ataque=ataque;
		this.defensa=defensa;
		this.gestacion=gestacion;
		this.recuperacion=recuperacion;
	}
	
	public Equipo(String nombre,ArrayList<Jugador> misJugadores) {
		this.nombre = nombre;
		this.misJugadores =  new ArrayList<Jugador>();
		for (Jugador i:misJugadores) {
			for (int cont=0;cont < 4;cont++) {
				for (int e=0;e < 4;e++) {
					this.ataque[cont][e] = this.ataque[cont][e] + i.getAtaque()[cont][e];
				}
			}
			for (int cont=0;cont < 4;cont++) {
				for (int e=0;e < 4;e++) {
					this.defensa[cont][e] = this.defensa[cont][e] + i.getDefensa()[cont][e];
				}
			}
			for (int cont=0;cont < 4;cont++) {
				for (int e=0;e < 4;e++) {
					this.gestacion[cont][e] = this.gestacion[cont][e] + i.getGestacion()[cont][e];
				}
			}
			for (int cont=0;cont < 4;cont++) {
				for (int e=0;e < 4;e++) {
					this.recuperacion[cont][e] = this.recuperacion[cont][e] + i.getRecuperacion()[cont][e];
				}
			}
		}
	}
	public void verGesto(int[][] gesto) {
		for (int cont=0;cont < 4;cont++) {
			String m="";
			for (int e=0;e < 4;e++) {
				m=m+" "+gesto[cont][e];
			}
			System.out.println(m);
		}
	}
	
	public void pGesto(int[][] gesto) {
		float t=0;
		DecimalFormat dec=new DecimalFormat("#.#");
		for (int cont=0;cont < 4;cont++) {
			for (int e=0;e < 4;e++) {
				t = t + gesto[cont][e];
			}
		}
		for (int cont=0;cont < 4;cont++) {
			String m="";
			float p;
			for (int e=0;e < 4;e++) {
				p=((gesto[cont][e]*100)/t);
				m=m+" %"+dec.format(p);
			}
			System.out.println(m);
		}
	}
	
	public void prGesto(int[][] gesto) {
		float t=0;
		String m="";
		float[] zonaP=new float[4];
		DecimalFormat dec=new DecimalFormat("#.#");
		for (int cont=0;cont < 4;cont++) {
			float p=0;
			for (int e=0;e < 4;e++) {
				t = t + gesto[cont][e];
				p = p + gesto[cont][e];
			}
			zonaP[cont]=p;
		}
		for (float i:zonaP) {
			m=m+" %"+dec.format(((i*100)/t));
		}
		System.out.println(m);
	}
	
	public void miGesto(int[][] gesto) {
		int zona=1;
		for (int cont=0;cont < 4;cont++) {
			for (int e=0;e < 4;e++) {
				System.out.println("zona "+(zona++)+":");
				Scanner leer=new Scanner(System.in);
				gesto[cont][e] = leer.nextInt();
			}
		}
	}

	public String  getNombre() {return nombre;}
	public void    setNombre(String nombre) {this.nombre = nombre;}

	public int[][] getAtaque() {return ataque;}
	public void    setAtaque(int[][] ataque) {this.ataque = ataque;}

	public int[][] getDefensa() {return defensa;}
	public void    setDefensa(int[][] defensa) {this.defensa = defensa;}

	public int[][] getGestacion() {return gestacion;}
	public void    setGestacion(int[][] gestacion) {this.gestacion = gestacion;}

	public int[][] getRecuperacion() {return recuperacion;}
	public void    setRecuperacion(int[][] recuperacion) {this.recuperacion = recuperacion;}

	public ArrayList<Jugador> getMisJugadores() {return misJugadores;}
	public void    setMisJugadores(ArrayList<Jugador> misJugadores) {this.misJugadores = misJugadores;}
	
}
