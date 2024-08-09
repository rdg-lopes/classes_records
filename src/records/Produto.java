package records;

public record Produto(int codigo, String nome, Double preco) {

	public int codigo() {
		return this.codigo;
	}

	public String nome() {
		return this.nome;
	}

	public Double preco() {
		return this.preco;
	}
}
