package model;

public class Cliente {
	private String idVenda;
	private String nomeCliente;
	private String cpfCliente;
	private String dataNasc;
	private String telefone;
	private String endereco;
	private String email;
	
	
	public Cliente(String idVenda, String nomeCliente, String cpfCliente, String dataNasc, String telefone,
			String endereco, String email) {
		super();
		this.idVenda = idVenda;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
	}
	public Cliente() {
		super();
	}
	public String getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(String idVenda) {
		this.idVenda = idVenda;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
