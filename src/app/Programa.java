package app;

import java.sql.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Programa {
	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> produtos = new ArrayList<>();
		
		System.out.printf("Entre com o número de produtos: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Comum, Usado ou Importado (c/u/i)?: ");
			String opc = sc.next();
			sc.nextLine();
			
			System.out.printf("Nome: ");
			String nome = sc.nextLine();
			System.out.printf("Preço: ");
			double preco = sc.nextDouble();
			
			if (opc.equals("c")) {
				Produto produtoComum = new Produto(nome, preco);
				produtos.add(produtoComum);
				
			}else if(opc.equals("u")) {
				System.out.printf("Data de fabricação (DD/MM/YYYY): ");
				Date dataFabricao = sdf.parse(sc.next());
				ProdutoUsado produtoUsado = new ProdutoUsado(nome, preco, dataFabricao);
				produtos.add(produtoUsado);
				
			}else if(opc.equals("i")) {
				System.out.printf("Taxa Alfândega: ");
				double taxaAlfandega = sc.nextDouble();
				ProdutoImportado produtoImportado = new ProdutoImportado(nome, preco, taxaAlfandega);
				produtos.add(produtoImportado);
			}
		}
		
		System.out.println("TAGS DE PREÇO");
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}
