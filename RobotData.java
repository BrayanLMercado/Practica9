/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 9: Clases Abstractas e Interfaces
*/

public class RobotData {
	
	private static void Battery(){
		System.out.println("Batería Restante: " + (int)(25 + Math.random()*75) + "%");
	}
	
	private static void ID(){
		StringBuilder Id= new StringBuilder();
		String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";
		for (int m = 0; m < 6; m++) { 
            int indice = (int)(string.length() * Math.random()); 
            Id.append(string.charAt(indice)); 
		}
		System.out.println("ID del Robot: " + Id.toString());
	}
	
	private static void name(int IdNom){
		String Name [] = new String [] {"MegatronCook", "Cuchillitos" , "Breakfesty", "Foodie", "Dinner Time"};
		System.out.println("Nombre Del Robot: " + Name[IdNom]);
	}
	
	
	private static void dataDisplay(int name, int action){
		name(name);
		ID();
		Battery();
		blank();
	}
	
	private static void blank(){
		System.out.println();
	}
	
	public static void Displayer(){
		for (int i=0;i<5;i++){
			dataDisplay(i,i);
			
		}
	}
	
}
