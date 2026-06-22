package secao08_poo.entities;

public class Product {

    // Atributos
    private String name;
    private double price;
    private int quantity;

    // Construtor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    /*
    Não temos o setQuantity, porque em um sistema de verdade a quantidade só pode
    ser alterada por meio das operações entrada ou saída do estoque.
    */

    // Métodos
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", Price: $" + String.format("%.2f", price)
                + ", Quantity: " + quantity
                + " units, Total: $"
                + String.format("%.2f", totalValueInStock());
    }
}
