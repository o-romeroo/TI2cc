package maven.demo;

public class Aplicação {
	private int inserir;
	private int listar;
	private int atualizar;
	private int excluir;
	private int sair;
	
	public Aplicação() {
		this.inserir = 1;
		this.listar = 2;
		this.atualizar = 3;
		this.excluir = 4;
		this.sair = 5;
	}
	
	public Aplicação(int inserir, int listar, int atualizar, int excluir, int sair) {
		this.inserir = inserir;
		this.listar = listar;
		this.atualizar = atualizar;
		this.excluir = excluir;
		this.sair = sair;
	}
}
