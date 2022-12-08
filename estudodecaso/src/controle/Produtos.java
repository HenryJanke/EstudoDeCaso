package controle;

public class Produtos {

	private String nome;
	private String modelo;
	private String tamanho;
	private double preco;
	public Object Produtos;

	public String getNome() {
		return nome;
	}

	public String getModelo() {
		return modelo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public double getPreco() {
		return preco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
