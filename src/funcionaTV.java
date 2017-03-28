//import java.util.Scanner;

public class funcionaTV {

	public static void main(String[] args) {
			
		TV TVdoQuarto = new TV(500, "Samsung", false, 0);
		
		System.out.println("Canal: " + TVdoQuarto.getCanal());
		System.out.println("Modelo: " + TVdoQuarto.getModelo());
		TVdoQuarto.setModelo("Philco");
		System.out.println("Modelo alterado para: " + TVdoQuarto.getModelo());
		System.out.println("Ligada: " + TVdoQuarto.isLigada());
		System.out.println("Volume: " + TVdoQuarto.getVolume());

		ControleRemoto controle = new ControleRemoto(TVdoQuarto);
		
		controle.ligarTV();
		System.out.println("Controle remoto - tv está ligada? " + TVdoQuarto.isLigada());
		controle.desligarTV();
		System.out.println("Controle remoto - tv está ligada? " + TVdoQuarto.isLigada());
		controle.irParaCanal(36);
		System.out.println("Controle remoto - canal da tv é " + TVdoQuarto.getCanal());
	}
	

}
