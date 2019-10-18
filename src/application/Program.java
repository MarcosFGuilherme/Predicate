package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		showProduct(list);
		//Remover todos os produtos com preco superior a 100.00
		//list.removeIf(p->p.getPrice() >= 100.0);
		//list.removeIf(new ProductPredicate());
		//list.removeIf(Product::staticProductPredicate);
		//list.removeIf(Product::nonStaticProductPredicate);
		double min = 100.0;
		Predicate<Product> pred = p -> p.getPrice() >= min;
		list.removeIf(pred);
		showProduct(list);
	}
	public static void showProduct(List<Product> list) {
		list.sort((p1,p2)-> p1.getPrice().compareTo(p2.getPrice()));
		for (Product p : list) {
			System.out.println(p);
		}
		System.out.println();
	}
}
