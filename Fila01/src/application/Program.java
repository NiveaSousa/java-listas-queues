package application;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import entities.Contato;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Queue<Contato> contatos = new LinkedList<Contato>();
		int op = 0; 
		
		while(op!=3) {
			System.out.println("1. Inserir contato. \n2. Próximo contato. \n3. Sair");
			op = scan.nextInt();
			scan.nextLine();
			
			switch(op) {
			case 1:
				System.out.println("Nome: \n");
				String nome = scan.nextLine();
				System.out.println("Numero: \n");
				String numero = scan.nextLine();
				
				Contato cont = new Contato(nome, numero);
				contatos.add(cont);
				
			break;
			case 2:
				System.out.println("Próximo contatos: " + contatos.remove());
			break;
			}
		}
		scan.close();
		
	}

}
