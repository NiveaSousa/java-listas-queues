package entities;

public class Pacientes { 
	private String nome;
	private String especialidade;
	private int urgencia;
	
	public Pacientes(String NOME, String ESPECIALIDADE, int URGENCIA) {
		this.nome = NOME;
		this.especialidade = ESPECIALIDADE;	
		this.urgencia = URGENCIA;		
				
	}
	
	public int getUrgencia() {
		return urgencia;
	}

	public void setUrgencia(int urgencia) {
		this.urgencia = urgencia;
	}

	@Override
	public String toString() {
		return "Nome: "+ this.nome + "| Especialidade: " + this.especialidade;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
		
}

