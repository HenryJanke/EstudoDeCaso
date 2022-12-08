package controle;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPrincipal {

	public static void main(String[] args) {
		try (Scanner dados = new Scanner(System.in); Scanner dados1 = new Scanner(System.in)) {
			try (Scanner dados2 = new Scanner(System.in); Scanner dados3 = new Scanner(System.in)) {
				Produtos c1 = new Produtos();

				String nome = "";
				String modelo = "";
				String tamanho = "";
				double preco = 0;

				System.out.println(
						"Opçoes\n 1-Cadastrar produto\n 2-Remover produto\n 3-Verificar produto\n 4-Dinheiro\n");
				int numopc = 0;
				System.out.print("nº: ");

				numopc = dados.nextInt();

				while (numopc == 1) {

					switch (numopc) {

					case 1:
						System.out.println("Nome do produto: ");
						nome = dados1.nextLine();
						c1.setNome(nome);

						System.out.println("Modelo: ");
						modelo = dados2.nextLine();
						c1.setModelo(modelo);

						System.out.println("Tamanho: ");
						tamanho = dados3.nextLine();
						c1.setTamanho(tamanho);

						System.out.println("Preço: ");
						preco = dados.nextDouble();
						c1.setPreco(preco);

						System.out.println("\n Cadastrar mais produtos?\n  1-Sim\n  0-Não\n");
						numopc = dados.nextInt();
						break;

					case 2:
						
						break;

					}

				}
				System.out.println(c1.Produtos.toString());
			}
		}
	}

}
