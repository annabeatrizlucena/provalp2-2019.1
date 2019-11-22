package simulal;

import java.util.Comparator;

public class OrdenaAnimalPeso implements Comparator<Animal> {

	public int compare(Animal a1, Animal a2) {
		if (a1.getPeso() - a2.getPeso() == 0) {
			return a1.compareTo(a2);
		}
		return (int) (a1.getPeso() - a2.getPeso());
	}

	

	

}
