package InitialAssignmentOOP.main;

import InitialAssignmentOOP.model.Order;

public class mainOrders {
    public static void main(String[] args) {
        Order order1 = new Order("OD001", "Mechanical Keyboard", 3, 49.99);
        Order order2 = new Order("OD002", "Computer Screen", 1, 199.99);
        Order order3 = new Order("OD003", "Gaming mouse", 5, 49.99);

        order1.showSummary();
        order2.showSummary();
        order3.showSummary();

        double totalPrice = order1.calculateAmount() + order2.calculateAmount() + order3.calculateAmount();
        System.out.printf("Total price of all orders: %.2f", totalPrice);
    }
}
