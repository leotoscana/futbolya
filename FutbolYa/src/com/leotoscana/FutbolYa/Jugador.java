package com.leotoscana.FutbolYa;

public class Jugador {
	private String nombre;
	private int ataque;
	private int defensa;
	private int gestacion;
	private int recuperacion;
	
	public Jugador() {
	}
	
	public Jugador(String nombre,int ataque,int defensa,int gestacion,int recuperacion) {
		this.nombre = nombre;
		this.ataque = ataque;
		this.defensa = defensa;
		this.gestacion = gestacion;
		this.recuperacion = recuperacion;
	}
	
}
