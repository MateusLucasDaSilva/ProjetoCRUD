package principal;

import br.edu.br.agenda.colecao.ColecaoCategoria;
import br.edu.ifba.agenda.basicas.Categoria;

public class Principal {
	
	public static void main(String[] args) {
		
		ColecaoCategoria cj = new ColecaoCategoria();
		/**Categoria c = new Categoria ("Teste2");
		cj.adicionarCategoria(c);*/
		
		/**Categoria c1 = new Categoria (1, "AMIGOS");
		cj.atualizarCategoria(c1);*/
		
		/**Categoria c2 = new Categoria (4);
		cj.deletarCategoria(c2);*/
		
		
		cj.listarCategoria();;
	}

}
