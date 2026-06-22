package secao08_poo.application;

import secao08_poo.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProduct {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("========== Enter product data ========== ");
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();
        System.out.print("Enter product quantity: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);
        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int add = sc.nextInt();
        product.addProducts(add);
        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock:");
        int remove = sc.nextInt();
        product.removeProducts(remove);
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
