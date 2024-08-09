package records;

public class Exemplo1 {

	public static void main(String[] args) {
		
	    Cor cor = new Cor(1, "Azul");
	    System.out.println(cor.codigo());
	    System.out.println(cor.nome());
	    
	    Produto produto = new Produto(1, "Notebook", 3000.0);
	    System.out.println(produto.codigo());
	    System.out.println(produto.nome());
	    
	    User user = new User(1, "Fulano");
	    System.out.println(user.id());
	    System.out.println(user.nome());
	    
	    record Tipo(int id, String nome) {}
	    Tipo tipo = new Tipo(1, "Tipo 1");
	    System.out.println(tipo.id());
	    System.out.println(tipo.nome());
	    
	    Tipo tipo2 = new Tipo(1, "Tipo 1");
	    System.out.println(tipo.equals(tipo2));
	    
	    
	}
	
}
