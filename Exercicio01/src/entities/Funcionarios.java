package entities;

public class Funcionarios {
	private String nome;
	private float salario;
	private int id;
	
	public Funcionarios(String nome, float salario, int id) {
		this.nome = nome;
		this.salario = salario;
		this.id = id;
				
		}
	
	public void aumento(float n_salario, float porcent) {
		
		n_salario = this.salario * porcent;
		this.salario = n_salario;
	}
	
	@Override
	public String toString() {
		return "Id: "+ this.id + "| Nome: " + this.nome +  "| Salario: " + this.salario;
	}
	
	
	}