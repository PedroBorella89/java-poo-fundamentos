package secao12_enumeracao.application;

import secao12_enumeracao.entities.Client;
import secao12_enumeracao.entities.Order;
import secao12_enumeracao.entities.OrderItem;
import secao12_enumeracao.entities.Product;
import secao12_enumeracao.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramOrder {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("===== Enter client data =====");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());
        Client client = new Client(name, email, birthDate);

        System.out.println();
        System.out.println("===== Enter order data =====");
        System.out.print("Status: ");
        String status = sc.nextLine();
        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        System.out.println();
        System.out.print("How many items to this order? ");
        int items = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < items; i++) {
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            sc.nextLine();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            order.addItem(orderItem);
            System.out.println();
        }

        System.out.println(order);

        sc.close();
    }
}
