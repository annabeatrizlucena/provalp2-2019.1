package simulal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimulalTest {

	Simulal simulal = new Simulal();

	@Test
	void cadastraCachorro() {
		assertEquals(1, simulal.cadastrarCachorroFilhote());

	}

	@Test
	void cadastraElefante() {
		assertEquals(1, simulal.cadastrarElefanteFilhote());
		assertEquals(2, simulal.cadastrarElefanteFilhote());

	}

	@Test
	void cadastrarMorcego() {
		assertEquals(1, simulal.cadastrarElefanteFilhote());
		assertEquals(2, simulal.cadastrarElefanteFilhote());
		assertEquals(3, simulal.cadastrarMorcegoFilhote());
	}

	@Test
	void toStringAnimais() {
		assertEquals(1, simulal.cadastrarCachorroFilhote());
		assertEquals("CAO 1 - 0.4 kg - 0 - P", simulal.exibirAnimal(1));
	}

	@Test
	void excecao() {
		assertThrows(IllegalArgumentException.class, () -> {
			simulal.exibirAnimal(10);
		});
	}

	@Test
	void testeCrescimento() {
		simulal.cadastrarCachorroFilhote();
		simulal.crescerAnimal(1);
		assertEquals(simulal.exibirAnimal(1), "CAO 1 - 1.1 kg - 1 - P");
	}

	@Test
	void testeCrescimentoElefante() {
		simulal.cadastrarElefanteFilhote();
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		simulal.crescerAnimal(1);
		assertEquals(simulal.exibirAnimal(1), "FANTE 1 - 5120.0 kg - 20 - G");
		simulal.crescerAnimal(1);
		assertEquals(simulal.exibirAnimal(1), "FANTE 1 - 5370.0 kg - 21 - G");
		simulal.crescerAnimal(1);
		assertEquals(simulal.exibirAnimal(1), "FANTE 1 - 5370.0 kg - 22 - G");
	}

	@Test
	void crescerMorcego() {
		simulal.cadastrarMorcegoFilhote();
		simulal.crescerAnimal(1);
		assertEquals("BAT 1 - 0.004 kg - 1 - P", simulal.exibirAnimal(1));
	}

	@Test
	void crescerInvalido() {
		assertThrows(IllegalArgumentException.class, () -> {
			simulal.crescerAnimal(100);
		});

	}

// -------------------------------------- Testes de Remocao----------
	
	@Test
	void removeMaiorPeso() {
		simulal.cadastrarCachorroFilhote();
		simulal.cadastrarElefanteFilhote();
		simulal.cadastrarMorcegoFilhote();
		assertEquals(2, simulal.remover());
	}
	
	// em caso de empate no peso, remove o mais antigo
	@Test
	void removeMaiorPesoEmpate() {
		simulal.cadastrarCachorroFilhote();
		simulal.cadastrarElefanteFilhote();
		simulal.crescerAnimal(2);
		simulal.cadastrarMorcegoFilhote();
		simulal.cadastrarElefanteFilhote();
		simulal.cadastrarElefanteFilhote();
		simulal.cadastrarElefanteFilhote();
		assertEquals(2, simulal.remover());
		
	}
}
