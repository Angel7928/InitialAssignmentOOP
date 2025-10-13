package InitialAssignmentOOP.model;

public class Order {
    String code;
    String product;
    int quantity;
    double unitPrice;

    public Order(String code, String product, int quantity, double unitPrice) {
        this.code = code;
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public double calculateAmount() {
        double amount = quantity * unitPrice;
        return amount;
    }
    public void showSummary() {
        System.out.println("Order Code: " + code);
        System.out.println("Product: " + product);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Amount: " + calculateAmount());
        System.out.println("-------------------------");
    }
}
