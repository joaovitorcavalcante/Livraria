package livraria;

public class CadastroDeLivros {
	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.nome = "Java 8 Prático!";
		livro.descricao = "Novos recursos da linguagem!";
		livro.valor = 59.90;
		livro.isbn = "987-87-66250-46-6";
		
		Autor autor	= new Autor();
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigo.turini@caelum.com.br";
		autor.cpf = "123.456.789.10";

		
		livro.mostrarDetalhe();
	}
}
