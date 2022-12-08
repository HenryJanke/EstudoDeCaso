package controle;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
	List<Produtos> cadastro = new ArrayList<>();

	public void adicionar(Produtos cp) {
		List<Produtos> produtos;
		produtos.add(cp);
	}

	public void listaProdutos() {
		produtos.forEach((p) -> {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Modelo: " + p.getModelo());
			System.out.println("Tamanho: " + p.getTamanho());
			System.out.println("Preço: " + p.getPreco());
			System.out.println("-----------------------------");
		});
	}
}
