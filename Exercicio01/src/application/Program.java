package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Funcionarios> lista_func = new ArrayList<>();
		int quant;
		int id = 1;
		
		System.out.println("Número de funcionários: ");
		quant = scan.nextInt();
		
		for(int x = 0; x < quant; x++) {
			System.out.println("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.println("Salario: ");
			float salario = scan.nextFloat();
			
			
			Funcionarios func = new Funcionarios(nome, salario, id);
			lista_func.add(func);
			id++;
		}
		
		System.out.println(lista_func);
		
		scan.close();
	}
}