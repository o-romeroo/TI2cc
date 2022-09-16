package modelo;

public class usuario{
	private int codigo;
	private String login;
	private String senha;
	private String sexo;
	
	public usuario() {
		this.login = "";
		this.senha = "";
		this.sexo = "";
		this.codigo = -1;
	}
	
	public usuario(int codigo, String login, String senha, String sexo) {
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
		this.sexo = sexo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", login=" + login + ", senha=" + senha + ", sexo=" + sexo + "]";
	}
}
