package application;


import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import entities.Pacientes;


public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue<Pacientes> fila_atend = new PriorityQueue<Pacientes>(new PctComparator());
		int op = 0;
		

		while(op!=6) {
		System.out.println("1. Inserir \n2. Chamar da lista \n3.Verificar fila \n4. Verificar próximo paciente\n5. Quantos faltam");
		op = scan.nextInt();
		scan.nextLine();
		switch(op) {
		case 1:
			System.out.println("Nome: \n");
			String nome = scan.nextLine();
			System.out.println("Especialidade: \n");
			String espec = scan.nextLine();
			System.out.println("Nivel de Urgência: 1. Urgente 2. Normal\n");
			int urg = scan.nextInt();
			Pacientes pct = new Pacientes(nome, espec, urg);
			fila_atend.add(pct);


		break;
		case 2:
			System.out.println("Chamar paciente: " + fila_atend.remove());
		break;
		case 3:
			for(Pacientes pac: fila_atend) {
				System.out.println(pac);
			}
		break;
		case 4:
			System.out.println("Próximo paciente: " + fila_atend.peek());
		break;
		case 5:
			System.out.println("Quantidade de pacientes: " + fila_atend.size());
		break;
				
		}
				

		}
		
		scan.close();
	}
}
