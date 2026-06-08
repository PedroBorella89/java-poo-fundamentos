package secao08_poo.application;

import secao08_poo.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProduct {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product1 = new Product();
        System.out.println("========== Enter product data ========== ");
        System.out.print("Enter product name: ");
        product1.name = sc.nextLine();
        System.out.print("Enter product price: ");
        product1.price = sc.nextDouble();
        System.out.print("Enter product quantity: ");
        product1.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product1);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product1.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product1);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock:");
        quantity = sc.nextInt();
        product1.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product1);

        sc.close();

    }
}
