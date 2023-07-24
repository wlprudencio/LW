package br.com.livraria.controle;

public class Controle_Teste_Livraria {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		Editora editora1 = new Editora();
		Copia copia1 = new Copia();
		Categoria categoria1 = new Categoria();
		Autor autor1 = new Autor();
		Nacionalidade nacionalidade1 = new Nacionalidade();
		
		livro1.setAno(2001);
		livro1.setIsbn("01");
		livro1.setTitulo("Faça valer cada segundo");
		
		System.out.println("ANO DO LIVRO " + livro1.getAno());
		System.out.println("ISBN: "        + livro1.getIsbn());
		System.out.println("TITULO: "      + livro1.getTitulo());
		
		System.out.println();
		
		editora1.setNome("Viva");
		editora1.setCodigo("0909");
		System.out.println("NOME DO EDITOR: "  + editora1.getNome());
		System.out.println("CODIGO DO LIVRO: " + editora1.getCodigo());
		
		System.out.println();
		
		copia1.setCodigo(123);
		copia1.setPreco(33.5);
		System.out.println("COD DE COPIA: " + copia1.getCodigo());
		System.out.println("PRECO: "        + copia1.getPreco());
		
		System.out.println();
		
		categoria1.setCodigo(01);
		categoria1.setDescricao("Disciplina");
		categoria1.setAno(2001);
		categoria1.setIsbn("01");
		categoria1.setTitulo("Faça valer");
		
		System.out.println("COD DA CATEGORIA: "    + categoria1.getCodigo());
		System.out.println("DES DA CATEGORIA: "    + categoria1.getDescricao());
		System.out.println("ANO DA CATEGORIA: "    + categoria1.getAno());
		System.out.println("ISBN DA CATEGORIA: "   + categoria1.getIsbn());
		System.out.println("TITULO DA CATEGORIA: " + categoria1.getTitulo());
		
		System.out.println();
	
		autor1.setNome("Mike Ross");
		System.out.println("MEU AUTOR: " + autor1.getNome());
		
		System.out.println();
		
		nacionalidade1.setNome("BRASILEIRA");
		System.out.println("NACIONALIDADE: " + nacionalidade1.getNome());
				
	

	}

}
