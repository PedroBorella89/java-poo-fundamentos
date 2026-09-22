package secao13_herança_e_polimorfismo.application;

import secao13_herança_e_polimorfismo.entities.ImportedProduct;
import secao13_herança_e_polimorfismo.entities.Product;
import secao13_herança_e_polimorfismo.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProgramProduct {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.print("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (ch == 'i' || ch == 'I') {
                System.out.print("Customs fee: ");
                Double fee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, fee));
            }
            else if (ch == 'u' || ch == 'U') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                products.add(new UsedProduct(name, price, manufactureDate));
            }
            else {
                products.add(new Product(name, price));
            }
        }

        for (Product p : products) {
            System.out.println();
            System.out.println("===== PRICE TAGS =====");
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
