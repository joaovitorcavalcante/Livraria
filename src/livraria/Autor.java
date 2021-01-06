package livraria;

public class Autor {
	String nome;
	String cpf;
	String email;
	
	void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do autor ");
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		System.out.println("CPF: " + this.cpf);
	}
}
