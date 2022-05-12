/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 9: Clases Abstractas e Interfaces
*/

import java.util.Scanner;

public class Menu {
	Scanner input= new Scanner(System.in);
	public Menu(){
		menu();
	}
	
	private void menu(){
		int opc;
		do{
			System.out.println("Selecciona Una Opción");
			System.out.println("1- Desayunos");
			System.out.println("2- Comidas");
			System.out.println("3- Cenas");
			opc=input.nextInt();
		}while(opc<1 && opc>3);
		
		switch (opc){
			case 1:
				Desayuno();
				break;
			case 2:
				Comida();
				break;
			case 3:
				Cena();
				break;
		}
	}
	
	private void Desayuno(){
		int opc;
		do{
			System.out.println("Selecciona Un Desayuno");
			System.out.println("1- Chilaquiles");
			System.out.println("2- Huevos Rancheros");
			System.out.println("3- Hot Cakes Con Tocino");
			System.out.println("4- Pan Frances Con Tocino");
			System.out.println("5- Huevos Divorciados");
			System.out.println("6- Huevos Tiernos");
			opc=input.nextInt();
		}while(opc<1 && opc>6);
		UseRobot R1= new UseRobot(1);
	}
	
	private void Comida(){
		int opc;
		do{
			System.out.println("Selecciona Una Comida");
			System.out.println("1- Hamburguesa Con Papas");
			System.out.println("2- Hamburguesa Doble Con Papas");
			System.out.println("3- Chicken Fries");
			System.out.println("4- Aros De Cebollas Con Carne");
			System.out.println("5- Orden De Papas Fritas Con Carne");
			opc=input.nextInt();
		}while(opc<1 && opc>5);
		UseRobot R1= new UseRobot(2);
	}
	
	private void Cena(){
		int opc;
		do{
			System.out.println("Selecciona Una Platillo Para Cenar");
			System.out.println("1- Ensalada De Pollo");
			System.out.println("2- Sandwich de Jamón ");
			opc=input.nextInt();
		}while(opc<1 && opc>2);
		UseRobot R1= new UseRobot(3);
	}

}
