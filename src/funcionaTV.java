//import java.util.Scanner;

public class funcionaTV {

	public static void main(String[] args) {
			
		TV TVdaSala = new TV(135, "LG", true, 20);
		
		System.out.println("Canal: " + TVdaSala.getCanal());
		System.out.println("Modelo: " + TVdaSala.getModelo());
		System.out.println("Ligada: " + TVdaSala.isLigada());
		System.out.println("Volume: " + TVdaSala.getVolume());

		TV TVdoQuarto = new TV(500, "Samsung", false, 0);
		
		
		System.out.println("\n");
		System.out.println("Canal: " + TVdoQuarto.getCanal());
		System.out.println("Modelo: " + TVdoQuarto.getModelo());
		TVdoQuarto.setModelo("Philco");
		System.out.println("Modelo alterado para: " + TVdoQuarto.getModelo());
		System.out.println("Ligada: " + TVdoQuarto.isLigada());
		System.out.println("Volume: " + TVdoQuarto.getVolume());

		
		
		
	}
	

}
