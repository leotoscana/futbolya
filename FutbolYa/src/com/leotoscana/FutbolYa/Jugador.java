package com.leotoscana.FutbolYa;

import java.util.Scanner;

public class Jugador {
	private String nombre;
	private int[][] ataque = new int[4][4];
	private int[][] defensa= new int[4][4];
	private int[][] gestacion= new int[4][4];
	private int[][] recuperacion= new int[4][4];
	
	public Jugador() {
	}
	
	public Jugador(String nombre,int[][] ataque,int[][] defensa,int[][] gestacion,int[][] recuperacion) {
		this.nombre = nombre;
		this.ataque = ataque;
		this.defensa = defensa;
		this.gestacion = gestacion;
		this.recuperacion = recuperacion;
	}
	
	public void miGesto(int[][] gesto) {
		for (int cont=0;cont < 4;cont++) {
			for (int e=0;e < 4;e++) {
				System.out.println("Inserte valor");
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
	
}
