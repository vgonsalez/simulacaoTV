
public class TV {
	private int canal;
	private String modelo;
	private boolean ligada;
	private int volume;
	
	public TV(int canal, String modelo, boolean ligada, int volume) {
		this.canal = canal;
		this.modelo = modelo;
		this.ligada = ligada;
		this.volume = volume;
	}
	
	public void aumentarVolume() {
		this.volume = this.volume + 1;
	}
	
	public void diminuirVolume() {
		this.volume = this.volume - 1;
	}
	
	public void ligar(){
		this.ligada=true;
	}
	
	public void desligar(){
		this.ligada=false;
	}
	
	public void aumentarCanal(){
		this.canal = this.canal + 1;
	}
	
	public void diminuirCanal(){
		this.canal = this.canal - 1;
	}

	public String getModelo() {
		return modelo;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getCanal(){
		return canal; 
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public void modificarCanal(int canal){
		this.canal = canal;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
}
