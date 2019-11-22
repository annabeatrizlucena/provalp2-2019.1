package simulal;

public class Morcego extends AnimalAbstrato{
	
public Morcego(int id) {
	this.peso = 0.002;
	this.tamanho = "P";
	this.tipo = "BAT";
	this.id = id;
	
}
public void crescer() {
peso += 0.002;
idade++;
}
}
