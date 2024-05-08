package listas;

public class GestaoLivraria {

	static VetorD livros = new VetorD();

	private String titulo;
	private String autor;
	private int preco;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "GestaoLivraria [titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
	}

	public static void adicionarLivro(String titulo, String autor, int preco) {
		GestaoLivraria livro = new GestaoLivraria();
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setPreco(preco);

		livros.adiciona(livro);
	}

	public static void removerLivro(String titulo) {
		if(livros.contem(titulo)) {

			for(int i = 0; i < livros.tamanho(); i++) {
				GestaoLivraria livro = (GestaoLivraria) livros.pega(i);
				if(livro.getTitulo()==titulo) {
					livros.remove(i);
				}
			}
		}else {
			System.out.println("Não foi encontrado este titúlo");
		}
	}

	public static VetorD consularLivroPorAutor(String autor) {
		if(livros.contem(autor)) {

			VetorD livrosPortAutor = new VetorD();
			
			for(int i = 0; i < livros.tamanho(); i++) {
				GestaoLivraria livro = (GestaoLivraria) livros.pega(i);
				if(livro.getAutor()==autor) {
					livrosPortAutor.adiciona(livro);
				}
			}
			
			return livrosPortAutor;
		
		}else {
			System.out.println("Não foi encontrado este autor");
			return null;
		}
		
		
	}

	public static void main(String[] args) {

		GestaoLivraria.adicionarLivro("Dom quixote", "Iago", 100);
		GestaoLivraria.adicionarLivro("O pequeno principe", "Iago", 100);
		GestaoLivraria.adicionarLivro("Harry Potter", "J.K", 100);
		System.out.println(livros);
		//GestaoLivraria.removerLivro("Dom quixote");
		//System.out.println(livros);
		System.out.println(GestaoLivraria.consularLivroPorAutor("Iago"));
		
	}	
}
