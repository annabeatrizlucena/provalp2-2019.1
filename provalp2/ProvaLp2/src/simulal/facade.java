package simulal;
public class facade {
    
	Simulal simulal = new Simulal();
	
	public int cadastrarCachorroFilhote() {
		return simulal.cadastrarCachorroFilhote();
		
	}
	public int cadastrarElefanteFilhote() {
		return simulal.cadastrarElefanteFilhote();
		
	}
	public int cadastrarMorcegoFilhote() {
		return simulal.cadastrarMorcegoFilhote();
		
	}
	public String exibirAnimal(int id) {
		return simulal.exibirAnimal(id);
		
		
	}
	public void crescer(int id) {
		simulal.crescerAnimal(id);
	}
	
	// Nao terminei
    public void configurarRemocao(String estrategia) {
    	
    }
    
    public int remover() {
    	return 0;
    }
	
 	
	

}
