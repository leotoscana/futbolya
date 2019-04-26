package com.leotoscana.FutbolYa;

import java.util.ArrayList;

public class FutbolYa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador player1;
		Jugador player2;
		Jugador player3;
		Equipo team;
		
		player1=new Jugador();
		player1.miGesto(player1.getAtaque());
		System.out.println("ok");
		player2=new Jugador();
		player2.miGesto(player2.getAtaque());
		System.out.println("ok");
		player3=new Jugador();
		player3.miGesto(player3.getAtaque());
		System.out.println("ok");
		
		ArrayList<Jugador> misJugadores=new ArrayList<Jugador>();
		misJugadores.add(player1);
		misJugadores.add(player2);
		misJugadores.add(player3);
		team=new Equipo("Union",misJugadores);
		team.verGesto(team.getAtaque());
		team.pGesto(team.getAtaque());
		team.prGesto(team.getAtaque());
	}
}
