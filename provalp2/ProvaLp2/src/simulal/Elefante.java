package simulal;

public class Elefante extends AnimalAbstrato {

	public Elefante(int id) {
		this.peso = 120;
		this.tamanho = "G";
		this.tipo = "FANTE";
		this.id = id;
	}
	
	public void crescer() {
		if(idade<= 20) {
			peso+= 250;
		}
		idade++;
	}

}
