package com.leotoscana.FutbolYa;
import java.util.ArrayList;

public class Equipo {
	
	private String nombre;
	private int ataque;
	private int defensa;
	private int gestacion;
	private int recuperacion;
	private ArrayList<Jugador> jugador;
	
	public Equipo(){
		}
	
	public Equipo(String nombre,int ataque,int defensa,int gestacion,int recuperacion,ArrayList<Jugador> jugador) {
		this.nombre = nombre;
		this.ataque = ataque;
		this.defensa = defensa;
		this.gestacion = gestacion;
		this.recuperacion = recuperacion;
		this.jugador =  new ArrayList<Jugador>();
	}
	
	

}
