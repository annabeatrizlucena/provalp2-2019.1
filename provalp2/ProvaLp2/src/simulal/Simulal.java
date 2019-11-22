package simulal;

import java.util.LinkedHashMap;
import java.util.Map;

public class Simulal {

	Map <Integer, Animal> animais;
	int quantidadeCadastros;
	public Simulal() {
		this.animais = new LinkedHashMap<>();
		this.quantidadeCadastros = 0;
	}
	
	public int cadastrarCachorroFilhote() {
		quantidadeCadastros++;
		animais.put(quantidadeCadastros, new Cachorro(quantidadeCadastros));
		return quantidadeCadastros;
		
	}
	public int cadastrarElefanteFilhote() {
		quantidadeCadastros++;
		animais.put(quantidadeCadastros, new Elefante(quantidadeCadastros));
		return quantidadeCadastros;
		
	}
	public int cadastrarMorcegoFilhote() {
		quantidadeCadastros++;
		animais.put(quantidadeCadastros, new Morcego(quantidadeCadastros));
		return quantidadeCadastros;
		
	}
	public String exibirAnimal(int id) {
		if (!animais.containsKey(id)) {
			throw new IllegalArgumentException("Id invalido");
		}
		return animais.get(id).toString();
		
		
	}

	public void crescerAnimal(int id) {
		if (!animais.containsKey(id)) {
			throw new IllegalArgumentException("Id invalido");
		}
		animais.get(id).crescer();
		
	}
public void configurarRemocao(String estrategia) {
    	
    }
    
    public int remover() {
    	return 0;
    }
	
}
