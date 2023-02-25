package application;

import java.util.Comparator;
import entities.Pacientes;

public class PctComparator implements Comparator<Pacientes> {
	public int compare(Pacientes p1, Pacientes p2) {
		if (p1.getUrgencia() < p2.getUrgencia())
			return -1;
		else if (p1.getUrgencia() > p2.getUrgencia())
			return 1;
		return 0;
	}
}
