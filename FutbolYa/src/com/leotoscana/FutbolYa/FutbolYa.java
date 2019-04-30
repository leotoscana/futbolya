package com.leotoscana.FutbolYa;

import java.util.Scanner;

public class FutbolYa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc=0;
		Scanner menu=new Scanner(System.in);
		Equipo team=new Equipo();
		
		while (opc==0) {
			System.out.print("Menu principal\n");
			System.out.print("Ingrese por teclado el numero de opcion que desea\n");
			System.out.print("1-Ingresar Equipo\n");
			System.out.print("2-Ver porcentajes de ataque\n");
			System.out.print("3-Ver porcentajes de defensa\n");
			System.out.print("4-Ver porcentajes de defensa\n");
			System.out.print("5-Ver porcentajes de gestacion\n");
			System.out.print("6-Ver porcentajes completo de zonas\n");
			System.out.print("7-Salir\n");
			opc=menu.nextInt();
			
			switch (opc){
			case 1:
				System.out.print("Ingrese nombre del equipo: ");
				team.setNombre(menu.next());
				System.out.print("Ingrese gestos de ataque ");
				team.miGesto(team.getAtaque());
				System.out.print("Ingrese gestos de defensa ");
				team.miGesto(team.getDefensa());
				System.out.print("Ingrese gestos de recuperacion ");
				team.miGesto(team.getRecuperacion());
				System.out.print("Ingrese gestos de gestacion ");
				team.miGesto(team.getGestacion());
				System.out.println("Desea volver al menu?\n"+"0-Si   1-No");
				opc=menu.nextInt();
				break;
			case 2:
				System.out.println("Porcentajes de ataque:\n");
				team.pGesto(team.getAtaque());
				System.out.println("Desea volver al menu?\n"+"0-Si   1-No");
				opc=menu.nextInt();
				break;
			case 3:
				System.out.println("Porcentajes de defensa:\n");
				team.pGesto(team.getDefensa());
				System.out.println("Desea volver al menu?\n"+"0-Si   1-No");
				opc=menu.nextInt();
				break;
			case 4:
				System.out.println("Porcentajes de recuperacion:\n");
				team.pGesto(team.getRecuperacion());
				System.out.println("Desea volver al menu?\n"+"0-Si   1-No");
				opc=menu.nextInt();
				break;
			case 5:
				System.out.println("Porcentajes de gestacion:\n");
				team.pGesto(team.getGestacion());
				System.out.println("Desea volver al menu?\n"+"0-Si   1-No");
				opc=menu.nextInt();
				break;
			case 6:
				System.out.print("Porcentajes de ataque:");
				team.prGesto(team.getAtaque());
				System.out.print("Porcentajes de defensa:");
				team.prGesto(team.getDefensa());
				System.out.print("Porcentajes de recuperacion:");
				team.prGesto(team.getRecuperacion());
				System.out.print("Porcentajes de gestacion:");
				team.prGesto(team.getGestacion());
				System.out.println("Desea volver al menu?\n"+"0-Si   1-No");
				opc=menu.nextInt();
				break;
			case 7:
				break;
			}
		}
		
		
	}
}
