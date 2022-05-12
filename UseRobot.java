/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 9: Clases Abstractas e Interfaces
*/

import java.util.Scanner;

public class UseRobot implements MegatronCook{
	Scanner text = new Scanner(System.in);
	public UseRobot(int comOpc){
		switch(comOpc){
		case 1:
			BreakfestManager(comOpc);
			break;
		case 2:
			FoodManager(comOpc);
			break;
		case 3:
			DinnerManager(comOpc);
			break;
		}
		
	}
	
	private void BreakfestManager(int num){
		int opc;
		do{
			OpcBreakfest();
			opc=text.nextInt();
		}while(opc<1 || opc>3);
		Instrucciones(opc,num);
	}
	
	private void FoodManager(int num){
		int opc;
		do{
			OpcFood();
			opc=text.nextInt();
		}while(opc<1 || opc>3);
		Instrucciones(opc,num);
	}
	
	private void DinnerManager(int num){
		int opc;
		do{
			OpcDinner();
			opc=text.nextInt();
		}while(opc<1 || opc>3);
		Instrucciones(opc,num);
		
	}

	private void Instrucciones(int opc, int num) {
		int p1,o1;
		String names[]= new String []{"Breakfesty", "Foodie", "Dinner Time"};
		String names2[]= new String []{"Cuchillitos", "MegatronCook"};
		switch(opc){
			case 1: //Solo MegatronCook
				secuenciaStep();
				ChopMeat();
				ChopVegetables();
				Cook();
				Serve();
				gracias();
				RobotData.Displayer();
				break;
				
			case 2:	// (BreakFesty, Foodie, Dinner Time)
				System.out.println("Qué Quieres Que " + names[num-1] + " Haga?");
				System.out.println("1- Cocinar");
				p1=step(1);
				while(p1!=1){
					p1=step(1);
				}
				System.out.println("Que Robot Quieres Usar? ");
				do{
					System.out.println("1- Cuchillitos");
					System.out.println("2- MegatronCook");
					o1=text.nextInt();	
				}while(o1<1 || o1>2);
				if (o1==1){ // Cuchillitos 
					secuenciaCuchillitos(names2);
					SecuenciaMcAlt(names2);
				}
				else if (o1==2){// MegatronCook Primero
					SecuenciaMcAlt(names2);
					secuenciaCuchillitos(names2);
				}
				secuenciaStep();
				gracias();
				RobotData.Displayer();
				break;
				
			case 3: //Cuchillitos
				secuenciaCuchillitos(names2);
				System.out.println("Que Robot Quieres Usar? ");
				do{
					System.out.println("1- "  + names[num-1] );
					System.out.println("2- MegatronCook");
					o1=text.nextInt();	
				}while(o1<1 || o1>2);
				if (o1==1){ //(BreakFesty, Foodie, Dinner Time)
					System.out.println("Qué Quieres Que " + names[num-1] + " Haga?");
					System.out.println("1- Cocinar");
					p1=step(1);
					while(p1!=1){
						p1=step(1);
					}
					SecuenciaMcAlt(names2);
				}
				else if (o1==2){// MegatronCook Primero
					SecuenciaMcAlt(names2);
					System.out.println("Qué Quieres Que " + names[num-1] + " Haga?");
					System.out.println("1- Cocinar");
					p1=step(1);
					while(p1!=1){
						p1=step(1);
					}
					
				}
				secuenciaStep();
				gracias();
				RobotData.Displayer();
				break;		
		}
	}
	private void OpcDinner(){
		System.out.println("Un Robot A Usar: ");
		System.out.println("1- MegatronCook ");
		System.out.println("2- DinnerTime ");
		System.out.println("3- Cuchillitos ");
	}
	
	private void OpcBreakfest(){
		System.out.println("Un Robot A Usar: ");
		System.out.println("1- MegatronCook ");
		System.out.println("2- Breakfesty ");
		System.out.println("3- Cuchillitos ");
	}
	
	private void OpcFood(){
		System.out.println("Un Robot A Usar: ");
		System.out.println("1- MegatronCook ");
		System.out.println("2- Foodie ");
		System.out.println("3- Cuchillitos ");
	}
	
	private int step(int i){
		int p;
		System.out.print("Paso " + i + ": "  ); p=text.nextInt(); 
		return p;
	}
	
	private void secuenciaStep(){
		int p1,p2,p3;
		System.out.println("Introduce La Secuencia En La Que Quieres \nQue Se Realicen Los Pasos");
		System.out.println("1- Preparar Ingredientes");
		System.out.println("2- Cocinar");
		System.out.println("3- Servir");
		p1=step(1);
		p2=step(2);
		p3=step(3);
		while(p1!=1 || p2!=2 || p3!=3){
			System.out.println("Error, La Secuencia De Pasos No Es Valida");
			p1=step(1);
			p2=step(2);
			p3=step(3);
		}
	}
	
	private void secuenciaCuchillitos(String names2[]){
		int p1,p2;
		System.out.println("Qué Quieres Que " + names2[0] + " Haga? " );
		System.out.println("1- Cortar Carne ");
		System.out.println("2- Picar Vegetales ");
		System.out.println("En Qué Orden Quieres Que Haga Los Pasos? ");
		p1=step(1);
		p2=step(2);
		while((p1!=1 && p2!=2) && (p1!=2 && p2!=1) ){
			System.out.println("Error, Números No Validos");
			p1=step(1);
			p2=step(2);
		}
	}

	
	private void SecuenciaMcAlt(String names2[]){
		int p1;
		System.out.println("Qué Quieres Que " + names2[1] + " Haga? " );
		System.out.println("1- Servir El Platillo ");
		p1=step(1);
		while(p1!=1){
			System.out.println("Error, Número No Valido");
			p1=step(1);
		}
	}
	
	public void gracias(){
		System.out.println("¡Magnifico! El platillo estaba delicioso\n");
	}

	@Override
	public void Cook() {
		System.out.println("Cocicnando*");
		
	}

	@Override
	public void Serve() {
		System.out.println("Sirviendo El Platillo* ");
		
	}

	@Override
	public void ChopMeat() {
		System.out.println("Cortando La Carne* ");
		
	}

	@Override
	public void ChopVegetables() {
		System.out.println("Picando Los Vegetales* ");
		
	}
	
}
