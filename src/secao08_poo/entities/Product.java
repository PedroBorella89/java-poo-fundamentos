package secao08_poo.entities;

public class Product {

    // Atributos
    public String name;
    public double price;
    public int quantity;

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
