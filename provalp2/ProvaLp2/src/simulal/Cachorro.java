package simulal;

public class Cachorro extends AnimalAbstrato{
	public Cachorro(int id) {
		this.peso = 0.4;
		this.tamanho = "P";
		this.tipo = "CAO";
		this.id = id;
		
	}
	public void crescer() {
		peso += 0.7;
		idade++;
		if(idade >10) {
			this.tamanho = "M";
		}
	}
	

}
