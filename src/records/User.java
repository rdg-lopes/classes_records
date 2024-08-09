package records;

public record User (Integer id, String nome) {
	
	public User {
		if (id == null) {
			throw new IllegalArgumentException("id não pode ser nulo");
		}
		if (nome == null) {
			throw new IllegalArgumentException("nome não pode ser nulo");
		}
	}
	
	public Integer id() {
		return this.id;
	}
	
	public String nome() {
		return this.nome;
	}
	
}
